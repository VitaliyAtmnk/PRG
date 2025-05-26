# Opakování na test z OOP

### Termíny

- test bude probíhat na půlených hodinách
- A1, 2.6 Pondělí
- A2, 30.5 Pátek

### Obsah

- 1 úkol, 3 části

#### 1. Třída a objekty
- vytvořit třídu a objekt
- napsat správně atributy a jejich datové typy
- napsat 1 metodu, dle zadání

#### 2. Konstruktor
- vytvořit a přetížit konstruktor

#### 3. Zapouzdření
- správně použít public/private
- správně napsat/vygenerovat gettery a settery

### Příklad zadání
Vytvořte třídu Závod. Závod by měl mít následující atributy:
- Místo konání (`Praha`)
- Čas konání (pro jednoduchost, ukládejte rok, měsíc a den ve 3 atributech)
- Zajistěte, že nelze nastavit datum z minulosti (tj. nelze nastavit rok 2024 a méně, měsíc 5 a méně a den 25 a méně)
Závod by měl mít metodu `public void printInfo()`, která vypíše datum a místo konání závodu.
- Informace o závodě lze nastavit přes konstruktor a datum lze nastavit v pořadí: R,M,D, nebo D,M,R (název může být v obou případech na 1. nebo posledním místě)
- příklad `Závod se koná 16.6 2025, Praha`


