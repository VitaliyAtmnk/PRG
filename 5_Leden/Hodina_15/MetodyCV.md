# Metody

### 1. **Verifikace věku**
1. Vytvořte metodu, která načte od uživatele věk a ten vrátí.
2. Vytvořte metodu, která na základě věku vypíše, zda uživatel může pít alkohol či nikoliv.

### 2. **Výpočet obvodu a obsahu obdélníku**
1. Vytvořte statickou metodu, která načte od uživatele délky dvou stran obdélníku (např. `a` a `b`) a vrátí je jako dvojici čísel (např. dvě hodnoty přes volání metody dvakrát).
2. Vytvořte statickou metodu, která přijme délky stran obdélníku jako parametry a vrátí jeho obvod.
   - Vzorec pro obvod: `2 * (a + b)`
3. Vytvořte další statickou metodu, která přijme délky stran obdélníku jako parametry a vrátí jeho obsah.
   - Vzorec pro obsah: `a * b`

### 3. **Generátor uživatelského jména**
1. Vytvořte metodu, která načte od uživatele jeho jméno a příjmení.
2. Vytvořte metodu, která přijme jméno a příjmení jako parametry a vrátí návrh uživatelského jména.
- Uživatelské jméno by mohlo být například:
   - První tři písmena jména + první tři písmena příjmení (malými písmeny).
   - Pokud je délka jména nebo příjmení menší než 3 znaky, použijte vše.
   - Můžete si vytvořit i vlastní pravidla pro generování uživatelských jmen (přidat do jména číslici, emoji, opakovat čás řetězce, atd.)
     - přidání vlastního pravidla je odměněno známkou s váhou 3, jinak S/N (Splněno/Neodevzdáno)
3. Vytvořte metodu, která přijme uživatelské jméno a ověří, zda je delší než 5 znaků. Pokud není, upozorněte uživatele, že uživatelské jméno je příliš krátké, a doporučte mu přidat nějaký znak navíc.
4. Propojte vše v hlavní metodě a vypište výsledné uživatelské jméno.


---

**Příklad výstupu 1:**

```yaml
Zadejte své jméno: Jan
Zadejte své příjmení: Novák
Navrhované uživatelské jméno: jannov
Vaše uživatelské jméno je v pořádku.
```
**Příklad výstupu 2:**

```yaml
Zadejte své jméno: Al
Zadejte své příjmení: Bo
Navrhované uživatelské jméno: albo
Uživatelské jméno je příliš krátké. Přidejte další znak!
```

### 4. **Součet číslic čísla pomocí rekurze**
1. Vytvořte statickou metodu `sumOfDigits(int n)`, která pomocí **rekurze** spočítá součet všech číslic zadaného čísla `n`.
   - Pokud uživatel zadá záporné číslo, převeďte ho na kladné (`Math.abs()`).

   - Rekurzivní definice:
       - Pokud je číslo jednociferné, jeho součet číslic je číslo samotné.
       - Jinak: Součet číslic čísla `n` = poslední číslice (`n % 10`) + součet číslic zbývající části (`n / 10`).
2. V hlavní metodě:
   - Načtěte číslo od uživatele.
   - Zavolejte metodu `sumOfDigits` a vypište výsledek.


---

**Příklad výstupu:**

```yaml
Zadejte číslo: 1234
Součet číslic čísla 1234 je: 10  // (1 + 2 + 3 + 4 = 10)
```


```yaml
Zadejte číslo: -567
Součet číslic čísla 567 je: 18
```
