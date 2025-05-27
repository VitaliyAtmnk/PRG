package VzoroveTestyReseni;

public class Main {
    public static void main(String[] args) {
        // Test 1
        KinoPredstaveni predstaveni = new KinoPredstaveni("Interstellar", 19, 20, 180);
        predstaveni.printInfo();

        // Test 2
        Balicek ppl = new Balicek("1ADSSA254", 1.25, 15.5, 2025, 6, 12);
        System.out.println(ppl.cena());
    }
}
