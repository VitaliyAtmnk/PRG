# Užitečné metody v Javě
Matematické metody (`Math`)Přehled třídy `Math`Třída `Math` poskytuje užitečné metody pro matematické výpočty. Je součástí balíčku `java.lang`, takže ji není potřeba importovat.
### Nejužitečnější metody

- `Math.abs(x)`: Vrací absolutní hodnotu čísla.

```java
System.out.println(Math.abs(-10)); // 10
```

- `Math.pow(base, exponent)`: Vrací mocninu čísla.

```java
System.out.println(Math.pow(2, 3)); // 8.0
```

- `Math.sqrt(x)`: Vrací druhou odmocninu čísla.

```java
System.out.println(Math.sqrt(16)); // 4.0
```

- `Math.max(a, b)` / `Math.min(a, b)`: Vrací větší/menší zadanou hodnotu.

```java
System.out.println(Math.max(5, 10)); // 10
```

- `Math.round(x)`: Zaokrouhluje číslo na nejbližší celé číslo.

```java
System.out.println(Math.round(3.6)); // 4
```

- `Math.random()`: Vrací náhodné číslo mezi 0.0 (včetně) a 1.0 (mimo).

```java
System.out.println(Math.random()); // Např. 0.734
```


---

Metody pro práci s časem (`LocalDate`, `LocalTime`, `LocalDateTime`)Přehled třídy `java.time`Od Javy 8 poskytuje balíček `java.time` moderní nástroje pro práci s datem a časem.
### Nejužitečnější metody

- **Aktuální datum:**

```java
LocalDate today = LocalDate.now();
System.out.println(today); // Např. 2025-01-27
```

- **Aktuální čas:**

```java
LocalTime now = LocalTime.now();
System.out.println(now); // Např. 14:45:00
```

- **Aktuální datum a čas:**

```java
LocalDateTime now = LocalDateTime.now();
System.out.println(now); // Např. 2025-01-27T14:45:00
```

- **Přidávání a odebírání dnů, měsíců a let:**

```java
LocalDate tomorrow = today.plusDays(1);
System.out.println(tomorrow); // Např. 2025-01-28
```

- **Formátování data:**

```java
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
System.out.println(today.format(formatter)); // Např. 27.01.2025
```


---


## Metody tříd základních datových typů
`Integer` – práce s celými čísly
- `Integer.parseInt(String s)`: Převádí řetězec na celé číslo.

```java
int num = Integer.parseInt("123");
System.out.println(num); // 123
```

- `Integer.toString(int i)`: Převádí celé číslo na řetězec.

```java
String str = Integer.toString(123);
System.out.println(str); // "123"
```

- `Integer.MAX_VALUE` / `Integer.MIN_VALUE`: Maximální a minimální hodnota typu `int`.

```java
System.out.println(Integer.MAX_VALUE); // 2147483647
```


---

`Character` – práce s jednotlivými znaky
- `Character.isDigit(char c)`: Kontroluje, zda je znak číslice.

```java
System.out.println(Character.isDigit('5')); // true
```

- `Character.isLetter(char c)`: Kontroluje, zda je znak písmeno.

```java
System.out.println(Character.isLetter('a')); // true
```

- `Character.toUpperCase(char c)` / `Character.toLowerCase(char c)`: Převádí znak na velké/malé písmeno.

```java
System.out.println(Character.toUpperCase('a')); // A
```


---

`Double` – práce s desetinnými čísly
- `Double.parseDouble(String s)`: Převádí řetězec na desetinné číslo.

```java
double num = Double.parseDouble("3.14");
System.out.println(num); // 3.14
```

- `Double.toString(double d)`: Převádí desetinné číslo na řetězec.

```java
String str = Double.toString(3.14);
System.out.println(str); // "3.14"
```


---


### Shrnutí

1. **Matematické metody**  jsou užitečné pro rychlé výpočty (např. odmocniny, mocniny, náhodná čísla).

2. **Metody pro práci s časem**  umožňují snadné získání aktuálního data/času a jejich formátování.

3. **Metody tříd základních typů**  usnadňují konverze mezi řetězci a čísly nebo analýzu znaků.
