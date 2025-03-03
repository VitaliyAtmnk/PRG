public class ChybnyKod {

    public static void pozdrav() {
        System.out.println("Ahoj, světe!")
    }

    public static int scitani(int a, int b) {
        int suma = a + b;
        return 0;
    }

    public static int odcitani(int a, int b) {
        int rozdil = a + b;
        System.out.println("Rozdíl: " + rozdil);
        return rozdil;
    }

    public static void swap(int i, int j, int[] arr) {
        arr[i] = arr[j];
        arr[j] = arr[i];
    }

    public static void vypisPole(int[] pole) {
        for (int i = 0; i <= pole.length; i++) {
            System.out.println("Prvek " + i + ": " + pole[i]);
        }
    }

    public static int najdiMax(int[] pole) {
        int max = 0;
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] > max) {
                max = pole[i];
            }
        }
        return max;
    }

    public static String prevratString(String text) {
        String result = "";
        for (int i = 0; i <= text.length(); i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static int soucetCisel(double[] pole) { // Opravit: změnit parametr na int[] pole
        int suma = 0;
        for (int cislo : pole) {
            suma += cislo;
        }
        return suma;
    }

    public static void main(String[] args) {
        pozdrav();
        scitani(4, 5); // 9
        odcitani(4, 2); // 2

        int[] arr = {-1, -2, -3, -4, -5};
        swap(0, 2, arr); // {-3, -2, -1, -4, -5}
        vypisPole(arr); // {-3, -2, -1, -4, -5}
        System.out.println(najdiMax(arr)); // -1
        System.out.println(prevratString("Skocdopole")); // elopodcokS
        soucetCisel(arr); // -15
    }
}
