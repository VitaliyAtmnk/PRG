# Gettery, Settery a Přístupové Modifikátory

## 1. Přístupové modifikátory

Přístupové modifikátory určují, **kdo může pracovat s proměnnou nebo metodou** .

| Modifikátor | Přístup                          | Použití                                    | 
|-------------|----------------------------------|--------------------------------------------| 
| private     | Pouze uvnitř třídy               | Pro data, která nemají být dostupná zvenčí | 
| public      | Kdekoliv                         | Pro metody, které chceme volat zvenčí      | 
| protected   | V rámci balíčku a dědičných tříd | (zatím neřešíme do hloubky)                | 

---

### Příklad:

```java
public class Osoba {
    private String jmeno; // není přístupné přímo zvenčí

    public void pozdrav() {
        System.out.println("Ahoj, jsem " + jmeno);
    }
}
```

---

## 2. Getter a Setter

### Co to je?

- **Getter**  je metoda, která **vrací hodnotu**  proměnné.

- **Setter**  je metoda, která **nastaví hodnotu**  proměnné.

> Díky nim můžeme řídit, **jak se k proměnné přistupuje**  – třeba kontrolovat, zda je hodnota platná.



---

### Vzorový kód:

```java
public class Osoba {
    private String jmeno;

    // Setter - nastaví hodnotu
    public void setJmeno(String noveJmeno) {
        jmeno = noveJmeno;
    }

    // Getter - vrátí hodnotu
    public String getJmeno() {
        return jmeno;
    }
}
```

---

### Použití v hlavním programu:

```java
public class Main {
    public static void main(String[] args) {
        Osoba o = new Osoba();
        o.setJmeno("Karel"); // nastavíme jméno
        System.out.println(o.getJmeno()); // vypíšeme jméno
    }
}
```

---

## 3. Proč používat gettery a settery?

1. **Bezpečnost dat**  – nikdo nemůže měnit proměnné přímo.

2. **Kontrola hodnoty**  – v settru můžeš ověřit vstup.

Např. nedovolíme prázdné jméno:

```java
public void setJmeno(String noveJmeno) {
    if (noveJmeno.length() > 0) {
        jmeno = noveJmeno;
    }
}
```

---

## 4. Shrnutí

- `private` = skryté proměnné (nepřístupné zvenčí)

- `public` metody (get/set) = řízený přístup k datům

- **Getter**  = metoda pro čtení hodnoty

- **Setter**  = metoda pro změnu hodnoty

---


### 🟢 Základní otázky (porozumění)

1. Co znamená, že je proměnná `private`?

2. K čemu slouží `public` metody `get` a `set`?

3. Co je rozdíl mezi getterem a setterem?

4. Proč je lepší pracovat s proměnnou přes getter a setter než přímo?

5. Může třída mít více getterů a setterů? Kdy to dává smysl?

---

### 🟡 Aplikační otázky (použití)

1. Podívej se na následující kód:

```java
public class Zvire {
    private String druh;

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public String getDruh() {
        return druh;
    }
}
```

Jak bys vytvořil objekt této třídy a nastavil mu hodnotu `"kočka"`?

2. Jak bys upravil setter, aby nepovolil prázdný řetězec jako `druh`?

3. Napiš getter pro celočíselnou proměnnou `vek`.

---

### 🔴 Rozšiřující otázky (uvažování)

1. Co se může stát, když necháme proměnnou `public` a nemáme kontrolu přes setter?

2. Uveď příklad, kdy by bylo užitečné dát do setteru kontrolu (např. věk nesmí být záporný).

3. Kdy bys vůbec nevytvářel setter? Uveď příklad proměnné, kterou chceme jen číst.

---