# Práce s poli v metodách, třídění, kopírování a zvětšování pole v Javě

## 1. Třídění pole

### Ruční třídění (Bubble Sort)
Bubble sort je jednoduchý algoritmus, který opakovaně prochází polem a vyměňuje sousední prvky, pokud nejsou ve správném pořadí.

```java
public class BubbleSortExample {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 5, 6};
        bubbleSort(data);
        System.out.println(java.util.Arrays.toString(data));
    }
}
```

### Použití knihovny `Arrays.sort()`

```java
import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 5, 6};
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
```

---

## 2. Kopírování pole

### Ruční kopírování

```java
public class CopyArrayExample {
    public static int[] copyArray(int[] original) {
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        return copy;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = copyArray(original);
        System.out.println(java.util.Arrays.toString(copied));
    }
}
```

### Použití `Arrays.copyOf()`

```java
import java.util.Arrays;

public class CopyArrayExample {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copied = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(copied));
    }
}
```

---

## 3. Zvětšování pole

### Ruční zvětšení

```java
public class ResizeArrayExample {
    public static int[] resizeArray(int[] original, int newSize) {
        int[] newArray = new int[newSize];
        for (int i = 0; i < Math.min(original.length, newSize); i++) {
            newArray[i] = original[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3};
        data = resizeArray(data, 5);
        System.out.println(java.util.Arrays.toString(data));
    }
}
```

### Použití `Arrays.copyOf()`

```java
import java.util.Arrays;

public class ResizeArrayExample {
    public static void main(String[] args) {
        int[] data = {1, 2, 3};
        data = Arrays.copyOf(data, 5);
        System.out.println(Arrays.toString(data));
    }
}
```

---

## 4. Práce s polem v metodách

### Jak se změní původní pole při předání do metody

Při předání pole metodě se předává odkaz na původní pole, takže změny provedené uvnitř metody ovlivní původní pole.

```java
public class ModifyArrayExample {
    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2; // Znásobíme hodnoty v poli
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4};
        modifyArray(data);
        System.out.println(java.util.Arrays.toString(data)); // Pole je změněné
    }
}
```

### Předání pole metodě bez změny původního pole

Pokud chceme zachovat původní pole beze změny, musíme nejprve vytvořit jeho kopii:

```java
public class PreserveArrayExample {
    public static int[] doubleArrayValues(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] *= 2;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4};
        int[] modified = doubleArrayValues(data);
        System.out.println("Původní: " + java.util.Arrays.toString(data));
        System.out.println("Změněné: " + java.util.Arrays.toString(modified));
    }
}
```

