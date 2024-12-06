# Teoretický test příprava

- opakování na hodině 9.12
- A2 píše 12.12
- A1 píše 16.12
- Test bude složen z 10 typových úkolů

### Úkol 1

- Načtěte od uživatele celé/reálné číslo, nebo řetězec:
- Váš úkol je doplnit datový typ, nebo název metody scanneru, která načte požadovanný vstup
- Příklad:
```java
import java.util.Scanner;

Scanner input = _______; //

int cislo = input.______;
___ realneCislo = input.nextDouble();
String jmeno = input._____;
_____ veta = input.nextLine();

input.close();
```


### Úkol 2

- Zde jen doplňujete matematický operátory pro konkrétní operace, případně ošetříte jednoduchou "výjímku"
- Příklad:
- Vypište součet, rozdíl, násobek, podíl dvou čísel, ošetřete dělení nulou podmínkou

```java

double a = 124.156;
double b = 0.111;

double soucet = _____;
double rozdil = _____;
double soucin = _____;

double podil = 0; // tohle je výsledek, pokud dělíte nulou, jinak vypočítaté

if(_______){
podil =______;
}

System.out.println(soucet);
System.out.println(rozdil);
System.out.println(soucin);
System.out.println(podil);
```

### Úkol 3

- Generace náhodných čísel z rozsahu
- Jak vygenerovat náhodné číslo pro hod kostkou, mincí, či výběr karty.

### Úkol 4 a 5

- Napsat jednoduché větvení a doplnit logické operátory do hlavičky podmínky (do závorek `if()`)
- If/else
- logické rozhodování AND/OR/NOT

```java
int x = 10;
int y = 5;

// Doplňte tak aby platilo

if(x ______ 5 ______ y ______ 10) {
    System.out.println("Podmínka splněna");
} else {
    System.out.println("Podmínka nesplněna");
}


//nebo

int z = -10;

// Ověřte, jestli je 'z' kladné, záporné či nula
if(_______) {
        System.out.println("Z je kladné číslo");
} else if(_______) {
        System.out.println("Z je záporné číslo");
} else {
        System.out.println("Z je rovno 0");
}

```

### Úkol 6 a 7

- Jaké typy cyklů máme?
- S podmínkou na začátku/konci
- S pevně daným počtem opakování
- While/Do While/For
- 3 scénáře a vybrat kdy použijete který

### Úkol 8

- vyhodnoťte výraz ručně
- příklad
```java
int vysledek = 85 / 100;
```
```yaml
a : 0.85
b : 0
c : 1
d : Error, nespustí se program.
```
- nebo
```java
String palindrom = "())(";
boolean isTrue = !((palindrom.startsWith("()") || palindrom.endsWith(")(")) && palindrom.length() > 4);
```

### Úkol 9

- řetězce základní metody
- 3 náhodně dostanete, napíšete co zhruba dělají a jak se používají na příkladu
  - `length()`            
  - `charAt(int index)`
  - `indexOf(String s)`   
  - `toUpperCase()`       
  - `toLowerCase()`       
  - `trim()`              
  - `replace(char, char)`

- Příklad:
```java
String test = "Dostanu jedničku.";

// metody length, charAt, indexOf

System.out.println(test.length());
System.out.println(test.charAt(3));
System.out.println(test.indexOf("u"));
```

### Úkol 10

- SECRET
- dozvíte se při testu.
