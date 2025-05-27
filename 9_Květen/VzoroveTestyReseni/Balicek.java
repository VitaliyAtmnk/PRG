package VzoroveTestyReseni;

/**
 * Jedno z možných řešení
 */
public class Balicek {
    private String id;
    private double hmotnostKg;
    private double vzdalenostKm;
    private int rok, mesic, den;

    public double cena() {
        double cena = hmotnostKg * 10 + vzdalenostKm * 0.05;
        return cena;

        // alternativně
        // return hmotnostKg * 10 + vzdalenostKm * 0.05
    }

    public Balicek(String id, double hmotnostKg, double vzdalenostKm, int rok, int mesic, int den) {
        this.id = id;

        if (hmotnostKg > 0 && hmotnostKg <= 30) {
            this.hmotnostKg = hmotnostKg;
        }
        if (vzdalenostKm > 0) {
            this.vzdalenostKm = vzdalenostKm;
        }
        // zde stačí podle dnešního datumu -> v tomto případě 26.5.2025
        // pár dní na konci května v takovém případě nelze zapsat, což pro náš případ nevadí
        if (rok > 2025) {
            this.rok = rok;
            this.mesic = mesic;
            this.den = den;
        } else if (rok == 2025 && mesic > 5) {
            this.rok = rok;
            this.mesic = mesic;
            this.den = den;
        }
    }

    public Balicek(String id, double hmotnostKg, int rok, int mesic, int den) {
        this(id, hmotnostKg, 0, rok, mesic, den);
    }

    //////////////////////////// gettery vygenerované přes alt + insert -> getter ////////////////////////////

    public String getId() {
        return id;
    }

    public double getHmotnostKg() {
        return hmotnostKg;
    }

    public double getVzdalenostKm() {
        return vzdalenostKm;
    }

    public int getRok() {
        return rok;
    }

    public int getMesic() {
        return mesic;
    }

    public int getDen() {
        return den;
    }

    ////////////////////// setter

    public void setVzdalenostKm(int vzdalenostKm) {
        if (vzdalenostKm > 0) {
            this.vzdalenostKm = vzdalenostKm;
        }
    }
}
