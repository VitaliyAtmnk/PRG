## 1. Co je konstruktor?


Konstruktor je speciální metoda, která se volá při vytvoření instance (objektu) třídy. Jeho hlavním úkolem je inicializace objektu – nastavit počáteční hodnoty jeho atributů a provést další potřebná nastavení.


- **Specifika konstruktoru:**

    - Má stejný název jako třída.

    - Nemá návratový typ (ani `void`).

    - Volá se automaticky při použití operátoru `new`.

    - Pokud konstruktor explicitně neuvedete, Java pro třídu vytvoří implicitní bezparametrický konstruktor.

---



## 2. Syntaxe konstruktoru


Základní syntaxe konstruktoru vypadá takto:



```java
public class Osoba {
    // Atributy třídy
    private String jmeno;
    private int vek;

    // Konstruktor třídy Osoba
    public Osoba(String jmenoVstup, int vekVstup) {
        jmeno = jmenoVstup;
        vek = vekVstup;
    }
}
```


V tomto příkladu:


- Konstruktor `Osoba(String jmenoVstup, int vekVstup)` přijímá dva parametry a nastavuje příslušné atributy.

- Abychom nemuseli vymýšlet různé názvy pro argumenty a atributy, existuje klíčové slovo `this`. `this` se používá pro odlišení instance proměnných od lokálních parametrů.


```java
public class Osoba {
    // Atributy třídy
    private String jmeno;
    private int vek;

    public Osoba(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }
}
```

---



## 3. Přetížení konstruktorů


Java umožňuje definovat více konstruktorů v jedné třídě. Každý konstruktor se liší počtem a typem parametrů (tj. má odlišnou signaturu).


### Příklad přetížených konstruktorů:



```java
public class Osoba {
    private String jmeno;
    private int vek;

    // Bezparametrický konstruktor
    public Osoba() {
        this("Neznámé jméno", 0); // Volání konstruktoru s parametry pomocí 'this'
    }

    // Konstruktor s jedním parametrem
    public Osoba(String jmeno) {
        this(jmeno, 0);
    }

    // Konstruktor s dvěma parametry
    public Osoba(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }
    
    public void vypisInfo() {
        System.out.println("Jméno: " + jmeno + ", Věk: " + vek);
    }
    
    public static void main(String[] args) {
        Osoba o1 = new Osoba();
        Osoba o2 = new Osoba("Karel");
        Osoba o3 = new Osoba("Marie", 25);
        
        o1.vypisInfo();
        o2.vypisInfo();
        o3.vypisInfo();
    }
}
```


- První konstruktor neobsahuje žádné parametry a volá konstruktor s parametry, čímž zajišťuje defaultní hodnoty.

- Druhý konstruktor nastavuje pouze jméno, zatímco věk zůstává výchozí (0).

- Třetí konstruktor nastavuje obě hodnoty.



---


4. Volání konstruktorů – klíčové slovo `this`
   Pomocí `this()` lze volat jiný konstruktor zevnitř konstruktoru, což usnadňuje kód a zabraňuje duplicitě inicializační logiky.

- **Poznámka:**  Volání `this()` musí být vždy prvním příkazem v konstruktoru.



---



## 5. Další důležité poznámky


- **Implicitní konstruktor:**  Pokud žádný konstruktor explicitně nenapíšete, Java vytvoří výchozí bezparametrický konstruktor, který ale neprovádí žádnou specifickou inicializaci.

- **Konstruktor vs. metoda:**  Konstruktor se liší od běžné metody tím, že nemá návratový typ a jeho účelem je vytvoření a inicializace objektu.

- **Chaining:**  Díky volání pomocí `this()` lze vytvořit tzv. "constructor chaining", kde jeden konstruktor deleguje inicializační práci jinému konstruktoru ve stejné třídě.



---



## Shrnutí


2. **Konstruktor**  je speciální metoda používaná k inicializaci objektu při jeho vytvoření.

4. Má **stejný název jako třída**  a **žádný návratový typ** .

6. Lze je **přetěžovat**  (více konstruktorů se stejným názvem, ale různými parametry).

8. Klíčové slovo `this()` umožňuje **volání jiného konstruktoru**  a usnadňuje správu inicializační logiky.

10. Pokud konstruktor nepíšete, je automaticky vytvořen **implicitní bezparametrický konstruktor** .