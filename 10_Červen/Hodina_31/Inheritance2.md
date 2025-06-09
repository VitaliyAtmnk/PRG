# Dědičnost – pokročilé použití a práce spolem

---

## 1 Na co si dát pozor u dědičnosti

| ⚠️Problém                        | Vysvětlení                                                                                             | Jak tomu předejít                                                                                                            |
|----------------------------------|--------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------|
| **Nevolání konstruktoru rodiče** | Pokud rodič inicializuje důležité atributy, potomek je musí zavolat pomocí `super(...)`.               | Vždy definuj vhodný konstruktor vrodiči a vpotomkovi ho volej jako první příkaz.                                             |
| **Skrytí (shadowing) atributů**  | `String name` vrodiči a znovu `String name` vpotomkovi vede ke dvěma různým proměnným.                 | Nepoužívej stejné názvy atributů; přepiš je metodou `getName()` + `setName()` místo zdvojování.                              |
| **Omyly vpřepisování**           | Chybějící `@Override` nebo jiné parametry ⇒ metoda se **nepřepíše** ale jen **přetíží**.               | Přidej anotaci `@Override`, IDE případnou chybu zvýrazní.                                                                    |
| **`private` vs.`protected`**     | `private` členy nejsou vidět vpotomkovi; studenti pak sahají přímo do atributů → porušení zapouzdření. | Označ atributy `private` a poskytni **`protected` gettery/settery**.                                                         |
| **`final` třídy/metody**         | Nelze dál dědit ani přepisovat – to je v pořádku, ale musíš otom vědět.                                | Pokud potřebuješ nad třídou stavět, nesmí být `final`.                                                                       |
| **Kovariance polí (viz níže)**   | `Animal[]` může odkazovat na `Dog[]`, ale zápis kočky do psa vyhodí **`ArrayStoreException`**.         | Nesnaž se měnit typ uloženého objektu; používej generické kolekce (`ArrayList<Animal>`) – zatím si ale ukažme, co je špatně. |

---

## 2. Dědičnost apole vpraxi

### 2.1 Polymorfní pole

```java
public class Main{
   public static void main(String[] args) {

      Animal[] zoo = {
              new Dog("Rex"),
              new Cat("Micka"),
              new Dog("Azor")
      };

      for(Animal a :zoo){
          a.makeNoise(); // volá správnou přepsanou verzi podle skutečného typu
      }     
   }
}
```

**Výstup**

```
Haf haf
Mňau
Haf haf
```

> Díky polymorfismu nemusíme řešit, jaký konkrétní druh zvířete vpoli je – Java to zjistí až za běhu.

---

### 2.2 Kovariance polí

```java
Dog[] pejsci = new Dog[2];
Animal[] zvireciPole = pejsci;    // Vše ok

zvireciPole[0]=new Cat("Micka"); // Program skončí
```

1. Kompilátor povolí přiřazení (`Dog[]` → `Animal[]`).
2. Při zápisu objektu `Cat` nastane **běhová chyba**, protože fyzicky jde pořádo pole psů.

> 📝Závěr: **Nikdy nemíchej typy** v poli, které vzniklo jako konkrétní podtřída. Radši vytvoř nové pole správného typu
> nebo použij kolekce.

---


### 2.3 Pole a přepsané (`@Override`) metody

```java
Shape[] tvary = {
        new Rectangle(3, 4),
        new Circle(2)
};

double celkem = 0;
for (Shape s :tvary){
    celkem += s.getArea();
}
System.out.println("Celkový obsah: "+celkem);
```

Každý prvek vrátí svou **vlastní** implementaci `getArea()`.Pole tak umožní **jednotnézpracování různých tvarů**.

---

## 3Kompletní příklady

### 3.1 Malá ZOO

```java
abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Haf haf – jsem " + name);
    }

    public void fetchStick() {
        System.out.println(name + " aportuje klacek!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Mňau – jsem " + name);
    }
}

public class ZooDemo {
    public static void main(String[] args) {
        Animal[] zoo = {new Dog("Rex"), new Cat("Micka")};
        for (Animal a : zoo) a.makeNoise();
    }
}
```

---

### 3.2 Geometrické tvary asoučet plochy

```java
abstract class Shape {
    public abstract double getArea();
}

class Rectangle extends Shape {
    private double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double getArea() {
        return w * h;
    }
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}

class ShapesDemo {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(3, 4), new Circle(2)};
        double total = 0;
        for (Shape s : shapes) total += s.getArea();
        System.out.println("Celkový obsah: " + total);
    }
}
```

---

### 3.3 Hlídaná psů (ukázka chyby)

```java
Dog[] psi = {new Dog("Rex"), new Dog("Blesk")};
Animal[] zvireciPole = psi; // stále jde o Dog[]!

zvireciPole[1]= new Cat("Micka"); // Chyba!!
}
```

---


## 5 Shrnutí

* **Polymorfismus** dovoluje zpracovat různé potomky jednotně pomocí pole rodičovského typu.
* **Arrays jsou kovariantní** – dovolí přiřazení `Child[]` do `Parent[]`, což může vést k`Chybě`.
* Vždy kontroluj přepisování metod anotací **`@Override`** a nahraď opakující se atributy společným předkem.
* Pro flexibilnější práci se smíšenými objekty později využijeme **Generics** a kolekce `ArrayList<Super>`, které kovarianci
  řeší na úrovni překladače.

---

### Otázky k diskusi

1. Proč je při práci s polem vhodné volat metody (polymorfismus) místo přímého přístupu k atributům?
2. Kdy použít `protected` a kdy raději soukromé atributy s gettery/settery?
3. Jak bys předělal příklad se zvířaty, aby k běhové chybě nikdy nedošlo?
*
