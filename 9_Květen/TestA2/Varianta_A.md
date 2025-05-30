### **Teploměr**

Navrhněte třídu **`Teplomer`**, která bude představovat jednoduché měřidlo teploty.  

---

#### 1\. Třída a objekty

Vytvořte třídu se **třemi atributy** (správné datové typy jsou hodnoceny):

| Atribut | Význam |
| --- | --- |
| `umisteni` | místo měření (např. „učebna A1“) |
| `teplota` | aktuální teplota (°C) |
| `vCelzii` | `true` = teplota je v °C, `false` = je v °F |

Napište metodu

```java
public void printInfo()
```

která vypíše buď

```yaml
Teploměr: učebna A1 — 22.5 °C
```

nebo

```yaml
Teploměr: učebna A1 — 72.5 °F
```

podle hodnoty `vCelzii`.

---

#### 2\. Konstruktor

1.  Založte konstruktor přijímající všechny tři atributy v pořadí  
    `umisteni, teplota, vCelzii`.

2.  **Přetěžte** ho konstruktorem přijímajícím pouze `umisteni a teplota`;  
    `vCelzii` nastavte na `true`.

3.  Ošetřete, aby teplota v °C byla mezi **–50 a 60** °C  
    (nebo –58 a 140 °F).

---

#### 3\. Zapouzdření

-   Všechny atributy nastavte jako **`private`**.

-   Vygenerujte/Napište **getter** i **setter** pro `teplota`.

    -   V setteru znovu zkontrolujte povolené rozmezí. (Viz bod 2. zadání)

-   U ostatních atributů povolte pouze **getter**.


Na konci metody **`main`** vytvořte objekt a zavolejte `printInfo()`,  
abyste ověřili funkčnost.