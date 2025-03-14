## ArrayList úkoly

### 1) Evidence objednávek pro rozvoz jídla

**Popis:**

Představte si, že pracujete jako dispečer rozvozu jídla. Potřebujete ukládat seznam objednávek (například názvy jídel
nebo jejich čísla) a průběžně je zpracovávat.

1. Vytvořte `ArrayList<String>` pro uložení názvů objednaných jídel.

2. Z konzole načítejte názvy jídel tak dlouho, dokud uživatel nenapíše `konec`.

3. Po zadání `konec` vypište všechny uložené objednávky a zároveň vypište jejich počet.

4. Vypište uživateli dotaz, zda některou objednávku nechce zrušit. Pokud ano, zadejte název objednávky a smažte ji ze
   seznamu (pokud tam existuje).

5. Na konci znovu vypište upravený seznam objednávek.

---

### 2) Správa kontaktů v (jednoduchém) telefonním seznamu

**Popis:**

Máte kontakty na své známé a přátele. Chcete si je ukládat do seznamu, zobrazovat a případně je mazat.

1. Vytvořte `ArrayList<String>` pro jména nebo celé záznamy kontaktů (můžete zjednodušeně uchovávat jen jméno, nebo
   „Jméno – Telefonní číslo“).

2. Nabídněte uživateli několik voleb:

- Přidat nový kontakt,

- Vypsat všechny kontakty,

- Smazat kontakt dle jména,

- Konec programu.

3. V programu tedy průběžně vyhodnocujte, co uživatel zvolil, a podle toho se `ArrayList` upraví (přidáte, zobrazíte,
   smažete).

4. Při smazání kontaktu se uživatele zeptejte na přesný text jména. Pokud v seznamu bude, smažte ho.

---

### 3) Seznam úkolů (to-do list)

**Popis:**

Vytvořte malou aplikaci, která simuluje to-do list, do kterého si člověk ukládá úkoly a spravuje je.

1. Vytvořte `ArrayList<String>` pro uložení úkolů.

2. Uživatel může opakovaně vkládat nový úkol, dokud nezadá klíčové slovo (např. `-1`), které značí ukončení zadávání.

3. Po zadání klíčového slova vypište celý seznam úkolů.

4. Následně se zeptejte, zda chce uživatel nějaký úkol označit za splněný. Pokud ano, vyžádejte si index nebo přesný
   text úkolu a odeberte ho ze seznamu.

5. Po odebrání splněného úkolu vypište znovu celý seznam, abyste viděli aktuální stav.

---

### 4) Jednoduchý pokladní systém (var. se vstupem cen)

**Popis:**

Tato úloha se podobá příkladu s vkládáním cen nákupu, ale místo pole použijte `ArrayList<Integer>`.

1. Vytvořte `ArrayList<Integer>`, kam budete ukládat ceny položek nákupu.

2. Uživatel postupně zadává cenu každé položky; zadáním čísla `-1` ukončí nákup.

3. Po ukončení vypište všechny zadané ceny.

4. Současně spočítejte a vypište součet všech cen (celkovou útratu).

5. Volitelně: Zeptejte se, zda chce uživatel odstranit některou položku ze seznamu (třeba pokud se spletla obsluha), a
    následně ji odstraňte na základě indexu nebo konkrétní zadané hodnoty.

---

### 5) Evidence bodů ze soutěže

**Popis:**

Představte si, že organizujete sportovní soutěž. Účastníci postupně získávají body, jak plní různé disciplíny.

1. Vytvořte `ArrayList<Integer>` pro uložení získaných bodů.

2. V cyklu načítejte počet bodů každého účastníka (může jich být neomezeně). Uživatel vždy zadá bodové ohodnocení a vy
   je přidáte do seznamu. Zadání ukončíte třeba slovem `stop`.

3. Po ukončení zadávání bodů:

- Vypište celý seznam bodů,

- Spočítejte a vypište průměr bodů (abychom věděli, jak byla disciplína obtížná nebo jednoduchá).

- Najděte a vypište maximální počet bodů.

4. Volitelně nechte uživatele vyřadit chybný záznam (například pokud se někdo přepsal) — zadejte index bodu, který se má
   odstranit.


