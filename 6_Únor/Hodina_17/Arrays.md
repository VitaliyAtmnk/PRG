# Pole v Javě

Pole v Javě jsou datové struktury, které umožňují uložit více hodnot stejného datového typu pod jedním názvem proměnné.

---

## Deklarace a Inicializace Pole

### Deklarace pole
- Pole se deklaruje pomocí hranatých závorek `[]` za názvem datového typu.
- Při deklaraci se neurčuje velikost pole.

**Příklad:**
```java
int[] cisla;
String[] slova;
```

---

### Inicializace pole
- Při inicializaci se určuje velikost pole.
- Všechny prvky pole jsou automaticky inicializovány výchozí hodnotou (např. `0` pro `int`, `null` pro `String`).

**Příklad:**
```java
int[] cisla = new int[5]; // Pole s 5 prvky
```

- Pole lze také přímo inicializovat konkrétními hodnotami.

**Příklad:**
```java
int[] cisla = {1, 2, 3, 4, 5};
String[] slova = {"Ahoj", "Svět", "Java"};
```

---

## Přístup k prvkům pole
- K jednotlivým prvkům pole se přistupuje pomocí indexu (číslováno od `0`).
- Indexace začíná na `0`, poslední prvek má index `velikost - 1`.

**Příklad:**
```java
int[] cisla = {10, 20, 30};
System.out.println(cisla[0]); // Výstup: 10
System.out.println(cisla[2]); // Výstup: 30
```

- Změna hodnoty prvku pole:

```java
cisla[1] = 50; // Změna druhého prvku
System.out.println(cisla[1]); // Výstup: 50
```

---

## Procházení pole

### Pomocí `for` cyklu
- Nejčastější způsob iterace přes pole je použití klasického `for` cyklu.

**Příklad:**
```java
int[] cisla = {10, 20, 30, 40};
for (int i = 0; i < cisla.length; i++) {
    System.out.println("Prvek na indexu " + i + ": " + cisla[i]);
}
```

### Pomocí rozšířeného `for` cyklu
- Rozšířený `for` cyklus (tzv. *for-each*) se používá pro jednoduché iterace přes všechna data v poli.

**Příklad:**
```java
for (int cislo : cisla) {
    System.out.println("Hodnota: " + cislo);
}
```

---

## Délka pole
- Délku pole lze zjistit pomocí vlastnosti `.length`.

**Příklad:**
```java
System.out.println("Délka pole: " + cisla.length);
```

---

## Vícedimenzionální pole
- Pole může mít více rozměrů, např. dvourozměrné pole představuje matici.

**Příklad:**
```java
int[][] matice = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
System.out.println(matice[1][2]); // Výstup: 6
```

- Procházení dvourozměrného pole:

```java
for (int i = 0; i < matice.length; i++) {
    for (int j = 0; j < matice[i].length; j++) {
        System.out.print(matice[i][j] + " ");
    }
    System.out.println();
}
```

---

## Kopírování pole
- Pole lze kopírovat pomocí metody `System.arraycopy()` nebo `Arrays.copyOf()`.

**Příklad:**
```java
int[] original = {1, 2, 3};
int[] kopie = Arrays.copyOf(original, original.length);
System.out.println(Arrays.toString(kopie)); // Výstup: [1, 2, 3]
```

---

## Třídění pole
- Pro třídění lze použít `Arrays.sort()`.

**Příklad:**
```java
int[] cisla = {5, 3, 8, 1};
Arrays.sort(cisla);
System.out.println(Arrays.toString(cisla)); // Výstup: [1, 3, 5, 8]
```

---

## Shrnutí
1. Pole jsou struktury, které uchovávají více hodnot stejného typu.
2. Přístup k prvkům se provádí přes index (od `0`).
3. Procházení pole je možné klasickým `for` cyklem nebo `for-each` cyklem.
4. Pole mají pevnou délku, která se nemění po inicializaci.
5. Vícedimenzionální pole umožňují uchovávat složitější struktury dat.
6. Třídění a kopírování pole usnadňují metody z `Arrays`.

Pole jsou důležitou součástí programování v Javě a základem pro složitější datové struktury jako seznamy a mapy.

