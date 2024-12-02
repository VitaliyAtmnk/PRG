## Úkoly

Úkol 1: Převod mezi `int` a `String`
Napište program, který:

1. Načte číslo od uživatele jako `String`.
2. Převést tento `String` na `int`.
3. Zvětší toto číslo o 10 a znovu jej převede na `String`.
4. Vypíše původní i upravené číslo.

#### Příklad:

```yaml
Zadejte číslo: 50
Původní číslo: 50
Nové číslo: 60
```

---

**Úkol 2: Kontrola začátku a konce textu**
Napište program, který:

1. Načte od uživatele řetězec.
2. Zkontroluje:

- Zda řetězec začíná na "Java".
- Zda řetězec končí na "rocks".

3. Vypíše odpovídající zprávy pro obě podmínky.

#### Příklad:

```yaml
Zadejte text: Java programming rocks
Řetězec začíná na "Java": true
Řetězec končí na "rocks": true
```

---

**Úkol 3: Extrakce části řetězce**
Napište program, který:

1. Načte text od uživatele.
2. Požádá uživatele o dva indexy (začátek a konec).
3. Pomocí metody `substring` extrahuje část textu mezi těmito indexy.
4. Vypíše extrahovaný text.

#### Příklad:

```yaml
Zadejte text: Ahoj světe
Zadejte začátek (index): 5
Zadejte konec (index): 10
Extrahovaný text: světe
```

---

## Pokročilé úkoly

**Úkol 1: Analýza čísel v textu**
Napište program, který:

1. Načte řetězec obsahující text a čísla (např. "Cena: 150 Kč, Sleva: 30%").
2. Z řetězce extrahuje všechna čísla pomocí `substring` a dalších metod.
3. Spočítá jejich součet.

#### Příklad:

```yaml
Zadejte text: Cena: 150 Kč, Sleva: 30%
Extrahovaná čísla: [ 150, 30 ]
Součet: 180
```

---

**Úkol 2: Detekce přípon souborů**
Napište program, který:

1. Načte seznam názvů souborů od uživatele (oddělený čárkou, např. "soubor1.txt,soubor2.doc,soubor3.pdf").

2. Zjistí pomocí `endsWith`, které soubory mají příponu `.txt`.

3. Vypíše názvy těchto souborů.

#### Příklad:

```less
Zadejte seznam souborů: soubor1.txt, soubor2.doc, soubor3.txt, soubor4.pdf
Soubory s příponou .txt: [soubor1.txt, soubor3.txt

]
```

---

**Úkol 3: Modifikace řetězce**
Napište program, který:

1. Načte větu od uživatele.

2. Pomocí `StringBuilder` provede následující operace:

- Přidá na začátek věty text "Začátek: ".

- Z původní věty odstraní poslední 3 znaky.

- Obrátí celý text.

#### Příklad:

```makefile
Zadejte větu: Programování je zábava
Výsledek: avábaz ej nívargorP :ťakáčez
```

---

**Úkol 4: Kontrola struktury textu**
Napište program, který:

1. Načte větu od uživatele.

2. Ověří, zda věta:

- Začíná na velké písmeno pomocí `Character.isUpperCase`.

- Končí tečkou.

3. Pokud věta splňuje obě podmínky, vypíše: "Věta je správně strukturovaná." Jinak vypíše, co je špatně.

#### Příklad:

```bash
Zadejte větu: Toto je test.
Věta je správně strukturovaná.

Zadejte větu: toto je test
Věta nezačíná velkým písmenem.

Zadejte větu: Toto je test
Věta nekončí tečkou.
```

---

**Úkol 5: Rozdělení řetězce na části**
Napište program, který:

1. Načte text obsahující dvě části oddělené dvojtečkou (např. "klíč:hodnota").

2. Rozdělí text na dvě části pomocí `substring`.

3. Vypíše oddělené části s informací, která je klíč a která hodnota.

#### Příklad:

```makefile
Zadejte text: uživatel:jmeno
Klíč: uživatel
Hodnota: jmeno
```

---$