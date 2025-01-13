# Metody

Metody v Javě jsou bloky kódu, které vykonávají specifické úkoly. Umožňují znovupoužitelnost kódu a zlepšují čitelnost programu.

---

## Argumenty a Parametry

### Co jsou parametry?
- Parametry jsou proměnné definované v hlavičce metody.
- Slouží k předání hodnot do metody.
- Každý parametr musí mít datový typ.

**Příklad:**
```java
public void vypisPozdrav(String jmeno) {
    System.out.println("Ahoj, " + jmeno + "!");
}
```
- `String jmeno` je parametr metody `vypisPozdrav`.

---

### Co jsou argumenty?
- Argumenty jsou hodnoty, které jsou předány metodě při jejím volání.
- Musí odpovídat počtem, typem a pořadím parametrům definovaným v metodě.

**Příklad:**
```java
vypisPozdrav("Karle");
```
- "Karle" je argument předáný metodě `vypisPozdrav`.

---

### Počet parametrů v metodě
Metoda může mít libovolný počet parametrů, včetně žádného.

1. **Metoda bez parametrů:**
   ```java
   public void pozdrav() {
       System.out.println("Ahoj!");
   }
   
   pozdrav(); // Volání metody
   ```

2. **Metoda s jedním parametrem:**
   ```java
   public void vypisCislo(int cislo) {
       System.out.println("Zadané číslo je: " + cislo);
   }
   
   vypisCislo(10); // Volání metody s argumentem 10
   ```

3. **Metoda s více parametry:**
   ```java
   public void vypocetSouctu(int a, int b) {
       System.out.println("Součet je: " + (a + b));
   }
   
   vypocetSouctu(5, 7); // Volání metody s argumenty 5 a 7
   ```

---

### Hodnotové vs. Referenční parametry

1. **Hodnotové parametry:**
    - Používají se s primitivními datovými typy.
    - Do metody se předává kopie hodnoty, změny uvnitř metody neovlivní původní proměnnou.

   **Příklad:**
   ```java
   public void zvysCislo(int cislo) {
       cislo = cislo + 1;
       System.out.println("Hodnota uvnitř metody: " + cislo);
   }
   
   int x = 5;
   zvysCislo(x);
   System.out.println("Hodnota mimo metodu: " + x);
   ```
   **Výsledek:**
   ```
   Hodnota uvnitř metody: 6
   Hodnota mimo metodu: 5
   ```

2. **Referenční parametry:**
    - Používají se s objekty nebo referenčními typy.
    - Do metody se předává odkaz na objekt, změny uvnitř metody ovlivní původní objekt.

   **Příklad:**
   ```java
   public void pridatKonec(StringBuilder text) {
       text.append(" konec");
   }
   
   StringBuilder mujText = new StringBuilder("Začátek");
   pridatKonec(mujText);
   System.out.println(mujText);
   ```
   **Výsledek:**
   ```
   Začátek konec
   ```

---

### Klíčová slova `this` v parametrech

1. **Použití `this`:**
    - Používá se pro odlišení lokální proměnné od člena třídy se stejným jménem.

   **Příklad:**
   ```java
   public class Osoba {
       private String jmeno;
       
       public void nastavJmeno(String jmeno) {
           this.jmeno = jmeno;
       }
   }
   ```

---

### Důležité pravidla pro parametry

1. Každý parametr musí mít unikátní jméno.
2. Parametry musí odpovídat typem a počtem při volání metody.
3. Parametry jsou do metody předávány hodnotou (kopií) nebo odkazem (u objektů).

---

### Shrnutí
- Parametry umožňují metodám předávat data.
- Argumenty jsou hodnoty předávané při volání metod.
- Primitivní typy jsou předávány hodnotou, zatímco referenční typy jsou předávány odkazem.

