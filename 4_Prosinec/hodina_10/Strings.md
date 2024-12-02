# Stringy v Javě - Pokračování

### Převody mezi `int` a `String` a naopak

- Převod z `int` na `String`
  K převodu číselného typu `int` na `String` lze použít:

1. **Metodu `String.valueOf()`**:

```java
int number = 123;
String str = String.valueOf(number);
```

1. **Konkatenace s prázdným Stringem** :

```java
int number = 123;
String str = number + "";
```

- Převod ze `String` na `int`. 
- K převodu `String` na `int` využijeme metodu `Integer.parseInt()`:

```java
String str = "123";
int number = Integer.parseInt(str);
```

> **Poznámka** : Pokud `String` obsahuje neplatné znaky, např. "123a", metoda `parseInt` vyhodí
> výjimku `NumberFormatException`.

---

#### startsWith()
- Metoda `startsWith` kontroluje, zda řetězec začíná určitým podřetězcem.

### Syntaxe

```java
boolean startsWith(String prefix)
```

### Příklad

```java
String text = "Ahoj světe!";
boolean result = text.startsWith("Ahoj");
System.out.println(result); // Výstup: true
```

> **Poznámka** : Metoda je case-sensitive, tj. rozlišuje malá a velká písmena.

---

#### endsWith()
`Metoda `endsWith` kontroluje, zda řetězec končí určitým podřetězcem.

### Syntaxe

```java
boolean endsWith(String suffix)
```

### Příklad

```java
String text = "Ahoj světe!";
boolean result = text.endsWith("světe!");
System.out.println(result); // Výstup: true
```

> **Poznámka** : Stejně jako `startsWith`, i `endsWith` je case-sensitive.

---

#### substring()
Metoda `substring` se používá k extrahování části řetězce.

### Syntaxe

```java
String substring(int beginIndex)
String substring(int beginIndex, int endIndex)
```

### Příklad

```java
String text = "Ahoj světe!";
String part = text.substring(5); // Od indexu 5 do konce
System.out.println(part); // Výstup: světe!

String part2 = text.substring(0, 4); // Od indexu 0 do 4 (bez 4)
System.out.println(part2); // Výstup: Ahoj
```

> **Pozor** : Pokud zadáte index mimo rozsah, vyhodí se výjimka `StringIndexOutOfBoundsException`.

---

### StringBuilder
Třída `StringBuilder` se používá pro efektivní práci s řetězci, protože na rozdíl od `String` je
mutabilní (změnitelná).

### Hlavní metody

1. **`append(String str)`**  - Přidá text na konec.
2. **`insert(int offset, String str)`**  - Vloží text na daný index.
3. **`replace(int start, int end, String str)`**  - Nahradí část textu.
4. **`reverse()`**  - Otočí text.

### Příklad

```java
StringBuilder sb = new StringBuilder("Ahoj");
sb.append(" světe");
System.out.println(sb); // Výstup: Ahoj světe

sb.reverse();
System.out.println(sb); // Výstup: etěvs johA
```

> **Poznámka** : `StringBuilder` není thread-safe. Pokud potřebujete thread-safety, použijte `StringBuffer`.

---

### StringBuffer
`StringBuffer` je téměř identická s `StringBuilder`, ale je thread-safe. To znamená, že může být
bezpečně používána ve více vláknech.

### Příklad

```java
StringBuffer sb = new StringBuffer("Ahoj");
sb.append("světe");
System.out.println(sb); // Výstup: Ahoj světe
```

> **Nevýhoda** : Kvůli synchronizaci je `StringBuffer` pomalejší než `StringBuilder`.

---

## Shrnutí

- **Převody mezi `int` a `String`** : Používejte metody `valueOf` nebo `parseInt`.
- **Metody `startsWith` a `endsWith`** : Kontrola začátku/konce řetězce.
- **`substring`** : Extrakce části řetězce.
- **`StringBuilder` a `StringBuffer`** : Práce s mutabilními řetězci; Používejte `StringBuilder`, je
  rychlejší.