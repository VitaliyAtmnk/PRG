# Bonus

### Validace hesla

- Načtěte od uživatele heslo a zkontrolujte, zda vyhovuje požadavkům
    - Alespoň 12 znaků
    - Žádné bíle znaky na **konci**, nebo **začátku**
    - obsahuje slovo `red` (v jakékoliv podobě (Red, rEd, atd.))
    - neobsahuje slovo `vacek` (v jakékoliv podobě)
    - končí hvězdičkou

### Převod soustavy

- Načtěte od uživatele řetězec reprezentující číslo v dvojkové soustavě.
- Převeďte na desítkovou soustavu

### Počet slov

- Spočítejte počet slov v textu.
- Slova nemusí doopravdy existovat, takže např.:
    - adsfasdf Dobré ránoooo `počet slov = 3`

### Palindrom

- Načtěte od uživatele text a vypište, zda se jedná o palindrom.
- Prázdný řetězec se považuje za palindrom.
- Pokud uživatel zadá nečitelné znaky (mezery, tabulátory, a jiné bílé znaky), tak je odignorujete
    - `abba` i `____abba__` jsou palindrom  (_ je znak pro mezeru)
- velikost písmen nehraje roli
    - `abbA` == `abbA` == `ABbA` atd.

### Kontrola platnosti e-mailové adresy

- Načtěte od uživatele e-mailovou adresu a zkontrolujte, zda splňuje následující požadavky:
    - Obsahuje přesně jednu zavináč `@`.
    - Zavináč nesmí být na prvním ani posledním místě adresy.
    - Doména (část za zavináčem) obsahuje alespoň jednu tečku (`.`).
    - Doména nekončí tečkou (`.`).
    - Adresa nesmí obsahovat mezery.

Příklad:

- Platné: `user.name@example.com`
- Neplatné: `@example.com`, `user@example.`, `user@@example.com`, `user@ example.com`


### Úkol 2: Skládání zkratky z textu

- Načtěte od uživatele větu a vytvořte z ní zkratku podle následujících pravidel:
    - Zkratka je složena z prvních písmen každého slova ve větě.
    - Písmena ve zkratce jsou velká.
    - Ignorujte jakékoliv speciální znaky, čísla a bílé znaky (mezery, tabulátory).
    - Pokud je věta prázdná nebo obsahuje pouze ignorované znaky, zkratka bude prázdná.

Příklad:

- Vstup: `Hello world!`
    - Výstup: `HW`

- Vstup: `Good Morning 123 People!`
    - Výstup: `GMP`

- Vstup:``
    - Výstup: `` (prázdná zkratka)