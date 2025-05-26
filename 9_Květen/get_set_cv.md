# Zapouzdření

### Shrnutí z hodiny

- Cílem zapouzdření je „schovat“ `atributy` před uživatelem mimo třídu, abychom měli větší kontrolu nad jejich správou
- uživateli (v tomto případě je uživatel člověk, co by se třídou pracoval) poskytneme sadu metod, které mohou hodnotu vrátit, nebo ji nastavit
- tyto metody se nazývají
    - `getter`, vrátí hodnotu
    - `setter`, nastaví hodnotu

#### Jak zapouzdřit atribut

- schováte atribut pomocí klíčového slova `private`
    - příklad: `private double polomer`

#### Getter

```java
public double getPolomer() {
    return polomer;
}
```

- `public` -> uživatel má k metodě přístup odkudkoliv v kódu
- `double` -> stejný datový typ jako atribut, který chceme vrátit
- `getPolomer` -> Název metody může být libovolný, ale nejčastěji ve tvaru `getNazevAtributu`

#### Setter

```java
public void setPolomer(double polomer) {
    // pokud je zadaný poloměr menší než 0, metoda skončí
    if (polomer < 0.0) {
        return; // metoda zde skončí, a další řádky metody se neprovedou
    }
    // this.polomer je poloměr našeho objektu, poloměr je hodnota předaná v setteru
    this.polomer = polomer;
}
```

- `public` -> uživatel má k metodě přístup odkudkoliv v kódu
- `void` -> setter nevrací hodnotu, pouze ji nastaví
    - (alternativně lze vracet `boolean`)
        - `true` -> atribut se nastavil (vstup byl platný)
        - `false` -> atribut se nenastavil (vstup nebyl platný (záporný poloměr))
- `setPolomer(double polomer)`
    - `setPolomer` -> název metody, může být libovolný, ale nejčastěji ve tvaru `setNazevMetody`
    - `double polomer` -> datový typ a název parametru, který chceme od uživatele
---
### Celý příklad

```java
public class Kruznice {
    private double polomer;

    public double getPolomer() {
        return polomer;
    }
    
    public void setPolomer(double polomer){
        if(polomer < 0.0) {
            return;
        }
        
        this.polomer = polomer;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Kruznice kruznice = new Kruznice(); // vytvoření prázdného objektu

        kruznice.setPolomer(-7.5); // Hodnota předaná setteru je neplatná => nenastaví se

        kruznice.setPolomer(12.7);
        double polomerKruznice = kruznice.getPolomer();

        // Vypíše se: Hodnota polomeru kruznice je: 12.7
        System.out.println("Hodnota polomeru kruznice je: " + polomerKruznice);
    }
}
```


---
## Příklady na procvičení

> - U příkladu jsou vypsány jen atributy a cílem je správně atributy zapouzdřit s pomocí getteru a setteru
> - Můžete si do třídy přidat libovolné metody, které uznáte za vhodné, nebo třídu rozšířit o libovolné atributy

### Třída `Znamka`

- Reprezentuje jednu známku žáka v libovolném předmětu.
- Zajistěte, že lze nastavit jen platné známky (1, 2, 3, 4, 5)
- Název předmětu může být libovolný
- Cílem je zapouzdřit atributy (správně použijte `public/private` a vytvořte gettery a settery)

#### Atributy
- hodnota
- nazevPredmetu

---

### Třída `Predmet`

- Reprezentuje jeden předmět se jménem, poškozením a obranou ve hře
- Zamyslete se nad možnými omezeními jednotlivých hodnot předmětu
  - Může být poškození záporné, pokud ano, co by to znamenalo pro hru?
  - Může být obrana záporná?

#### Atributy
- jmeno
- poskozeni
- obrana