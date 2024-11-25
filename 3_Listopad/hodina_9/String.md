# String v Javě

Řetězce (**String**) jsou v Javě jedním z nejdůležitějších datových typů, které slouží k uchovávání a manipulaci s
textem. Jsou reprezentovány třídou `String`, která se nachází v balíčku `java.lang` (není potřeba ji explicitně
importovat).

---

## Vlastnosti `String`

- **Neměnnost (Immutability)**: Hodnota objektu typu `String` nelze po vytvoření změnit. Všechny metody, které "mění"
  řetězec, vrací nový objekt.
- **Ukládání textu**: Hodnoty řetězců jsou uloženy jako pole znaků (interně používá `char[]`).
- Lze je inicializovat:
  **Doslovným zápisem**:
  ```java
  String text = "Ahoj světe!";
  ```
  **Pomocí konstruktoru**:
  ```java
  String text = new String("Ahoj světe!");
  ```

---

## Základní operace

### 1. **Vytváření a skládání řetězců**

Deklarace a inicializace:
```java
String jmeno = "Jan";
String prijmeni = "Novák";
```
Skládání řetězců:
```java
String celeJmeno = jmeno + " " + prijmeni; // "Jan Novák"
```

### 2. **Základní metody `String`**

| Metoda                 | Popis                                              | Příklad použití                       |
|------------------------|----------------------------------------------------|---------------------------------------|
| `length()`             | Vrací délku řetězce                                | `"Ahoj".length(); // 4`               |
| `charAt(int index)`    | Vrací znak na zadané pozici                        | `"Ahoj".charAt(1); // 'h'`            |
| `substring(int start)` | Vrací podřetězec od daného indexu                  | `"Ahoj".substring(2); // "oj"`        |
| `indexOf(String s)`    | Vrací pozici podřetězce, nebo -1, pokud není       | `"Ahoj".indexOf("oj"); // 2`          |
| `toUpperCase()`        | Převede všechny znaky na velká písmena             | `"ahoj".toUpperCase(); // "AHOJ"`     |
| `toLowerCase()`        | Převede všechny znaky na malá písmena              | `"AHOJ".toLowerCase(); // "ahoj"`     |
| `trim()`               | Odstraní bílé znaky na začátku a konci řetězce     | `"  Ahoj  ".trim(); // "Ahoj"`        |
| `replace(char, char)`  | Nahradí všechny výskyty jednoho znaku jiným znakem | `"java".replace('a', 'o'); // "jovo"` |

---

## Práce s podřetězci
- podrobněji v dalších hodinách

```java
String text = "Ahoj světe!";
String podretezec = text.substring(0, 4);  // "Ahoj"
int pozice = text.indexOf("světe"); // 5
```

## Porovnávání řetězců 
 
- **Rovnost řetězců**:

 ```java
boolean jeStejne = "ahoj".equals("ahoj");  // true
```

- **Ignorování velikosti písmen** :

```java
boolean jeStejneIgnoreCase = "Ahoj".equalsIgnoreCase("ahoj"); // true
```

- **Lexikografické porovnání** :

```java
int vysledek = "abc".compareTo("abd"); // -1
```