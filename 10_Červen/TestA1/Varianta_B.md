### **ChytráŽárovka**

Navrhněte třídu **`ChytraZarovka`**, která modeluje chytrou LED žárovku.

---

#### 1\. Třída a objekty

Třída má právě **čtyři atributy**:

| Atribut | Datový typ | Význam |
| --- | --- | --- |
| `mistnost` | `String` | název místnosti |
| `jas` | `int` | jas 0 – 100 % |
| `barva` | `String` | barva světla (např. „bílá“, „červená“) |
| `zapnuto` | `boolean` | `true` = svítí, `false` = zhasnuto |

Implementujte metodu

```java
public void printStatus()
```

která vypíše např.:

```java
Žárovka v Kuchyně — zapnuto, jas 80 %, barva bílá
```
---

#### 2\. Konstruktor

1.  Primární konstruktor přijímá **všechny** atributy v pořadí  
    `mistnost, jas, barva, zapnuto`.

2.  **Přetížení:** konstruktor jen s `mistnost`; výchozí hodnoty  
    `jas = 100`, `barva = "bílá"`, `zapnuto = false`.

3.  Validace: `jas` musí být 0 – 100 %.


---

#### 3\. Zapouzdření

-   Atributy deklarujte **`private`**.

-   **Gettery** pro všechny atributy.

-   **Settery** pro `jas` a `barva`.

    -   V setteru `jas` znovu ověřte rozsah 0 – 100 %.

-   Pro zapínání / vypínání vytvořte metodu


```java
public void toggle()
```

která obrátí hodnotu `zapnuto`.

---

V metodě **`main`** vytvořte objekt, zavolejte `printStatus()`,  
pak několik-krát `toggle()` a znovu `printStatus()` pro ověření funkce.