### Shrnutí látky: **Dědičnost v Javě**

Dědičnost je klíčový princip objektově orientovaného programování, který umožňuje vytvořit novou třídu (*potomek*), která přebírá vlastnosti a metody z existující třídy (*rodič*).

#### Klíčové body:

-   Potomek dědí všechny `public` a `protected` atributy a metody rodiče.

-   Pomocí klíčového slova `extends` se určuje, od které třídy se dědí.

-   Potomek může:

    -   Přidat nové metody/atributy.

    -   Přepsat existující metody (`@Override`).

    -   Zavolat rodičovskou verzi přepsané metody pomocí `super`.

-   Klíčové slovo `protected` umožňuje přístup v potomcích, ale ne mimo balíček.

-   Všechny třídy implicitně dědí ze třídy `Object`.

-   Nelze dědit od více tříd současně.

-   Metoda `toString` je jednou z metod, které lze přepsat pro vlastní výpis objektů.


---

### Úkoly na procvičení

#### 1. Vozidla:

**Vytvoř třídu `Vehicle` s atributem `speed` a metodou `move()`, která vypíše „Vozidlo se pohybuje“.  
Vytvoř třídu `Car`, která dědí z `Vehicle`, a vyzkoušej volání metody `move()`.**

---

#### 2. Osoby:

**Vytvoř třídu `Person` s atributy `name` a `age` a metodou `introduce()`, která vypíše jméno a věk.  
Potom vytvoř třídu `Student`, která dědí z `Person` a přidá atribut `school`. Přepiš metodu `introduce()` tak, aby volala `introduce()` 
rodiče pomocí `super.introduce()` a následně vypsala název školy, na kterou chodí. Použij `@Override`.**
Vytvoři následně třídu `Teacher`, která dědí od Person a má atribut `String class`, reprezentující třídu, ve které učí.
---

#### 3. Grafika:

**Vytvoř třídu `Shape` s metodou `drawShape()`, která "vykreslí" do konzole objekt.  
Poté vytvoř třídy `Square` a `Triangle`, které dědí z `Shape`. Každá z nich přepíše `drawShape()` podle svého.**
`Square` bude mít atribut `int size` a `Triangle` bude mít `int height`.

```java
možné výstupy pro metody drawShape()

Shape s = new Shape();
s.drawShape();

Kreslím objekt...

Shape square = new Square();
square.size = 4;
square.drawShape();

****
****
****
****
        
nebo:
        
* * * *
*     *
*     *
* * * *

Shape triangle = new Triangle();
triangle.height = 5;
triangle.drawShape();

*
**
***
****
*****

nebo:

    *
   **
  ***
 ****
*****

nebo:

    *
   * *
  * * *
 * * * *
* * * * *
```
---
