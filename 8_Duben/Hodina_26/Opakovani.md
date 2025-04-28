## Úloha 1 – Auto

**Cíle:**  úplný konstruktor, tři jednoduché gettery

2. Vytvoř třídu `Auto` se soukromými atributy

- `znacka` (`String`)

- `model` (`String`)

- `rokVyroby` (`int`)

4. Napiš konstruktor, který nastaví všechny tři atributy.

6. Implementuj gettery `getZnacka()`, `getModel()`, `getRokVyroby()`.

8. V metodě `main` vytvoř dvě různá auta a vypiš je ve formátu:


```makefile
Auto: Škoda Fabia (2020)
Auto: Tesla Model 3 (2023)
```



---



## Úloha 2 – Produkt

**Cíle:**  setter s validací kladné hodnoty

2. Třída `Produkt` obsahuje atributy

- `nazev` (`String`) — nastavuje se pouze v konstruktoru

- `skladem` (`int`) — počet kusů na skladě

4. Implementuj


- konstruktor pro oba atributy,

- getter `getNazev()`,

- getter `getSkladem()` a **setter**  `setSkladem(int kusu)`.

Setter odmítne záporné číslo a v tom případě nechá původní hodnotu beze změny.

6. Otestuj v `main`:

- vytvoř produkt „Sluchátka“, 15 ks,

- pokus se nastavit −8 ks (nesmí projít),

- vypiš aktuální stav skladu.



---



## Úloha 3 – Bankovní účet

**Cíle:**  více setterů s vnitřní logikou, návratová hodnota

2. Atributy třídy `BankovniUcet`

- `majitel` (`String`)

- `zostatok` (`double`)

4. Konstruktor nastaví jméno majitele a počáteční zůstatek 0 Kč.

6. Metody


- gettery `getMajitel()`, `getZostatok()`

- `vloz(double castka)` — přičte částku, povol pouze hodnoty > 0

- `vyber(double castka)` — odečte částku jen tehdy, pokud zůstatek po výběru nezáporný; vrací `boolean`, zda se výběr povedl

8. V `main` předveď: vklad 500 Kč, neúspěšný výběr 1000 Kč a úspěšný výběr 250 Kč.



---



## Úloha 4 – Teploměr

**Cíle:**  odvozený getter, klasický setter

2. Třída `Teplomer` má atribut `celsius` (`double`).

4. Konstruktor přijme počáteční teplotu v °C.

6. Gettery


- `getCelsius()`

- `getFahrenheit()` — vrací přepočet `(celsius * 9/5) + 32`

8. Setter `setCelsius(double novaTeplota)`.

10. V `main` nastav teploměr na 20 °C a vypiš obě jednotky, následně změň na 37 °C a vypiš znovu.



---



## Úloha 5 – Video hra

**Cíle:**  read-only vs. read-write vlastnosti, validace rozsahu

2. Atributy třídy `VideoHra`

- `nazev` (`String`)

- `rokVydani` (`int`)

- `hodnoceni` (`double`) — 0 až 10

4. Konstruktor nastaví všechny tři atributy.

6. Gettery pro všechna pole, **
   Gettery pro všechna pole, setter pouze pro `hodnoceni`** . Setter přijme jen hodnoty 0 – 10; jinak změnu ignoruje.

8. Přepiš `toString()` tak, aby vracel např.:


```bash
VideoHra{název='Portal 2', rok=2011, hodnocení=9.6}
```

10. V `main` vytvoř pole tří her, jedné se pokus nastavovat hodnocení 12 (nesmí se změnit), a celé pole vypiš pomocí `Arrays.toString()`.



---
