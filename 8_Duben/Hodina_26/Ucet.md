# **Účet**

---

## 1 Popis scénáře


1. **Vytvoří se dva účty**  – každý s vlastním jménem majitele.

4. **Na oba účty se vloží libovolná počáteční částka.**

6. **Z prvního účtu se odešlou peníze na druhý.**

8. **Z prvního účtu se vybere hotovost.**

10. **Vypíšou se stavy obou účtů.**

---


## 2 Třída `Ucet`

### Atributy
| Atribut | Typ | Poznámka                                                             |
| --- | --- |----------------------------------------------------------------------|
| private static int generator = 100 000; | — | Slouží ke generaci unikátního čísla účtu (nemusíte ve své třídě mít) |
| private String cisloUctu; | String | Unikátní číslo účtu Např. ACC-100001.                                |
| private String majitel; | String | Jméno vlastníka účtu.                                                |
| private double zustatek; | double | Aktuální obnos na účtu. (Neměl by být záporný)                       |

### Metody
| Metoda | Návratový typ | Chování                                                                                                                | 
| --- | --- |------------------------------------------------------------------------------------------------------------------------| 
| Ucet(String majitel) | — | Konstruktor třídy. Vygeneruje cisloUctu (například "ACC-" + ++generator), uloží jméno majitele a nastaví zustatek = 0. | 
| void pridejCastku(double castka) | — | Přičte částku, je-li kladná.                                                                                           | 
| boolean vyberPenize(double castka) | boolean | Ověří, že částka je kladná a na účtu je dost peněz; při úspěchu odečte a vrátí true.                                   | 
| boolean posliPenize(Ucet cil, double castka) | boolean | Ověří částku i zůstatek, odečte a zavolá cil.pridejCastku(castka).                                                     | 
| void vypisZustatek() | — | Vytiskne např. Ctirad – ACC-100001 – 6 500 Kč.                                                                         | 
| String getCisloUctu() | String | Getter na číslo účtu.                                                                                                  | 
| String getMajitel() | String | Getter na jméno majitele.                                                                                              | 

---

## 3 Hlavní třída `Main`


```java
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("cs", "CZ"));   // Kvůli desetinné čárce

        Ucet ucet1 = new Ucet("Ctirad");
        Ucet ucet2 = new Ucet("Zikmund");

        ucet1.pridejCastku(10_000);
        ucet2.pridejCastku(30_000);

        System.out.println("💸 Převod 2 500 Kč z účtu 1 na účet 2:");
        ucet1.posliPenize(ucet2, 2_500);

        System.out.println("🏧 Výběr 1 000 Kč z účtu 1:");
        ucet1.vyberPenize(1_000);

        System.out.println("📊 Konečné zůstatky:");
        ucet1.vypisZustatek();
        ucet2.vypisZustatek();
    }
}
```

*Možný výstup:*


```less
💸 Převod 2 500 Kč z účtu 1 na účet 2:
Převod proběhl úspěšně.

🏧 Výběr 1 000 Kč z účtu 1:
Výběr proběhl úspěšně.

📊 Konečné zůstatky:
Ctirad – ACC-100001 – 6 500 Kč
Zikmund – ACC-100002 – 32 500 Kč
```

---



## 4 Volitelné rozšíření ⭐

| Úroveň | Nápad | 
| --- | --- | 
| 1 ★ | Přidejte textové menu (Scanner) pro opakované vklady, výběry a převody. | 
| 2 ★ | Logujte každou operaci s časem (LocalDateTime) + metoda vypisHistorii(). | 
| 3 ★ | Zaveďte statický poplatek za výběr a odečítejte ho spolu s částkou. | 



---