# Přetížení a Rekurze v Javě

## Přetížení metod

### Co je přetížení metod?
Přetížení metod znamená, že více metod může mít stejný název, ale liší se:
- Počtem parametrů,
- Typy parametrů,
- Pořadím parametrů.

Java rozlišuje přetížené metody podle jejich signatury (název metody + parametry).

### Příklad přetížení metod
```java
public class OverloadingExample {

    // Metoda bez parametrů
    public static void printMessage() {
        System.out.println("Ahoj světe!");
    }

    // Metoda s jedním parametrem
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Metoda se dvěma parametry
    public static void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        printMessage(); // Zavolá metodu bez parametrů
        printMessage("Hello Java!"); // Zavolá metodu s jedním parametrem
        printMessage("Opakuji", 3); // Zavolá metodu se dvěma parametry
    }
}
```

### Klíčové vlastnosti
1. Přetížení pomáhá kód lépe organizovat a zvyšuje jeho čitelnost.
2. Přetížení **nelze provést pouze změnou návratového typu**.

```java
import java.util.Random;

//At 2.
public class Example {
    /**
     * Metoda pro hod mincí
     */
    static void flipCoin() {
        if (Math.random() > 0.5) {
            System.out.println("Head");
        } else {
            System.out.println("Tails");
        }
    }

    /**
     * Metoda pro hod mincí
     * @return  true  - heads
     *          false - tails
     */
    static boolean flipCoin() {
        if (Math.random() > 0.5) {
            System.out.println("Head");
            return true;
        } else {
            System.out.println("Tails");
            return false;
        }
    }

    public static void main(String[] args) {
        flipCoin(); // která se má zavolat??
    }
}
```

---

## Rekurze

### Co je rekurze?
Rekurze je technika, kdy metoda volá sama sebe. Používá se často pro problémy, které lze rozdělit na menší části.

### Struktura rekurze
Každá rekurzivní metoda musí mít:
1. **Základní případ (base case):** Situace, kdy rekurze končí.
2. **Rekurzivní krok:** Volání metody sama na sebe s jinými (menšími) parametry.

### Příklad: Faktoriál čísla
```java
public class RecursionExample {

    // Rekurzivní metoda pro výpočet faktoriálu
    static int factorial(int n) {
        if (n == 0) { // Základní případ
            return 1;
        } else { // Rekurzivní krok
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Faktoriál čísla 5: " + factorial(5));
    }
}
```

```java
public class IterativeExample {

    // Iterativní přístup
    static int factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Faktoriál čísla 5: " + factorial(5));
    }
}
```

#### Výstup programu
```
Faktoriál čísla 5: 120
```

### Další příklad: Fibonacciho posloupnost
```java
public class FibonacciExample {

    // Rekurzivní metoda pro výpočet Fibonacciho čísla
    static int fibonacci(int n) {
        if (n <= 1) { // Základní případy
            return n;
        } else { // Rekurzivní krok
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("10. Fibonacciho číslo: " + fibonacci(10));
    }
}
```
```java
public class FibonacciExampleIterative {

    // Rekurzivní metoda pro výpočet Fibonacciho čísla
    static int fibonacci(int n) {
        int num1 = 0, num2 = 1, num3;

        for (int i = 0; i < n; i++) {
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
        return num1;
    }

    public static void main(String[] args) {
        System.out.println("10. Fibonacciho číslo: " + fibonacci(10));
    }
}
```
- Rekurze může být časově dost náročná i s moderní výpočetní technikou (za moderní výpočetní techniku budeme považovat i školní počítače.) 
- Zkuste si metodu zavolat s argumentem 50, nebo 100
- Abychom počítači trochu ulehčili, můžeme metodu přepsat iterativním způsobem (tj. bez rekurze)
- V takovém případě tu těžkou práci oddřeme my, ale na oplátku nemusíme čekat 100 let na jeden výpočet.
- Vymyslet iterativní náhradu rekurze je bohužel často náročná úloha.
- My se budeme úlohám s těžkou rekurzí proto vyhýbat a setkat se s nimi můžete dobrovolně na zaměření (ale jen zřídka), a nebo nedobrovolně (nadměrnou neaktivitou na hodinách či vyrušováním)

### Iterace vs. Rekurze
| **Vlastnost**          | **Rekurze**                          | **Iterace**                       |
|------------------------|---------------------------------------|------------------------------------|
| Paměťová náročnost     | Vyšší (kvůli zásobníku volání)        | Nižší                             |
| Rychlost               | Pomalejší                            | Rychlejší                         |
| Jednoduchost kódu      | Často jednodušší                     | Může být složitější               |

---

## Shrnutí
1. **Přetížení metod** umožňuje definovat více metod se stejným názvem, ale různými parametry. Zvyšuje čitelnost kódu a usnadňuje jeho použití.
2. **Rekurze** je užitečná technika pro řešení problémů, které lze rozdělit na menší podproblémy, ale vyžaduje správné ošetření základního případu, aby nedošlo k nekonečné rekurzi.
3. **Iterace a rekurze** mohou být alternativními přístupy pro řešení některých problémů, ale mají různé vlastnosti týkající se paměťové a časové náročnosti.

