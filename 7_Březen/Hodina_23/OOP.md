## Co je OOP v Javě?

Objektově orientované programování (OOP) je programovací paradigma, které organizuje kód do objektů.

- Každý objekt kombinuje
    - **`stav`** (atributy)
    - **`chování`** (metody)
- Komunikuje s ostatními objekty prostřednictvím metod.

### (Principy probereme později)

---

- **Zapouzdření (Encapsulation):**  Skrývání vnitřní implementace a poskytování veřejného rozhraní.

- **Dědičnost (Inheritance):**  Možnost vytvářet nové třídy na základě stávajících, čímž se opětovně využívá kód.

- **Polymorfismus (Polymorphism):**  Schopnost objektů reagovat na stejné volání metod různými způsoby.

- **Abstrakce (Abstraction):**  Oddělení podstatných vlastností od nepodstatných detailů.

---

## Procedurální vs. objektový přístup

### Procedurální přístup

- **Organizace:**  Program se skládá z funkcí (procedur) a globálních dat.

- **Struktura:**  Kód se vyvíjí jako sled instrukcí, kdy se používají opakovaně volané funkce.

- **Výhody:**  Jednodušší pro malé a jednoduché úlohy, přímočarý tok programu.

- **Nevýhody:**  Obtížnější udržovatelnost a rozšiřitelnost u větších projektů, nízká míra znovupoužitelnosti, problém s
  globálním stavem.

### Objektově orientovaný přístup

- **Organizace:**  Program je rozdělen do objektů, kde každý objekt obsahuje data a metody pro manipulaci s těmito daty.

- **Struktura:** Využívá principů zapouzdření, dědičnosti a polymorfismu, což vede k modulární a snadno rozšiřitelné
  struktuře kódu.

- **Výhody:**  Lepší organizace kódu, zvýšená opakovatelnost, snadnější údržba a rozšiřitelnost, přirozenější modelování
  reálného světa.

- **Nevýhody:**  Může vést k vyšší složitosti návrhu, mírně vyšší režie při výkonu a delší dobu návrhu při vytváření
  dobře strukturovaných tříd.

---

## Úkol

Jaké objekty by měla aplikace z minulého cvičení (2d ArrayList - seznam Tříd)

---


## Příklad jednoduché hry Blackjack

Níže uvádíme dva příklady téže jednoduché hry – procedurální přístup a následně řešení v OOP stylu.

### Procedurální přístup

V procedurálním stylu se celý program skládá z několika funkcí (metod) a globální logiky. Například:

```java
import java.util.Random;
import java.util.Scanner;

public class ProceduralBlackjack {
    public static int drawCard() {
        // Karty mají hodnoty od 1 do 11 (pro zjednodušení)
        Random rng = new Random();
        return rng.nextInt(11) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerScore = 0;
        int dealerScore = 0;

        // Hráč si lízne dvě karty
        playerScore += drawCard();
        playerScore += drawCard();
        System.out.println("Hráč, tvoje skóre: " + playerScore);

        // Jednoduché rozhodnutí hráče
        System.out.print("Chceš další kartu? (ano/ne): ");
        String decision = scanner.nextLine();
        if (decision.equalsIgnoreCase("ano")) {
            playerScore += drawCard();
            System.out.println("Nové skóre: " + playerScore);
        }

        // Dealer si lízne dvě karty
        dealerScore += drawCard();
        dealerScore += drawCard();
        System.out.println("Dealerovo skóre: " + dealerScore);

        // Vyhodnocení výsledku
        if (playerScore > 21) {
            System.out.println("Hráč prohrál – přetáhl jsi!");
        } else if (dealerScore > 21 || playerScore > dealerScore) {
            System.out.println("Hráč vyhrál!");
        } else if (playerScore < dealerScore) {
            System.out.println("Dealer vyhrál!");
        } else {
            System.out.println("Remíza!");
        }

        scanner.close();
    }
}
```

*V tomto přístupu je logika rozprostřena v rámci jediné třídy a několik metod se volá postupně podle potřeby.*


---

### Objektově orientovaný přístup

V OOP verzi rozdělíme logiku do několika tříd – například třídy `Card`, `Deck`, `Player` a `BlackjackGame`. Ukázka
zjednodušené verze:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Hlavní třída hry
public class OOPBlackjackGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck balicekKaret = new Deck();
        Player player = new Player("Hráč");
        Player dealer = new Player("Dealer");

        // Hráč si lízne dvě karty
        player.lizniKartu(balicekKaret.drawCard());
        player.lizniKartu(balicekKaret.drawCard());
        System.out.println(player.getName() + ", tvoje skóre: " + player.getScore());

        // Rozhodnutí hráče
        System.out.print("Chceš další kartu? (ano/ne): ");
        String decision = scanner.nextLine();
        
        if (decision.equalsIgnoreCase("ano")) {
            player.lizniKartu(balicekKaret.drawCard());
            System.out.println("Nové skóre: " + player.getScore());
        }

        // Dealer si lízne dvě karty
        dealer.lizniKartu(balicekKaret.drawCard());
        dealer.lizniKartu(balicekKaret.drawCard());
        System.out.println(dealer.getName() + " skóre: " + dealer.getScore());

        // Vyhodnocení výsledku
        if (player.getScore() > 21) {
            System.out.println("Hráč prohrál – přetáhl jsi!");
        } else if (dealer.getScore() > 21 || player.getScore() > dealer.getScore()) {
            System.out.println("Hráč vyhrál!");
        } else if (player.getScore() < dealer.getScore()) {
            System.out.println("Dealer vyhrál!");
        } else {
            System.out.println("Remíza!");
        }

        scanner.close();
    }
}
```


---

## Shrnutí

- **Co to je:**  Objektově orientované programování rozděluje kód do objektů, kde každý objekt obsahuje data a metody
  pro jejich manipulaci.

- **Rozdíly mezi procedurálním a objektovým přístupem:**  Procedurální kód je založen na funkcích a globálních datech,
  zatímco OOP využívá třídy a objekty, které podporují zapouzdření, dědičnost a polymorfismus.

- **Výhody OOP:**  Lepší modularita, snazší údržba, opakovatelnost a možnost modelovat reálný svět.

- **Nevýhody OOP:**  Vyšší složitost návrhu a mírný režijní náklad.