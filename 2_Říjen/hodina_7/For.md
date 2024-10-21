# Cyklus `for` 
- v Javě máme různé způsoby, jak psát cykly, a jedním z nejužitečnějších je cyklus `for`. 
- Tento cyklus je obzvlášť vhodný, když přesně víme, kolikrát chceme daný blok kódu opakovat. 
- Používá se hlavně k iteraci přes pole nebo seznamy, ale také ke kontrolovanému opakování, jako například při výpisu čísel v určitém rozsahu.
- Struktura cyklu `for`Cyklus `for` má tři hlavní části, které jsou všechny zapsány v jedné řádce:
1. **Inicializace**  – Nastavíme počáteční hodnotu proměnné, která se používá pro řízení cyklu.

2. **Podmínka**  – Kontroluje se před každou iterací a cyklus běží, dokud je podmínka splněna.

3. **Aktualizace**  – Po každé iteraci se obvykle provede změna (zvýšení nebo snížení) hodnoty řídicí proměnné.

Syntaxe vypadá následovně:


```java
for (inicializace; podmínka; aktualizace) {
    // kód, který se opakuje
}
```

#### Příklad
Představte si, že chceme vypsat čísla od 1 do 10. V cyklu `for` by to mohlo vypadat takto:

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
```
**Jak tento cyklus funguje:**
1. **Inicializace** : `int i = 1` nastaví proměnnou `i` na hodnotu 1.

2. **Podmínka** : `i <= 10` kontroluje, zda je `i` menší nebo rovno 10.

3. **Aktualizace** : `i++` zvýší hodnotu `i` o 1 po každé iteraci.
   Cyklus se bude opakovat, dokud bude hodnota `i` menší nebo rovna 10.
   Iterace přes pole pomocí `for` cykluCyklus `for` se často používá k iteraci přes prvky pole nebo seznamu. Například, pokud máme pole se jmény a chceme je všechna vytisknout:

```java
public class Main {
    public static void main(String[] args) {
        String[] seznamJmen = {"Karel", "Pepa", "Honza", "Jarmila", "Libor", "Jana"};
        
        for (int i = 0; i < seznamJmen.length; i++) {
            System.out.println(seznamJmen[i]);
        }
    }
}
```
**Co se zde děje:**
- **Inicializace** : `int i = 0` – začínáme na prvním indexu pole (pole začíná na 0).

- **Podmínka** : `i < seznamJmen.length` – cyklus běží, dokud je `i` menší než délka pole.

- **Aktualizace** : `i++` zvýší index po každém průchodu cyklem, abychom přistupovali k dalšímu prvku.
  Rozšířený `for` (for-each) cyklusJava také nabízí zjednodušený zápis cyklu pro iteraci přes kolekce nebo pole, tzv. rozšířený `for` cyklus nebo `for-each`. Tento zápis je jednodušší a čitelnější, když nepotřebujeme pracovat s indexy.
  Syntaxe:


```java
for (typ proměnná : kolekce) {
    // kód, který se opakuje pro každý prvek kolekce
}
```

Příklad s polem jmen:


```java
public class Main {
    public static void main(String[] args) {
        String[] seznamJmen = {"Karel", "Pepa", "Honza", "Jarmila", "Libor", "Jana"};
        
        for (String jmeno : seznamJmen) {
            System.out.println(jmeno);
        }
    }
}
```
Srovnání s cyklem `while`
- **`for` cyklus**  je vhodný, když přesně víte, kolikrát chcete blok kódu opakovat nebo když iterujete přes pole nebo seznam.

- **`while` cyklus**  je vhodnější, když nevíte, kolikrát bude cyklus potřeba spustit, protože záleží na splnění podmínky.

- **`do-while` cyklus**  zajistí, že se kód provede alespoň jednou, i když podmínka není splněna na začátku.
  Nekonečný `for` cyklusStejně jako u jiných cyklů, i u `for` cyklu můžete nechtěně vytvořit nekonečný cyklus, pokud se podmínka nikdy nestane nepravdivou:

```java
for (int i = 0; i >= 0; i++) {
    System.out.println("Nekonečný cyklus");
}
```
Tento cyklus nikdy neskončí, protože podmínka `i >= 0` bude vždy pravdivá. Důležité je zajistit, aby se podmínka někdy stala nepravdivou.
#### Shrnutí:

- Cyklus `for` je ideální pro opakování bloků kódu s přesně definovaným počtem iterací.

- Standardní `for` cyklus má tři části: inicializaci, podmínku a aktualizaci.

- Rozšířený `for` cyklus (`for-each`) je jednodušší pro iteraci přes pole a seznamy.

- Stejně jako u jiných cyklů si dejte pozor na nekonečné cykly, které mohou způsobit zamrznutí programu.