package hodina_6;

import java.util.Random;

public class While {
    public static void main(String[] args) {
        // vypište všechny sudý čísla od 0 - 1000;
        {
            int cislo = 0;
            while (cislo <= 100) {
                System.out.println(cislo);
                cislo += 2;
            }
        } // řešení

        // simulujte hod kostkou, dokud nepadne 6
        {
            Random kostka = new Random();
            int hod;
            do {
                hod = kostka.nextInt(1, 7);
                System.out.println("Hodili jste: " + hod);
            } while(hod != 6);
        } // řešení
    }
}
