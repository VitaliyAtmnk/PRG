# Cyklus

- Cyklus v programování je velmi užitečný nástroj, protože nám umožňuje opakovat určitý blok kódu, dokud není splněna
  nějaká podmínka.
- To je skvělé, když potřebujeme vykonávat stejnou operaci vícekrát a nechceme psát kód pořád dokola.
- Představte si například, že chcete 10krát vypočítat něco nebo zobrazit čísla od 1 do 100.
- Místo psaní stovky řádků kódu nám cyklus umožní napsat kód elegantně a krátce.

### Proč bychom chtěli cyklus?

- Už víte, jak funguje větvení, tedy použití podmínek (např. `if-else`), které říkají programu:
- **"Pokud je podmínka splněna, udělej tohle, jinak udělej něco jiného."**
- Cyklus souvisí s podmínkami v tom, že nám umožňuje **opakovat**  blok kódu, dokud je nějaká podmínka splněna.
- Takže místo toho, aby se program jednou rozhodl, co udělat, se může rozhodovat opakovaně.

#### Příklad intuice:

- Máte seznam lidí, kteří se účastní závodu.
- Chcete vypsat každého člověka ze seznamu.
- Namísto toho, abyste to dělali ručně pro každý jednotlivý prvek (a ani nemusíte vědet, kolik lidí v seznamu je),
  použijete cyklus.
- Cyklus automaticky projde všechny lidi v seznamu a vytiskne jejich jména.

```java
public class Main {
    public static void main(String[] args) {
        // výpis čislicí 1 - 10
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        // výpis jmen se seznamu
        String[] seznamJmen = {"Karel", "Pepa", "Honza", "Jarmila", "Libor", "Jana"};
        System.out.println(seznamJmen[0]); // Karel
        System.out.println(seznamJmen[1]); // Pepa
        System.out.println(seznamJmen[2]); // Honza
        System.out.println(seznamJmen[3]); // Jarmila
        System.out.println(seznamJmen[4]); // Libor
        System.out.println(seznamJmen[5]); // Jana
    }
}
```

### Cyklus s podmínkou na začátku

- `while` cyklus.
- Tento cyklus opakuje blok kódu, dokud je daná podmínka **pravdivá** .
- Jakmile podmínka přestane být pravdivá, cyklus skončí a program pokračuje dál.

##### Syntaxe:

```java
while(podmínka){
        // kód, který se má opakovat
}
```

#### Příklad:

Jak přepsat předchozí kód do cyklu?

```java
public class Main {
    public static void main(String[] args) {

        // výpis čislicí 1 - 10
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        // výpis lidí se seznamu
        String[] seznamJmen = {"Karel", "Pepa", "Honza", "Jarmila", "Libor", "Jana"};
        int pozice = 0;
        int pocetJmen = seznamJmen.length;

        while (pozice < pocetJmen) {
            String jmeno = seznamJmen[pozice];
            System.out.println(jmeno);
            pozice++;
        }
    }
}
```

Tento cyklus funguje takto:

- **Začínáme s `i = 1`** .

- **Dokud je `i` menší nebo rovno 10** , cyklus se opakuje. V každé iteraci (opakování) cyklu vytiskne hodnotu `i` a
  zvýší ji o 1.

- Jakmile `i` překročí hodnotu 10, podmínka přestane být splněna a cyklus skončí.

#### Cyklus s podmínkou na konci

- `do-while` cyklus
- Na rozdíl od cyklu `while`, kde se nejdřív testuje podmínka, cyklus `do-while` nejdříve vykoná
  blok kódu a **až pak**  ověří podmínku.
- To znamená, že se cyklus **vždy provede alespoň jednou** , i kdyby podmínka
  nebyla splněna hned na začátku.

##### Syntaxe:

```java
public class Main{
    public static void main(String[] args) {
        do{
            // kód, který se má opakovat
        }while(podmínka);       
    }
}
```

#### Příklad:

Pokud chceme znovu vytisknout čísla od 1 do 10, ale tentokrát použijeme `do-while`:

```java
public class Main{
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i++);
        }while(i <= 10);
    }
}
```

Stejný výsledek jako s `while`, ale tentokrát se **blok kódu vykoná alespoň jednou** , i kdyby podmínka hned od začátku
nebyla pravdivá. Například, pokud byste začali s `i = 10`, tak by se i tak vytisklo "10", protože se podmínka ověřuje až po
prvním průchodu.

### Užitečné informace a tipy

1. **Nekonečný cyklus** : Pokud zapomenete změnit podmínku uvnitř cyklu, může se stát, že cyklus poběží **nekonečně
   dlouho** . 
- Například, pokud byste ve výše uvedeném příkladu zapomněli na `i++`, program by stále tiskl číslo `1`,
   protože hodnota `i` by se nikdy nezměnila.

```java
public class Main{
    public static void main(String[] args) {
        while(true){
            System.out.println("Tento cyklus nikdy neskončí!");
        }
    }
}
```

Tomu se říká **nekonečný cyklus**  a může to způsobit zamrznutí programu. Abychom se tomu vyhnuli, je třeba se ujistit, že podmínka
cyklu se někdy stane nepravdivou (např. proměnná `i` se zvyšuje).

2. **Použití cyklu s uživatelským vstupem** : Často používáme cykly pro opakované získávání vstupu od uživatele, dokud
   nezadá správné údaje.

```java
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Zadej číslo větší než 0:");
            number = scanner.nextInt();
            
        } while (number <= 0);  // cyklus pokračuje, dokud uživatel nezadá správné číslo
    }

}
```

3. **Vlajky (flags)** : Někdy lze použít proměnné jako **vlajky** , které pomohou řídit, kdy cyklus skončí.
   Například:

```java
public class Main{
    public static void main(String[] args) {
        boolean running = true;
        while(running){
            // nějaký kód
            if(nějaká_podmínka){
                running = false; // když je podmínka splněna, cyklus skončí
            }
        }
    }
}
```

### Shrnutí:

- Cyklus nám umožňuje **opakovaně provádět kód** , což šetří čas a zjednodušuje náš program.

- `while` cyklus ověřuje podmínku **před každým opakováním** .

- `do-while` cyklus ověřuje podmínku **až po prvním provedení kódu** , takže se vždy vykoná alespoň jednou.

- Je důležité dávat pozor na to, aby cyklus měl způsob, jak skončit, jinak se může stát nekonečným.