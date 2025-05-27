package VzoroveTestyReseni;

/**
 * Jedno z možných řešení, vaše se může trochu lišit.
 */
public class KinoPredstaveni {
    private String nazev;
    private int hodina;
    private int minuta;
    private int delkaMin;
    private int volnaMista;

    public void printInfo() {
        System.out.println("KinoPředstavení: " + nazev +
                ", začátek " + hodina + ":" + minuta +
                ", délka " + delkaMin + " min, volno "
                + volnaMista + " míst");
    }

    public KinoPredstaveni(String nazev, int hodina, int minuta, int delkaMin, int volnaMista) {
        this.nazev = nazev;

        if (hodina >= 0 && hodina < 24) {
            this.hodina = hodina;
        }

        if (minuta >= 0 && minuta < 60) {
            this.minuta = minuta;
        }

        if (delkaMin > 0) {
            this.delkaMin = delkaMin;
        }

        if (volnaMista >= 0 && volnaMista <= 200) {
            this.volnaMista = volnaMista;
        }
    }

    public KinoPredstaveni(String nazev, int hodina, int minuta, int delkaMin) {
        // zavolá předchozí konstruktor a předá data
        this(nazev, hodina, minuta, delkaMin, 100);
    }

    //////////////////////////// gettery vygenerované přes alt + insert -> getter ////////////////////////////

    public String getNazev() {
        return nazev;
    }

    public int getHodina() {
        return hodina;
    }

    public int getMinuta() {
        return minuta;
    }

    public int getDelkaMin() {
        return delkaMin;
    }

    public int getVolnaMista() {
        return volnaMista;
    }

    /////////////////// setter /////////////////////////
    public void setVolnaMista(int volnaMista) {
        if (volnaMista >= 0 && volnaMista <= 200) {
            this.volnaMista = volnaMista;
        }
    }
}
