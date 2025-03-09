# Zadání A1

## Varianta A:

1. **Metoda pro převod jednoho čísla na kladné.**
    - Vstup: Reálné (`double`) číslo
    - Výstup: Kladna hodnota tohoto čísla (`-5 -> 5`, ale `5 -> 5`)

2. **Metoda `swapFirstAndLast(arr)`, která vymění první a poslední prvek pole.**
    - Přetížení pro pole celých čísel (`int[]`) a reálných čísel (`double[]`)

3. **Metoda, která projde pole reálných čísel a převede všechny prvky v poli na kladné.**

### Kostra kódu v Javě – Varianta 1

```java
import java.util.Arrays;

public class VariantaA {

    // 1. Metoda pro převod jednoho čísla na záporné

    static double makePositive(double x) {
        // TODO: Implementace
        return 0.0;
    }

    // 2. Metoda swap pro pole celých čísel
    static void swapFirstAndLast(int[] arr) {
        // TODO: Implementace
    }

    // 2. Metoda swap pro pole reálných čísel
    // Zde přetížení metody swap pro práci s double[] arr

    // 3. Metoda, která projde pole a převede všechny prvky na záporné
    static void makeAllPositive(double[] arr) {
        // TODO: Implementace
    }


    // Pro testovací účely
    public static void main(String[] args) {
        //////////////////////// Úkol 1 ////////////////////////////
        System.out.println(makePositive(5)); // výstup by měl být 5
        System.out.println(makePositive(-5)); // výstup by měl být 5
        System.out.println(makePositive(0)); // výstup by měl být 0
        ////////////////////////////////////////////////////////////

        //////////////////////// Úkol 2 ////////////////////////////
        int[] arr = {1, 2, 3, 4, 5};
        double[] arrReal = {-3.2, 1.2, 8.4, 0.0};

        swapFirstAndLast(arr);
        swapFirstAndLast(arrReal);

        System.out.println(Arrays.toString(arr)); // {5, 2, 3, 4, 1}
        System.out.println(Arrays.toString(arrReal)); // {0.0, 1.2, 8.4, -3.2}
        ////////////////////////////////////////////////////////////

        //////////////////////// Úkol 3 ////////////////////////////
        makeAllPositive(arrReal);
        System.out.println(Arrays.toString(arrReal));
    }
}
```

---

## Varianta 2:

1. **Metoda, která “ořízne” (omezí) vstupní reálné číslo do intervalu od -10 do 10**

- `double limitToRange(double x)`

- Pokud je `x < -10`, vrátí se `-10`.

- Pokud je `x > 10`, vrátí se `10`.

- Jinak se vrátí původní hodnota `x`.

2. **Metoda `swapFirstAndLast(arr)`, která vymění první a poslední prvek pole**

- Přetížení pro pole celých čísel (`int[]`) a reálných čísel (`double[]`).

3. **Metoda, která projde pole reálných čísel a zaokrouhlí všechny jeho prvky na nejbližší celé číslo (
   pomocí `Math.round`).**

- `void roundAll(double[] arr)`

### Kostra kódu v Javě – Varianta C

```java
import java.util.Arrays;

public class VariantaC {

    // 1. Metoda pro omezení čísla do intervalu -10 až 10
    static double limitToRange(double x) {
        // TODO: Implementace
        return 0.0;
    }

    // 2 Metoda swap pro pole celých čísel
    static void swapFirstAndLast(int[] arr) {
        // TODO: Implementace
    }

    // 3. Metoda, která projde pole a zaokrouhlí všechny prvky na celé číslo
    static void roundAll(double[] arr) {
        // TODO: Implementace (Math.round)
    }

    // Pro testovací účely
    static void main(String[] args) {

        //////////////////////// Úkol 1 ////////////////////////////
        System.out.println(limitToRange(-12.3));  // očekávaný výstup: -10
        System.out.println(limitToRange(-9.6));   // očekávaný výstup: -9.6
        System.out.println(limitToRange(9.6));    // očekávaný výstup: 9.6
        System.out.println(limitToRange(10.5));   // očekávaný výstup: 10
        System.out.println(limitToRange(15.0));   // očekávaný výstup: 10

        //////////////////////// Úkol 2 ////////////////////////////
        int[] arrInt = {1, 2, 3, 4, 5};
        double[] arrReal = {-3.2, 1.2, 8.4, 0.0};

        swapFirstAndLast(arrInt);
        swapFirstAndLast(arrReal);

        System.out.println(Arrays.toString(arrInt));   // {5, 2, 3, 4, 1}
        System.out.println(Arrays.toString(arrReal));  // {0.0, 1.2, 8.4, -3.2}

        //////////////////////// Úkol 3 ////////////////////////////
        double[] arrRound = {-1.1, 2.4, 2.5, 2.6};
        roundAll(arrRound); // ocekáváné zaokrouhlení: {-1, 2, 3, 3}
        System.out.println(Arrays.toString(arrRound));
    }
}
```