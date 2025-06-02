# Dědičnost

![](https://media2.dev.to/dynamic/image/width=800%2Cheight=%2Cfit=scale-down%2Cgravity=auto%2Cformat=auto/https%3A%2F%2Fdev-to-uploads.s3.amazonaws.com%2Fuploads%2Farticles%2Fbe780pnhc1i6ybjluhfh.png)

- Jaké společné vlastnosti mají pes a kočka?

---

### Definice

Dědičnost je vlastnost OOP (objektově orientovaného programování), která umožňuje vytvořit **novou třídu** (tzv.
*potomka*) na základě existující třídy (*rodiče*).     
Nová třída tak **přebírá vlastnosti a chování** rodičovské třídy a může je dále rozšiřovat nebo upravovat.
> Rodič v angličtině = Parent/Superclass    
> Potomek v angličtině = Child/Subclass

![Obrázek dědičnosti](https://cdn-images-1.medium.com/max/1080/1*gRily1Y6mlrOETJeKRgvgw.png)

---

### Jak napsat v kódu?

- Třída může dědit od jiné třídy pomocí klíčového slova **`extends`**

```java
class Rodic {
    // metody a atributy
}

class Potomek extends Rodic {
    // další metody a atributy
}
```

- Ve třídě `Potomek` můžeme použít všechny atributy a metody třídy `Rodič`
- Třída `Potomek` může mít své atributy a metody, které nebudou ve třídě `Rodič`
- Třída `Potomek` může vytvořit novou metodu se stejným názvem jako má třída `Rodič` a přepsat původní chování metody
    - Jedná se o `Method Overriding`
- Nedoporučuje se, ale lze vytvořit i atributy ve třídě `Potomek` se stejným názvem jako má třída `Rodič`.
    - Atribut v rodiči se tímto způsobem "schová" (Nedělejte to)

> Třída může mít maximálně jednoho přímého rodiče (můžeme dědit jen od jedné třídy)

### Příklady

reprezentace kočky a psa v kódu bez použití dědičnosti:

#### Bez dědičnosti

```java
class Dog {
    String name;
    int energy;


    void eat() {
        energy++;
    }

    void bark() {
        System.out.println("Haf haf");
    }
}

class Cat {
    String name;
    int energy;

    void eat() {
        energy++;
    }

    void meow() {
        System.out.println("Mňau");
    }
}

class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
```

#### S dědičností

```java
class Animal {
    public String name;
    public int energy;

    public void eat() {
        energy++;
    }

    public void makeNoise() {
        System.out.println("Make some noise");
    }
}

class Dog extends Animal {
    public String breed;
}

class Cat extends Animal {
}

class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.name = "Betsy";

        Dog d = new Dog();
        d.name = "Arnold";
        d.breed = "Zlatý retriever";
        d.eat();
    }
}
```

---

### Přepisování metod

- V dědičnosti máme možnost přepsat metodu rodiče
- Stačí vytvořit metodu v potomkovi se stejnou hlavičkou jako má rodič
- Abychom v kódu upozornili na přepisování existuje anotace `@Override`
    - Anotaci stačí napsat přímo nad hlavičku metody
    - Pokud bychom napsali @Override nad metodu, která není v rodiči a jen v potomkovi, tak by program vyhodil chybu
    - To nám může pomoct odhladit překlepy při přepisování metod, či jiné chyby

#### Příklad

```java
class Animal {
    public void makeNoise() {
        System.out.println("Make some noise");
    }
}

class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Haf haf");
    }
}

class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("Mňau");
    }
}

```

> V Javě každá třída automaticky dědí od třídy Object, pokud neurčí jiného rodiče.   
> Všechny třídy mají několik metod již vytvořených a lze je pomocí `@Override` přepsat    
> Můžeme přepsat metodu `toString` a jednoduše tisknout vlastní objekty na konzoli.
> Metoda `toString` vrátí objekt jako řetězec (defaultně vrací název objektu a adresu v paměti)

```java
public class Dog {
    String name;
    String breed;
    int age;

    @Override
    public String toString() {
        return name + ", plemeno: " + breed + ", věk: " + age;
    }
}
```

---

### Volání metod rodiče

- Pokud potomek přepíše metodu z rodiče, může se přesto rozhodnout zavolat i původní rodičovskou verzi.

- K tomu slouží klíčové slovo **`super`**.

- `super.názevMetody()` zavolá metodu z rodiče, i když ji potomek přepsal.

#### Příklad:

```java
class Animal {
    public void makeNoise() {
        System.out.println("Dělá nějaký zvuk");
    }
}

class Dog extends Animal {
    @Override
    public void makeNoise() {
        super.makeNoise(); // Zavolá metodu z třídy Animal
        System.out.println("Haf haf");
    }
}
```

**Výstup:**

```mathematica
Dělá nějaký zvuk  
Haf haf
```

---

### Modifikátor `protected`

- Modifikátor **`protected`** znamená, že:
- Atribut/metoda je **přístupná**:
    - ve **stejném balíčku** (package),
    - a také ve **všech potomcích**, i když jsou v jiném balíčku.
- Používá se často při dědičnosti, když chceme, aby potomek měl přístup k proměnným nebo metodám rodiče,  
  ale zároveň je nechceme úplně „odhalit“ jako `public`.

> kdybychom měli modifikátor `private` u atributů/metod rodiče, tak bychom je nemohli použít

#### Příklad:

```java
class Animal {
    protected int energy;

    protected void sleep() {
        energy += 10;
    }
}

class Cat extends Animal {
    public void relax() {
        sleep(); // metoda sleep je přístupná díky protected, ale nelze ji zavolat mimo třídu/package
    }
}
```

---

### Otázky

1. **Jaké klíčové slovo použiješ v Javě, aby třída dědila z jiné třídy?**

2. **Jaký je rozdíl mezi atributem `public` a `protected` v kontextu dědičnosti?**

3. **Co znamená přepsání metody (method overriding) a k čemu slouží anotace `@Override`?**

4. **Jaké jsou výhody použití dědičnosti oproti opakovanému kopírování kódu?**

5. **Co se stane, pokud vytvoříš v potomkovi atribut se stejným názvem jako má rodič?**

6. **Jak pomocí klíčového slova `super` zavoláš metodu z rodičovské třídy, která byla přepsána?**

7. **Jaká třída je implicitním (skrytým) rodičem všech tříd v Javě? Jaké metody dědíme automaticky?**

8. **Jak můžeš pomocí metody `toString()` upravit výpis objektu, aby dával smysl?

9. **Může jedna třída v Javě dědit od více tříd? Vysvětli proč.**

10. **Proč není vhodné označit atributy v rodiči jako `private`, pokud je chceme používat i v potomkovi?**

