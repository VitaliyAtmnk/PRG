
### **BankovníÚčet**

Navrhněte třídu **`BankovniUcet`** reprezentující jednoduchý bankovní účet.

---

#### 1\. Třída a objekty

Třída má právě **tři atributy**:

| Atribut | Význam |
| --- | --- |
| `cisloUctu` | číslo účtu (řetězec) |
| `zustatek` | aktuální zůstatek (≥ 0) |
| `mena` | měna účtu (např. „CZK“) |

Doplňte metodu

```java
public void vklad(double castka)
```

která přičte `castka` k `zustatek`, pokud je `castka > 0`   
Po úspěšném vkladu vypište:

```php-template
Na účet <cisloUctu> bylo vloženo <castka> <mena>. Nový zůstatek: <zustatek> <mena>
```

---

#### 2\. Konstruktor

1.  Primární konstruktor přijímá všechny atributy  
    `cisloUctu, zustatek, mena`.

2.  **Přetěžte** ho konstruktorem, který přijímá pouze `cisloUctu`  
    a nastaví `zustatek = 0`, `mena = "CZK"`.

3.  V obou konstruktorech validujte, že `zustatek ≥ 0`.  
    Pokud ne, nastavte `zustatek = 0`.


---

#### 3\. Zapouzdření

-   Všechny atributy musí být **`private`**.

-   Vygenerujte **getter** pro každý atribut.

-   Setter dovolte **pouze** pro `zustatek` (s kontrolou, že výsledek bude ≥ 0).


---

V metodě **`main`** založte účet, proveďte 2 vklady a ověřte,  
že se zůstatek mění správně.