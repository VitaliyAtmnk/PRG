# For cyklus - příklady

### Úkol 1

- Mějme funkci `y = 2x - 3`
- A celočíselné hodnoty `x` od `-50` do `50`
- vypište hodnoty funkce všech bodů z rozsahu x

```java
y = 2x -3; // funkce

pro x = -1
y = 2 * (-1) - 3
y = -5 // <= tohle vypíšete

pro x = 0
y = -3

pro x = 1
y = -1
atd.
```

- upravte úkol tak, aby uživatel zadal horní a dolní mez, ze kterých se pak počítají hodnoty funkce

### Úkol 2

- načtěte od uživatele kladné celé číslo `n`
- vypište součet čísel od 1 do n

```java
n = 5;
součet = 1 + 2 + 3 + 4 + 5 = 15;
```

### Úkol 3

- vypište faktoriál čísla `n` které načtete od uživatele
- můžete předpokládát, že uživatel zadá celé číslo od 0 do 12

```java
pro n = 5;
faktorial = 5 * 4 * 3 * 2 * 1 = 120;
```
- co kdyby uživatel zadál číslo větší jak 12?

### Úkol 4
- hoďte 1 000 000 mincí a vypište, s jakou pravděpodobností padla hlava a s jakou orel

### Úkol 5
- hoďtě kostkou 10 000 000 a vypište v kolika případech (v procentech) padla 3

### Úkol 6 (Bonus)

- načtěte od uživatele celé kladné číslo `n`
- "vykreslete" z hvězdiček trojúhelník o výšce n

```java
n = 5
        
*
**
***
****
*****
```
- upravte úkol tak, aby vykresloval různé trojúhelníky:
```java
// výška vždy n = 5
a)
    *
   **
  ***
 ****
*****

b)
*****
****
***
**
*        
        
c)
    *
   ***
  *****
 *******
*********

d)
*********
 *******
  *****
   ***
    *
```


