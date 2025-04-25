# Příklady

## 1. Seznam filmů

### Cílem programu:

- Vytvořte program, který umožní uživateli zadat seznam filmů.
- Program bude načítat informace o jednotlivých filmech, zpracovávat je a následně zobrazovat přehledné informace,
  seřazený seznam a základní statistiky.

---

### Postup

- Základní verze programu načte jen 3 filmy
- načtěte od uživatele `jméno`, `délku v minutách`, `hodnocení` (int 1 až 5) a `rok vydání`
- Film bude reprezentován třídou.

```
Vstup:
Minecraft_Film 101 3 2025
Interstellar 169 5 2014
Pulp_Fiction 149 5 1994
```

```java
import java.util.Scanner;

/**
 * Třída slouží k načtení dat z konzole od uživatele
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SeznamFilmu seznamFilmu = new SeznamFilmu("Muj seznam");
        final int POCET_FILMU = 3;
        
        for (int i = 0; i < POCET_FILMU; i++) {

            String name = sc.next();
            double len = sc.nextDouble();
            int rating = sc.nextInt();
            int year = sc.nextInt();

            Film inputFilm = new Film(name, len, rating, year);

            seznamFilmu.addFilm(inputFilm);
        }
        seznamFilmu.printInfo();
    }
}

```

---

### Třída Film

#### Atributy

- String name
- double length
- int rating
- int yearOfRelease

#### Metody

- `public Film(...)` - konstruktor třídy Film

- `private String formatLength()` - metoda vrátí délku filmu, jakožto řetězec ve formátu `hh:mm` (105 minut -> `1:45`)

- `public void printInfo()` - vypíše informace o filmu v následujícím formátu:

    - `Název {Název filmu}, Délka {hh:mm} hodnocení {★ - ★★★★★} Rok vydání: {rokVydání}`

```java
// pro hezký výpis
System.out.printf("%-20s%-10s%-15s%-16d\n", name, formatLength(), "★".repeat(rating), year);

// pro další třídu
System.out.printf("%-20s%-10s%-15s%-15s\n","Jméno","Délka","Hodnocení","Rok vydání");
System.out.println("-".repeat(55));
...
System.out.println("-".repeat(55));
```

---

### Třída SeznamFilmu

#### Atributy

- String nazevSeznamu
- ArrayList\<Film> seznam

#### Metody

- `public SeznamFilmu(...)` - konstruktor - vytvoří nový prázdný seznam a přiřadí jméno k seznamu Filmu
- `public void printInfo()` - vypíše seznam všech filmu (na pořadí nezáleží) tak, že nad každým filmem zavolá printInfo
```java
Například:
  Název: - Minecraft_Film, Délka - 1:41, hodnocení ★★★, Rok vydání: 2025
  Název: - Interstellar, Délka - 2:49, hodnocení ★★★★★, Rok vydání: 2014
  Název: - Pulp_Fiction, Délka - 2:29, hodnocení ★★★★★, Rok vydání: 1994    
```
- `public void printWorstMovie()` - vypíše jméno nejhůře hodnoceného filmu. Pokud je jich více, metoda vypíše libovolný
  z nich.
- `public void printBestMovie()` - vypíše jméno nejlépe hodnoceného filmu. Pokud je jich více, metoda vypíše libovolný z
  nich.

---

#### Bonus:

1. upravte program tak, aby načítal libovolný počet filmů
2. nahraďte rating 1 až 5 procentem 0 - 100. Při výpisu hodnocení se pak každých 20% převede na jednu hvězdičku:

| Range % | # Stars |
|---------|---------|
| 0  - 19 | ` `     |
| 20 - 39 | `★`     |
| 40 - 59 | `★★`    |
| 60 - 79 | `★★★`   |
| 80 - 99 | `★★★★`  |
| 100     | `★★★★★` |

3. ke třídě `SeznamFilmů` přidejte metody, `avarageRating`, `sortByRating`, `printTopN(int N)` - vypíše nejlepších n
   filmů, kde n je argument metody