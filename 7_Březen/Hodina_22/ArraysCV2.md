## 1) Evidence žáků v několika třídách

**Popis:**

Představ si, že jsi třídní učitel (nebo zástupce ředitele) a potřebuješ evidovat žáky podle tříd. Máš několik tříd,
přičemž v každé třídě je seznam žáků.

1. Vytvoř **vnější**  `ArrayList`, v němž každý prvek bude **další**  `ArrayList<String>`.

- Vnější `ArrayList` bude reprezentovat „seznam tříd“.

- Každý vnitřní `ArrayList<String>` bude reprezentovat konkrétní třídu a v ní uložená jména žáků.

2. Načti od uživatele, **kolik tříd**  chce evidovat. Podle počtu tříd inicializuj vnější seznam tak, aby měl přesně
   tolik vnitřních seznamů.

3. Poté, pro každou třídu (tj. pro každý vnitřní `ArrayList`):

- Zeptej se uživatele, **kolik žáků**  chce do dané třídy vložit.

- V cyklu zadej jména těchto žáků a ulož je do vnitřního seznamu.

4. Po naplnění všech tříd vypiš **kompletní seznam** :

- Tedy pro každou třídu (číslování od 1) vypiš jména žáků, případně i s indexy.

5. **Bonus** : Nech uživatele vybrat, ve které třídě chce někoho **vymazat**  (např. z důvodu odchodu žáka). Potom se
   zeptej na jméno a pokud bude v dané třídě nalezeno, odstraň ho. Po úpravě opět vypiš aktualizovaný stav seznamu.

- Úkázka vstupu a výstupu:
```yaml
Zadejte počet tříd: 5
Zadejte počet žáků v 1. třídě: 3
Zadej jména žáků:
Katka
Pepa
Jan
Zadejte počet žáků v 2. třídě: 2
Zadej jména žáků:
Karel
Ludvík
Zadejte počet žáků v 2. třídě: 4
Zadej jména žáků:
Tonda
Jůlie
Hanka
Ctirad
Seznam žáků:
1. třída: [Katka, Pepa, Jan]
2. třída: [Karel, Ludvík]
3. třída: [Tonda, Jůlie, Hanka, Ctirad]
```
---



## 2) Správa úkolů rozdělených do kategorií

**Popis:**
Představ si klasický to-do list, ale tentokrát chceš mít úkoly rozdělené do několika **kategorií**  (například „Doma“,
„Práce“, „Zábava“). V každé kategorii může být jiný počet úkolů a uživatel může úkoly přidávat/odebírat.

1. Vytvoř `ArrayList<ArrayList<String>>`, kde:

- Vnější `ArrayList` představuje **seznam všech kategorií** .

- Každý vnitřní `ArrayList<String>` představuje **konkrétní kategorii**  a v ní řadu úkolů.

2. Nech uživatele předem definovat **počet kategorií**  a jejich **názvy** . (Názvy kategorií můžeš uložit buď do
   souběžného `ArrayList<String>`, nebo si je zapamatovat jinak; důležité je, že pro každou kategorii existuje
   odpovídající index ve vnějším seznamu.)

3. Pro každou kategorii (tj. pro každý vnitřní seznam) nabídni uživateli operace:


- **Přidat úkol**  (uživatel zadá text úkolu),

- **Vypsat všechny úkoly** ,

- **Odebrat úkol**  (na základě textu nebo indexu),

- **Ukončit zadávání a přejít k další kategorii** .

4. Uživatel tedy pro kategorii „Doma“ může postupně vkládat úkoly (např. „Vynést odpadky“, „Vyprat prádlo“…), pak se
   rozhodne přejít na kategorii „Práce“, atd.

5. Na závěr programu (když uživatel ukončí zadávání pro všechny kategorie) vypiš **celkový přehled** :

- Pro každou kategorii zobraz její název a veškeré úkoly, které v ní zůstaly (po případných smazáních).

---

## 3) Tabulka výsledků z více zápasů / disciplín

**Popis:**

Představ si, že organizuješ turnaj nebo více soutěžních kol a chceš pro každý zápas/disciplinu evidovat bodové výsledky
všech hráčů (nebo týmů). Každý zápas tak bude mít vlastní seznam bodových záznamů.

1. Vytvoř `ArrayList<ArrayList<Integer>>`, kde:

- Vnější `ArrayList` představuje **seznam zápasů**  (případně disciplín).

- Každý vnitřní `ArrayList<Integer>` představuje **bodové ohodnocení**  (výsledky) všech hráčů v daném zápase.

2. Nech uživatele zadat, **kolik zápasů**  bude chtít evidovat.

3. Pro **každý**  zápas vytvoř vnitřní `ArrayList<Integer>` a načítej body:

- Nech uživatele zadávat body hráčů tak dlouho, dokud nezadá např. „-1“ jako signál pro ukončení zadávání bodů pro tento
  zápas.

- Uložené body vlož do příslušného vnitřního seznamu.

4. Po vyplnění všech zápasů vypiš pro **každý zápas**  jeho **pořadí**  (tj. zápas č. 1, zápas č. 2, …) a vypiš všechny
   body, které se v něm sebraly.

5. **Bonusové úpravy:**

- Pro každý zápas vypočítej a vypiš průměr, případně maximum či minimum bodů.

- Umožni uživateli vybrat konkrétní zápas a odstranit určitý bodový záznam (například pokud někdo zadal chybně body).

---

