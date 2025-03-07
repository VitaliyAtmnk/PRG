# Zadání A2 

## Varianta A: Převod na záporné číslo

1. **Metoda pro převod jednoho čísla na záporné.**
    - Vstup: Reálné (`double`) číslo
    - Výstup: Záporná hodnota tohoto čísla

2. **Metoda `swap(arr, pozice1, pozice2)`, která vymění dva prvky v poli.**
    - Přetížení pro pole celých čísel (`int[]`) a reálných čísel (`double[]`)

3. **Metoda, která projde pole reálných čísel a převede všechny prvky v poli na záporné.**

### Kostra kódu v Javě – Varianta 1

```java
public class NegativeUtils {

    // 1. Metoda pro převod jednoho čísla na záporné
    
    public static double makeNegative(double x) {
        // TODO: Implementace
        return 0.0;
    }

    // 2. Metoda swap pro pole celých čísel
    public static void swap(int[] arr, int pos1, int pos2) {
        // TODO: Implementace
    }

    // 2. Metoda swap pro pole reálných čísel
    // Zde přetížení metody swap pro práci s double[] arr

    // 3. Metoda, která projde pole a převede všechny prvky na záporné
    public static void makeAllNegative(double[] arr) {
        // TODO: Implementace
    }
}
```



---



## Varianta 2: Druhá mocnina


2. **Metoda pro převedení čísla na druhou mocninu.**

- Vstup: Reálné (`double`) číslo

- Výstup: Číslo umocněné na 2

4. **Metoda `swap(arr, pozice1, pozice2)`, která vymění dva prvky v poli.**

- Přetížení pro pole celých čísel (`int[]`) a reálných čísel (`double[]`)

6. **Metoda, která projde pole a převede všechny prvky na druhou mocninu.**

### Kostra kódu v Javě – Varianta 2



```java
public class SquareUtils {

    // 1. Metoda pro převedení čísla na druhou mocninu
    public static double square(double x) {
        // TODO: Implementace
        return 0.0;
    }

    // 2. Metoda swap pro pole celých čísel
    public static void swap(int[] arr, int pos1, int pos2) {
        // TODO: Implementace (může být stejná jako v NegativeUtils)
    }

    // 2. Metoda swap pro pole reálných čísel
    // Zde přetížená metoda swap umožňující práci s polem reálných čísel (double[] arr) 

    // 3. Metoda, která projde pole a převede všechny prvky na druhou mocninu
    public static void squareAll(double[] arr) {
        // TODO: Implementace
    }
}
```