# Regulární výrazy

- Regulární výrazy (regular expressions, zkráceně regex) slouží k vyhledávání a manipulaci s textem.

- Pomocí regulárních výrazů můžeme ověřovat vstupy, extrahovat určité části textu, nahrazovat řetězce nebo dělit řetězce na části podle složitých pravidel.

- Java poskytuje podporu pro regulární výrazy prostřednictvím tříd z balíčku `java.util.regex`.

## Základní pojmy

- **Pattern**  – vzor, který reprezentuje regulární výraz

- **Matcher**  – nástroj, který se pokouší najít shodu (match) pro daný vzor v určitém řetězci
  Třídy `Pattern` a `Matcher``Pattern`
- Třída `Pattern` reprezentuje zkompilovaný regulární výraz.

- Vytvoření instance se provádí pomocí statické metody `Pattern.compile(String regex)`.

- Příklad:


```java
Pattern pattern = Pattern.compile("[0-9]+");  // regulární výraz pro jednu či více číslic
```
`Matcher`
- Pomocí objektu `Pattern` lze vytvořit `Matcher`, který se pokusí najít shodu s daným vzorem v poskytnutém řetězci.

- Vytvoření instance:


```java
Matcher matcher = pattern.matcher("Ahoj123");
```

- Metody `Matcher`:
    - `find()` hledá další výskyt shody

    - `matches()` testuje, zda celý řetězec odpovídá vzoru

    - `lookingAt()` testuje, zda počáteční část řetězce odpovídá vzoru

    - `group()` vrací nalezenou shodu

    - `start()` a `end()` vrací počáteční a koncovou pozici nalezené shody

## Zápis regulárních výrazů

Regulární výrazy mají vlastní syntaxi. Níže je stručný přehled základních znaků a konstrukcí.

### Základní metaznaky

- `.` (tečka) – libovolný znak (kromě konce řádku)

- `*` – předchozí znak nebo skupina se může opakovat 0× nebo vícekrát

- `+` – předchozí znak nebo skupina se může opakovat 1× nebo vícekrát

- `?` – předchozí znak nebo skupina je volitelný (0× nebo 1×)

- `|` – logický OR, alternativa

- `()` – skupina znaků

- `[]` – množina znaků (např. `[abc]` znamená a, b nebo c)

- `^` – začátek řetězce (v hranatých závorkách znamená negaci, např. `[^abc]` cokoliv mimo a, b, c)

- `$` – konec řetězce

- `\ ` – escape znak, používá se pro spec. sekvence (např. `\d`, `\s`, `\w`)

### Speciální zkratky

- `\d` – jakákoliv číslice (ekvivalent `[0-9]`)

- `\D` – jakýkoliv znak, který není číslice

- `\s` – bílý znak (mezera, tab, nový řádek)

- `\S` – jakýkoliv znak, který není bílý znak

- `\w` – "word character" (většinou `[a-zA-Z0-9_]`)

- `\W` – znak, který není "word character"

### Kvantifikátory

- `{n}` – přesně n opakování

- `{n,}` – n a více opakování

- `{n,m}` – od n do m opakování

## Příklady použití v Javě

### Základní porovnání


```java
String input = "123abc";
Pattern pattern = Pattern.compile("\\d+"); // jedna nebo více číslic
Matcher matcher = pattern.matcher(input);

if (matcher.find()) {
    System.out.println("Nalezeno: " + matcher.group()); // Vypíše "123"
}
```

### Ověření formátu e-mailu


```java
String email = "uzivatel@example.com";
Pattern emailPattern = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
Matcher emailMatcher = emailPattern.matcher(email);

if (emailMatcher.matches()) {
    System.out.println("E-mail je v platném formátu.");
} else {
    System.out.println("E-mail není validní.");
}
```

### Nahrazování a rozdělování řetězců

- Třída `String` má metody `replaceAll(String regex, String replacement)` a `split(String regex)`.

#### Nahrazování


```java
String text = "Hello   World!";
String upravenyText = text.replaceAll("\\s+", " "); 
// Nahrazení více bílých znaků jednou mezerou => "Hello World!"
```

#### Rozdělování


```java
String csv = "jablko,hruška,banán";
String[] ovoce = csv.split(",");
// ["jablko", "hruška", "banán"]
```

## Příklady složitějších výrazů

- **Kontrola PSČ (5 číslic):**


```java
Pattern pscPattern = Pattern.compile("^\\d{5}$");
```
y
- **Kontrola českého telefonního čísla:**
    - Např. `+420 123 456 789` nebo `+420123456789`


```java
Pattern telPattern = Pattern.compile("^\\+?\\d{3}\\s?\\d{3}\\s?\\d{3}\\s?\\d{3}$");
```

- **Vytěžení částí textu pomocí skupin:**


```java
String datum = "2024-12-16";
Pattern datumPattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
Matcher datumMatcher = datumPattern.matcher(datum);

if (datumMatcher.matches()) {
    String rok = datumMatcher.group(1);
    String mesic = datumMatcher.group(2);
    String den = datumMatcher.group(3);
    System.out.println("Rok: " + rok + ", Měsíc: " + mesic + ", Den: " + den);
}
```

## Shrnutí

- Regulární výrazy v Javě se používají pro pokročilou práci s textem.

- Třídy `Pattern` a `Matcher` poskytují nástroje pro vyhledávání shod a manipulaci s textem.

- Regulární výrazy mají svou vlastní syntaxi, která umožňuje velmi přesné definování formátů.

- Pomocí regex lze snadno validovat vstupy, extrahovat data, nahrazovat a rozdělovat řetězce.
