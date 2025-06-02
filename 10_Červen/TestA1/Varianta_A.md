### **Kniha**

Navrhněte třídu **`Kniha`**, která bude reprezentovat jeden výtisk knihy.

---

#### 1\. Třída a objekty

Vytvořte třídu se **čtyřmi atributy**:

| Atribut | Datový typ | Význam |
| --- | --- | --- |
| `nazev` | `String` | název knihy |
| `autor` | `String` | autor knihy |
| `pocetStran` | `int` | počet stran (> 0) |
| `rokVydani` | `int` | rok vydání (1450 – 2025) |

Napište metodu

```java
public void printInfo()
```

která vypíše např.:

```arduino
"Kniha: Hobit — J. R. R. Tolkien, 304 stran, vydáno 1937"
```

---

#### 2\. Konstruktor

1.  Primární konstruktor přijímá **všechny** čtyři parametry  
    `nazev, autor, pocetStran, rokVydani`.

2.  **Přetěžte** ho konstruktorem přijímajícím pouze  
    `nazev, autor`; atributy `pocetStran = 100`, `rokVydani = 2025`.

3.  Ověření platnosti:


-   `pocetStran` > 0

-   `rokVydani` mezi **1450** a **2025** 


---

#### 3\. Zapouzdření

-   Všechny atributy označte **`private`**.

-   Napište/Vygenerujte **Gettery** pro všechny atributy.

-   Napište **Setter** pro `pocetStran` (znovu kontrolujte > 0).


V metodě **`main`** vytvořte aspoň jeden objekt a zavolejte `printInfo()`.