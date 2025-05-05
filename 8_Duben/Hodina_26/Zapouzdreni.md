# Encapsulation

### Obdélník

- vytvořte třídu `Obdelnik`

#### Atributy

- `double stranaA` - délka strany A
- `double stranaB` - délka strany B
- `string Barva` - výplň obdélníku 
- `static ArrayList<String>` - seznam povolených barev (například red, green, blue)

> Délky stran jsou v cm.

#### Metody

- double getStranaA
- double getStranaB
- double getUhlopricka

- void setBarva(String barva)

---

### Předmět

- vytvořte třídu `Predmet`, reprezentující zbraň nebo brnění ve hře

#### Atribut

- String jmeno
- int poskozeni
- int obrana
- int uroven
- static final int MAX_UROVEN - maximální úroveň, kterou může předmět mít

#### Metody
- Konstruktor, který nastaví jméno, poškození, obranu a úroveň zbraně

##### Gettery
- String getJmeno
- int getPoskozeni()
- int getObrana()
- int getUroven()

##### Settery
- void setUroven(int novaUroven)
- boolean vylepsi()
  - zvýší úroveň o jednu, ale nepřesáhne maximální level
  - `True` -> Uspěšně vylepšeno (stačí kontrolo na dosažení maximální úrovně)

### Hráč

- vytvořte třídu `Hrac`

#### Atributy

| Název                         | Typ                  | Popis                                                        |
| ----------------------------- | -------------------- | ------------------------------------------------------------ |
| `jmeno`                       | `String`             | jméno hráče (nesmí být prázdné)                              |
| `zivoty`                      | `int`                | aktuální HP (0 – `MAX_ZIVOTY`)                               |
| `static final int MAX_ZIVOTY` | `100`                |                                                              |
| `inventar`                    | `ArrayList<Predmet>` | batoh všech předmětů                                         |
| `vybaveny`                    | `Predmet`            | aktuálně držený/mechanicky aktivní předmět (může být `null`) |

#### Metody

- Konstruktor
```java
public Hrac(String jmeno); // nastaví jméno a životy na maximum
```

| Signatura                             | Úkol                                                                                   |
| ------------------------------------- | -------------------------------------------------------------------------------------- |
| `String getJmeno()` `int getZivoty()` | gettery                                                                                |
| `void   vylecSe(int kolik)`           | přičti HP (max 100)                                                                    |
| `void   zranSe(int kolik)`            | odečti HP (min 0)                                                                      |
| `void   pridejPredmet(Predmet p)`     | přidá do inventáře                                                                     |
| `boolean vybavPredmet(int index)`     | nastav `vybaveny` podle indexu v inventáři                                             |
| `int    getUtok()`                    | vrací `vybaveny.getPoskozeni()` nebo 1, když není nic                                  |
| `int    getObrana()`                  | vrací `vybaveny.getObrana()` nebo 0                                                    |
| `void   utocNa(Hrac cil)`             | spočítej čisté dmg = útočníkův ÚTOK - cílová OBRANA (min 0), zavolej `cil.zranSe(dmg)` |

