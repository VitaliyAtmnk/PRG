### **Vzorové zadání 1 — KinoPředstavení**

Navrhněte třídu **`KinoPředstavení`**, která bude reprezentovat jedno filmové promítání.  
Váš kód rozdělte do tří částí podle níže uvedených požadavků.

---

#### 1\. Třída a objekty

1.  Doplňte třídu o následující **atributy** (správné datové typy jsou součástí hodnocení):


| Atribut | Význam |
| --- | --- |
| `nazev` | název filmu |
| `hodina` | hodina začátku promítání (0 – 23) |
| `minuta` | minuta začátku promítání (0 – 59) |
| `delkaMin` | délka filmu v minutách (> 0) |
| `volnaMista` | počet volných míst v sále (0 – 200) |

2.  Napište metodu


```java
public void printInfo()
```

která vypíše ve formátu

```java
KinoPředstavení: <název>, začátek <hodina>:<minuta>, délka <delkaMin> min, volno <volnaMista> míst
```

---

#### 2\. Konstruktor

1.  Vytvořte konstruktor, který nastaví všechny atributy v pořadí  
    `název, hodina, minuta, délka, volnáMísta`.

2.  Třídu **přetěžte** dalším konstruktorem, který přijme pouze `název, hodina, minuta, délka` a nastaví `volnaMista` na výchozí hodnotu **100**.

3.  Ošetřete, aby:


-   hodina byla 0 – 23

-   minuta byla 0 – 59

-   délka > 0

-   volnáMísta bylo 0 – 200


Při porušení podmínek ponechejte atribut bez změny.

---

#### 3\. Zapouzdření

-   Všechny atributy musí být **`private`**.

-   Vygenerujte **getter** a **setter** pro `volnaMista`.

-   U ostatních atributů povolte pouze **getter**.


---

V **`main`** metodě vytvořte ukázkový objekt a zavolejte `printInfo()`, abyste ověřili funkčnost.

---

### **Vzorové zadání 2 — Balíček**

Navrhněte třídu **`Balicek`**, která bude představovat poštovní balík.

---

#### 1\. Třída a objekty

1.  Doplňte třídu o následující **atributy**:


| Atribut | Význam |
| --- | --- |
| `id` | sledovací číslo balíku (řetězec) |
| `hmotnostKg` | hmotnost v kilogramech (0 < hmotnost ≤ 30) |
| `vzdalenostKm` | vzdálenost dopravy v km (≥ 0) |
| `rok`, `mesic`, `den` | plánované datum odeslání |

2.  Napište metodu


```java
public double cena()
```

která spočítá cenu dopravy podle vzorce

```ini
cena = hmotnostKg * 10 + vzdálenostKm * 0.05
```

a výsledek vrátí.

---

#### 2\. Konstruktor

1.  Vytvořte konstruktor přijímající **všechny** atributy v pořadí  
    `id, hmotnostKg, vzdalenostKm, rok, mesic, den`.

2.  Třídu **přetěžte** konstruktorem přijímajícím pouze  
    `id, hmotnostKg, rok, mesic, den` – `vzdalenostKm` nastavte na **0**.

3.  Validace:


-   hmotnost > 0 a ≤ 30 kg

-   vzdálenost ≥ 0 km

-   datum nesmí být v minulosti (tj. rok < 2025, nebo stejný rok a nižší měsíc/den než 27 . 5. 2025)


---

#### 3\. Zapouzdření

-   Všechny atributy označte **`private`**.

-   Vygenerujte **gettery** pro všechny atributy.

-   Setter dovolte **pouze** pro `vzdalenostKm`.

    -   V setteru znovu zkontrolujte, že vzdálenost ≥ 0.


---

V metodě **`main`** vytvořte jeden objekt třídy `Balicek`, vypište jeho cenu voláním `cena()` a zároveň vypište sledovací číslo.