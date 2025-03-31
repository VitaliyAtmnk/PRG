1. **Třída Osoba**

- **Atributy:**

    - jméno

    - věk

- **Metody:**

    - metoda pro zobrazení informací o osobě (vypíše jméno a věk)

2. **Třída Kniha**

- **Atributy:**

  - název knihy

  - autor

- **Metody:**

  - metoda pro zobrazení informací o knize (vypíše název a autora)


3. **Třída Kruh**

- **Atributy:**

    - poloměr

- **Metody:**

    - metoda pro výpočet a vrácení obsahu kruhu (na základě zadaného poloměru)
        - hodnotu π lze získat pomocí Math.PI
    - metoda pro výpočet a vrácení obvodu

4. **Třída Auto**

- **Atributy:**

    - SPZ
    - značka
    - aktuální rychlost
    - najete KM

- **Metody:**

    - metoda pro zobrazení stavu auta (vypíše značku, aktuální rychlost v km/h)
    - metoda pro změnu aktuální rychlosti
    - metoda jezdit, která jako argument vezme čas v minutách a "pojede" po dobu zadanou od uživatele konstántní
      rychlostí, která je uložená v aktuální rychlosti

- **Bonus**
    - upravte předchozí třídu `Osoba` a přidejte atribut Auto
    - poté vypište značku auta

  
5. **Třída Student**

- **Atributy:**

    - jméno

    - známky

- **Metody:**

    - metoda pro vypsání průměrů všech známek
    - metoda generujZnamku() - vrátí známku 1 - 5
    - metoda generujZnamky(int pocetZnamek) - zavolá metodu generujZnamku() * `pocetZnamek`
