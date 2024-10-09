# Zadání testu

### Povolené zdroje informací

- vlastní zdrojové kódy z minulých hodin
- [GitHub](https://github.com/VitaliyAtmnk/PRG) z výuky

## Oddělení A

### Příklad 1

#### Zadání

- Aby člověk mohl darovat krev, musí mu být alespoň 18 let.
- Nesmí mu být více než 65 let.
- Zeptejte se uživatele na věk a poté vypište, zda může darovat krev.

#### Vstup

- Předpodkládejte vždy vstup od uživatele v rozsahu 0 - 100;
- Uživatel vždy zadá validní vstup (Né číslo s desetinou čárkou, řetězec, znak, apod.)
- Uživatel zadá právě jedno číslo.

#### Výstup

- Pokud splní všechny podmínky -> `Můžete darovat krev.`
- Pokud nesplní všechny podmínky -> `Nemůžete darovat krev.`

### Příklad 2

#### Zadání

- Simulujete tažení karet, ty mají hodnoty 1 – 12.
- Uživatel si táhne dvě (čísla jsou náhodně vygenerovaná).
- Uživatel vyhraje, pokud součet je přesně 21 anebo je menší než 10.
- Vypište, zda uživatel vyhrál.

#### Vstup

- není vyžadován

#### Výstup

- Hodnotu obou vygenerovaných karet
- Dle uvedené podmínky `Vyhrál/Prohrál`

### Příklad 3

#### Zadání

- Uživateli prodáváte gin.
- Uživatel zadá počet lahví, cena 1 ginu je 540,-
- Pokud je množství lahví do pěti, uživatel platí plnou sazbu.
- Pokud objednává do deseti lahví, má množstevní cenu 10 %.
- Pokud objednává do 50 lahví, má množstevní slevu 20 %.
- Pokud si objedná více, tak mu objednávku bude zamítnuta, protože se pravděpodobně jedná o překupnictví, to je trestné.
- Vypište, jakou celkovou cenu zaplatí, pokud bude objednávka zamítnuta, vypište tuto informaci do konzole a celková
  cena bude 0,

#### Vstup

- Předpodkládejte vždy vstup od uživatele v rozsahu 0 - 100;
- Uživatel vždy zadá validní vstup (Né číslo s desetinou čárkou, řetězec, znak, apod.)
- Uživatel zadá právě jedno číslo.

#### Výstup

- Celková cena za objednávku.
- 0, pokud je objednávká zamítnuta a chybová hláška `Pokus o překupnictví`. 

## Oddělení B

### Příklad 1

#### Zadání

- Aby člověk mohl darovat krev, musí vážit více než 50 kg a méně než 170 kg (nosnost křesla)
- Zeptejte se uživatele na váhu a vypište, zda může darovat krev.

#### Vstup

- Předpodkládejte vždy vstup od uživatele v rozsahu 0 - 300;
- Uživatel vždy zadá validní vstup (Né číslo s desetinou čárkou, řetězec, znak, apod.)
- Uživatel zadá právě jedno číslo.

#### Výstup

- Pokud splní všechny podmínky -> `Můžete darovat krev.`
- Pokud nesplní všechny podmínky -> `Nemůžete darovat krev.`

### Příklad 2

#### Zadání

- Simulujete hození tří kostek.
- Kostky mají klasicky hodnotu 1 - 6, generovanou náhodně.
- Uživatel vyhrál, pokud jsou alespoň dvě kostky stejné
- Vypište, zda uživatel vyhrál.

#### Vstup

- Není vyžadován

#### Výstup

- Hodnoty všech hozených kostek
- Dle uvedené podmínky `Vyhrál/Prohrál`

### Příklad 3

#### Zadání

- Uživatel bude platit za elektřinu. 
- Do programu zadá svou spotřebu (kWh).
- Podle toho, kolik spotřeboval, tak mu bude vypočtena cena za 1 kWh. 
- Ceník je:

  | spotřeba v kWh | Cena za 1 kWh |
  |----------------|---------------|
  | 0 – 199        | 8  Kč         |
  | 200 – 399      | 7  Kč         |
  | 400 - 599      | 6  Kč         |
  | 600 a více     | 5  Kč         |
#### Vstup
- spotřeba elektřiny
- vždy celé číslo v rozmezí 0 - 10 000
- Uživatel vždy zadá validní vstup (Né číslo s desetinou čárkou, řetězec, znak, apod.)
- Uživatel zadá právě jedno číslo.

#### Výstup
- Cena za elektřínu