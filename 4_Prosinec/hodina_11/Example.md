## Úkol 4-5

### Zadání 1: Rozmezí čísel
Doplň podmínku tak, aby kontrolovala, zda číslo `x` leží v rozmezí mezi `5` (včetně) a `10` (včetně):

```java
if(x ______ 5 ______ x ______ 10) {
    System.out.println("Číslo je v rozmezí 5 až 10");
} else {
    System.out.println("Číslo není v rozmezí 5 až 10");
}
```


---


### Zadání 2: Porovnání dvou čísel
Ověř, zda je `x` větší než `y`, nebo zda jsou stejná:

```java
if(x ______ y ______ x ______ y) {
    System.out.println("x je větší nebo rovno y");
} else {
    System.out.println("x je menší než y");
}
```


---


### Zadání 3: Sudé nebo liché
Zjisti, zda je `x` sudé nebo liché číslo:

```java
if(x ______ 2 ______ 0) {
    System.out.println("x je sudé číslo");
} else {
    System.out.println("x je liché číslo");
}
```


---


### Zadání 4: Testování hodnoty
Doplň podmínku, která ověří, zda hodnota `z` je kladná, záporná, nebo rovná nule:

```java
if(_______) {
    System.out.println("z je kladné číslo");
} else if(_______) {
    System.out.println("z je záporné číslo");
} else {
    System.out.println("z je rovno nule");
}
```


---


### Zadání 5: Pracovní doba
Zkontroluj, zda je aktuální čas (hodina `hour`) v rozmezí 9 až 17:

```java
if(_______) {
    System.out.println("Je pracovní doba");
} else {
    System.out.println("Není pracovní doba");
}
```


---


### Zadání 6: Roční období

Na základě hodnoty měsíce (1–12) vypiš, zda se jedná o zimu, jaro, léto, nebo podzim:


```java
if(_______) {
    System.out.println("Je zima");
} else if(_______) {
    System.out.println("Je jaro");
} else if(_______) {
    System.out.println("Je léto");
} else {
    System.out.println("Je podzim");
}
```


---


### Zadání 7: Platnost hesla
Doplň podmínku, která ověří, zda je heslo dlouhé alespoň 8 znaků **a současně**  obsahuje písmeno `a`:

```java
String password = "heslo123";
if(_______) {
    System.out.println("Heslo je platné");
} else {
    System.out.println("Heslo není platné");
}
```


---


### Zadání 8: Kontrola vstupů
Zkontroluj, zda obě proměnné `x` a `y` jsou větší než nula:

```java
if(_______) {
    System.out.println("Obě proměnné jsou kladné");
} else {
    System.out.println("Jedna nebo obě proměnné nejsou kladné");
}
```


---


### Zadání 9: Negace podmínky
Zjisti, zda `x` **není**  v rozmezí mezi `5` a `15`:

```java
if(_______) {
    System.out.println("x není v rozmezí 5 až 15");
} else {
    System.out.println("x je v rozmezí 5 až 15");
}
```


---


### Zadání 10: Přestupný rok
Ověř, zda je daný rok `year` přestupný:

```java
if(_______) {
    System.out.println("Rok je přestupný");
} else {
    System.out.println("Rok není přestupný");
}
```

## Úkol 6-7
- Sčítání čísel: Napište program, který sečte všechna čísla od 1 do 100 a zobrazí výsledek.
- Počítání výskytů: Nechť uživatel zadávaá čísla, dokud nezadá 0. Program by měl spočítat a zobrazit, kolikrát bylo číslo 5 zadáno.
- Fibonacciho posloupnost: Vypiš prvních 10 čísel Fibonacciho posloupnosti.
- Hádání čísla: Napište program, kde uživatel hádá náhodně vygenerované číslo od 1 do 10. Program by měl pokračovat, dokud uživatel číslo neuhodne.
- Inverze řetězce: Vstupem je řetězec, který program otočí a zobrazí jeho inverzi.
- Hledání maximální hodnoty: Mějte pole s 10 náhodnými čísly. Najděte a zobrazte nejvyšší hodnotu v poli.
- Kalkulačka průměru: Program nechá uživatele zadávat čísla (ukončeno číslem -1) a na konci vypočítá a zobrazí jejich průměr.
- Tabulka násobků: Napište program, který zobrazí násobilku pro číslo zadané uživatelem (např. násobky 7 od 1 do 10).

## Úkol 8

**Úkol 1: Vyhodnocení celočíselného dělení**
Vyhodnoťte výraz ručně a zvolte správnou odpověď:


```java
int vysledek = 85 / 100;
```


```yaml
a : 0.85  
b : 0  
c : 1  
d : Error, nespustí se program.
```


---

**Úkol 2: Porovnání řetězců**
Vyhodnoťte výraz ručně a zvolte správnou odpověď:


```java
String text = "Hello";
boolean vysledek = text.equals("hello");
```


```yaml
a : true  
b : false  
c : Error, nespustí se program.
```


---

**Úkol 3: Výpočet s desetinami**
Vyhodnoťte výraz ručně:


```java
double vysledek = 10 / 4;
```


```yaml
a : 2.5  
b : 2  
c : Error, nespustí se program.
```


---

**Úkol 4: Logický výraz s NOT**
Vyhodnoťte výraz ručně a určete, jaký bude výstup:


```java
boolean vysledek = !(true && false) || (false && true);
```


```yaml
a : true  
b : false  
c : Error, nespustí se program.
```


---

**Úkol 5: Délka řetězce**
Vyhodnoťte výraz ručně:


```java
String text = "Ahoj";
boolean vysledek = text.length() == 4 && text.charAt(0) == 'A';
```


```yaml
a : true  
b : false  
c : Error, nespustí se program.
```


---

**Úkol 6: Modulo operátor**
Vyhodnoťte výraz ručně:


```java
int vysledek = 10 % 3;
```


```yaml
a : 1  
b : 3  
c : Error, nespustí se program.
```


---

**Úkol 7: Podmíněné přiřazení** Vyhodnoťte, co bude uloženo v proměnné `vysledek`:

```java
int x = 5;
int vysledek = (x > 10) ? 20 : 15;
```


```yaml
a : 5  
b : 15  
c : 20  
d : Error, nespustí se program.
```


---

**Úkol 8: Palindrom**
Vyhodnoťte, co vrátí následující výraz:


```java
String palindrom = "())(";
boolean isTrue = !((palindrom.startsWith("()") || palindrom.endsWith(")(")) && palindrom.length() > 4);
```


```yaml
a : true  
b : false  
c : Error, nespustí se program.
```


---

**Úkol 9: Přičítání v cyklu** Určete hodnotu proměnné `soucet` po provedení cyklu:

```java
int soucet = 0;
for (int i = 1; i <= 5; i++) {
    soucet += i;
}
```


```yaml
a : 5  
b : 15  
c : 10  
d : Error, nespustí se program.
```


---

**Úkol 10: Ověření hodnoty proměnné**
Vyhodnoťte, co vytiskne následující program:


```java
int x = 10;
if (x / 3 == 3) {
    System.out.println("Ano");
} else {
    System.out.println("Ne");
}
```


```yaml
a : Ano  
b : Ne  
c : Error, nespustí se program.
```