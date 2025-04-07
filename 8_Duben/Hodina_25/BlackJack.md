### Zadání úkolu: Jednoduchá hra Blackjack

#### Cíl programu:

Vytvořte textovou hru Blackjack, kde hráč obdrží dvě karty a může si postupně dobírat další, dokud se nerozhodne skončit
tah nebo nepřekročí součet 21 bodů (tj. prohra).

#### Požadavky:

1. **Třída Card (Karta):**

- **Atributy:**

    - `String rank` – hodnota karty (např. "2", "3", ..., "10", "J", "Q", "K", "A").

    - `String suit` – barva karty (např. "srdce", "káry", "piky", "kříže").

    - `int value` – herní hodnota karty (číselné karty mají svou hodnotu, J, Q, K počítáme jako 10; eso lze pro
      zjednodušení počítat jako 11).

- **Konstruktor:**  Inicializace atributů.

- **Metoda:**

    - `public void printCard()` – metoda, která vypíše informace o kartě, např.:
    - `A srdce` nebo `10 káry`

2. **Třída Deck (Balíček):**

- **Atribut:**

    - Pole obsahující 52 karet. (`ArrayList\<Card>`)

- **Konstruktor:**  Vytvoří plný balíček karet s příslušnými hodnotami.

- **Metody:**

    - `public void shuffle()` – metoda, která promíchá karty v balíčku (např. využitím náhodného zamíchání).
      - existuje metoda Collections.shuffle(- váš ArrayList -)

    - `public Card dealCard()` – metoda, která vrátí jednu kartu z balíčku a odstraní ji (nebo zajistí, že už nebude
      dále použita).

3. **Hlavní program (třída Game nebo Main):**

- Vytvořte instanci třídy `Deck`, zamíchejte balíček a rozdělte hráči dvě karty.

- Vypište karty, které hráč obdržel, a spočítejte jejich celkovou hodnotu.

- Umožněte hráči volbu mezi:

    - **Hit:**  hráč si dobírá další kartu. Po každém dobití se znovu vypíše celková hodnota.
 
    - **Stand:**  hráč ukončí svůj tah.

- Hra končí, pokud hráč:

    - Překročí 21 bodů (prohra).
 
    - Zvolí "stand" a jeho celkový součet je ≤ 21 (v tomto jednoduchém zadání se neřeší hra dealera).

- Vypište konečný stav a informujte hráče o výsledku (např. "Překročil jsi 21 – prohra!" nebo "Skvělá hra, tvůj součet
  je ...").

#### Bonus:

- **Bonus – Implementace dealera:**

    - Vytvořte jednoduchého dealera, který dostane dvě karty a poté si dobírá karty, dokud jeho součet nedosáhne
      minimálně 17.

    - Po ukončení tahu hráče porovnejte výsledky:

    - Pokud dealer překročí 21, hráč vyhrává.
 
    - Jinak se vyhodnotí, kdo má vyšší součet bodů (při shodě může být hra považována za remízu).

- **Bonus – Opakování hry:**

    - Umožněte hráči po skončení jedné hry vybrat, zda chce zahrát znovu.


