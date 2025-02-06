## Pole

### Úkol 1

- vytvořte si pole s 10 čísly. 
```java
Například;
{ 1 , 2 , 3 , 18 , -5 , -167 , 3 , 21 , 191 , 3 }
```
- Pole vypište zepředu i pozpátku

### Úkol 2
- načtěte od uživatele celé kladné číslo (například 5.)
- poté od uživatele načtěte dalších `n` čísel (n je předchozí vstup od uživatele (třeba 5)) a uložíte ho do pole, se kterým pak budete pracovat v dalších úkolech

### Úkol 3
- napište metodu `static int findMin(int[] arr){}` která vrátí nejmenší číslo v poli
  - `{1, 2, 3, -5, 0, 8}` -> metoda vrátí `-5`
  - vytvořte podobnou metodu findMax, která najde maximum

### Úkol 4
- vytvořte si pole jedniček a nul. Například: `{1, 0, 0, 1, 1, 0, 1, 1}`
- pole reprezentuje číslo v binární soustavě (v příklad: `10011011`)
- napište metodu `static int binToDec(int[] bin){}` která vrátí číslo v desítkové soustavě
  - `10011011` => 128 + 16 + 8 + 2 + 1 = 155  

### Úkol 5
- napište metodu `static boolean hasDuplicate(int[] arr){}`
  - metoda vrátí `true` - pokud je v poli duplicitní hodnota
    - `{1, 2, 1, 0}` - `true` -> 1 je v poli 2x
    - `{2, 0, -2}` - `false` -> každý prvek je v poli jen jednou
