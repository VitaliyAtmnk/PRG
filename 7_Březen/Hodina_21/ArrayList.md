# ArrayList v Javě

- `ArrayList` v Javě je dynamická datová struktura, která umožňuje ukládat prvky v podobě seznamu a podle potřeby měnit jeho velikost. 
- Na rozdíl od pole (`Array`) není u `ArrayList` pevně stanovena velikost – při přidávání prvků se automaticky zvětšuje a naopak při mazání zmenšuje.

---


## Deklarace a Vytvoření `ArrayList`
- Import třídy `ArrayList`
- Třída `ArrayList` se nachází v balíčku `java.util`, proto je nutné provést import:


```java
import java.util.ArrayList;
```

### Deklarace


- Pro vytvoření `ArrayList` je třeba použít generické typy (tzv. *generics*), které udávají datový typ uložených prvků.

- Značí se pomocí `<>` za slovem `ArrayList`.

**Příklad:**


```java
ArrayList<String> slova;
ArrayList<Integer> cisla; // nelze napsat int do <>
```


### Inicializace (vytvoření instance)


- Pomocí klíčového slova `new` vytvoříme nový `ArrayList`.

**Příklad:**


```java
ArrayList<String> slova = new ArrayList<>();
ArrayList<Integer> cisla = new ArrayList<>();
```


> **Poznámka:**  Od Javy 7 lze v ostrých závorkách `< >` při vytváření ArrayListu vynechat typ (tzv. *diamond operator*). Kompilátor jej určí automaticky.
---

Přidávání prvků do `ArrayList`
Metoda `add()`

- Pro vložení nového prvku do `ArrayList` použijeme metodu `add()`.

- Vložený prvek **musí** odpovídat datovému typu, který jsme zadali při deklaraci.

**Příklad:**


```java
ArrayList<String> slova = new ArrayList<>();
slova.add("Ahoj");
slova.add("Svět");
slova.add("Java");
```

### Přidání s určením indexu

- Lze také zadat index, na který se nový prvek vloží. Ostatní prvky se posunou.

**Příklad:**

```java
slova.add(1, "Programování");
// Nyní bude "Programování" na indexu 1
```

---

Přístup k prvkům `ArrayList`
Metoda `get()`

- Pro získání hodnoty na určitém indexu použijeme metodu `get(index)`.

**Příklad:**

```java
ArrayList<String> slova = new ArrayList<>();
slova.add("Ahoj");
slova.add("Svět");

String prvniSlovo = slova.get(0); 
System.out.println(prvniSlovo); // Výstup: Ahoj
```

Metoda `set()`

- Pro změnu prvku na určitém indexu použijeme metodu `set(index, novaHodnota)`.

**Příklad:**


```java
slova.set(1, "Všichni");
System.out.println(slova.get(1)); // Výstup: Všichni
```

---

Odstraňování prvků z `ArrayList`
Metoda `remove()`

- Pro odstranění prvku můžeme použít metodu `remove()` buď s indexem, nebo přímo s objektovou hodnotou.

**Příklad – odstranění podle indexu:**

```java
ArrayList<String> slova = new ArrayList<>();
slova.add("Ahoj");
slova.add("Svět");
slova.add("Java");

slova.remove(1); 
// Odstraní prvek na indexu 1 ("Svět")
```

**Příklad – odstranění podle hodnoty:**


```java
slova.remove("Java"); 
// Pokusí se odstranit "Java", pokud existuje v seznamu
```

---
Velikost `ArrayList`
Metoda `size()`

- K získání velikosti (počtu prvků) slouží metoda `size()`.
- Na rozdíl od polí (kde používáme `length`) je zde nutné volat metodu.

**Příklad:**


```java
System.out.println("Počet prvků: " + slova.size());
```
---


Procházení `ArrayList`
Pomocí `for` cyklu

- Podobně jako u polí můžeme využít klasický `for` cyklus, ale voláme `size()` namísto `length`.

**Příklad:**

```java
for (int i = 0; i < slova.size(); i++) {
    System.out.println("Prvek na indexu " + i + ": " + slova.get(i));
}
```

Pomocí rozšířeného `for` cyklu (*for-each*)
- Rozšířený cyklus `for` je jednoduchý a pohodlný pro procházení všech prvků.
**Příklad:**


```java
for (String slovo : slova) {
    System.out.println("Hodnota: " + slovo);
}
```

---


Třídění `ArrayList`
Pomocí `Collections.sort()`

- Pro setřídění prvků využijeme třídu `Collections` a její metodu `sort()`.

**Příklad:**

```java
import java.util.ArrayList;
import java.util.Collections;

ArrayList<Integer> cisla = new ArrayList<>();
cisla.add(5);
cisla.add(3);
cisla.add(8);
cisla.add(1);

Collections.sort(cisla);
System.out.println(cisla); // Výstup: [1, 3, 5, 8]
```

- K dispozici je také `Collections.reverse()` pro seřazení v opačném pořadí či `Collections.sort()` s vlastním komparátorem (Podrobněji na zaměření).
---

Převod mezi polem a `ArrayList`

1. **Pole -> `ArrayList`**

```java
String[] pole = {"Ahoj", "Svět"};
ArrayList<String> list = new ArrayList<>(Arrays.asList(pole));
```

2. **`ArrayList` -> Pole**

```java
String[] novePole = list.toArray(new String[0]);
// Pro primitivní typy (int, double, ...) postup komplikuje autoboxing/unboxing
```

---


### Rozdíly mezi `Array` a `ArrayList`

1. **Velikost:**

- `Array` má pevnou velikost danou při inicializaci.

- `ArrayList` se dokáže dynamicky zvětšovat nebo zmenšovat.

2. **Přístup k prvkům:**

- `Array` používá k přístupu [] a indexy a má vlastnost `.length`.

- `ArrayList` používá metody `get(index)` a `size()`.

3. **Metody pro manipulaci:**

- `Array` umožňuje pouze přímou manipulaci s indexy.

- `ArrayList` nabízí řadu užitečných metod (`add()`, `remove()`, `clear()`, `contains()`, …).

4. **Typ elementů:**

- `Array` může obsahovat jak primitivní datové typy (`int`, `double`, …), tak objekty.

- `ArrayList` může přímo uchovávat jen objekty (např. `Integer`, `Double`), pro primitivní typy dochází k *autoboxingu* (převod `int` -> `Integer`).

---

## Shrnutí

1. **`ArrayList`**  je dynamická datová struktura, která umožňuje přidávat a mazat prvky bez nutnosti starat se o kapacitu.

2. K **přístupu k prvkům**  slouží metody `get()` a `set()`, velikost lze zjistit pomocí `size()`.

3. Pro **iteraci**  lze využít klasický `for`, rozšířený *for-each* cyklus nebo `Iterator`.

4. K **třídění**  slouží `Collections.sort()`.

5. Při práci s **primitivními typy**  v `ArrayList` probíhá *autoboxing* a *unboxing*.

6. **`ArrayList`**  je vhodný v případech, kdy potřebujeme často měnit velikost seznamu; pokud chceme pracovat se stále stejným počtem prvků, vystačíme si se statickým polem (`Array`).
