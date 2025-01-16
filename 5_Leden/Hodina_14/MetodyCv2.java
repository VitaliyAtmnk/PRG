package Hodina_14;

public class MetodyCv2 {

    // Aktuální stav hry (počet částí panáčka)
    private static int currentStage = 0;

    // Maximální počet částí panáčka (šibenice + hlava, tělo, ruce, nohy)
    private static final int maxStage = 6;

    // Slovo, které chceme uhádnout
    private static String secret = "Heslo";

    // Slovo tvořeny písmeny, které chceme uhádnout
    private static StringBuilder word;

    /**
     * Metoda na vykreslení aktuálního stavu hry
     * @param nextStage true, pokud se stav hry má posunout - uživatel neuhádnul písmeno
     */
    static void drawHangman(boolean nextStage) {
        if (nextStage && currentStage < maxStage) {
            currentStage++;
        }

        System.out.println("\n--- Hangman ---");
        switch (currentStage) {
            case 0:
                System.out.println("\n\n\n\n\n");
                break;
            case 1:
                System.out.println("\n\n\n\n  ===");
                break;
            case 2:
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |\n  ===");
                break;
            case 3:
                System.out.println("  +---+");
                System.out.println("  |");
                System.out.println("  |");
                System.out.println("  |\n  ===");
                break;
            case 4:
                System.out.println("  +---+");
                System.out.println("  |   O");
                System.out.println("  |");
                System.out.println("  |\n  ===");
                break;
            case 5:
                System.out.println("  +---+");
                System.out.println("  |   O");
                System.out.println("  |   |");
                System.out.println("  |\n  ===");
                break;
            case 6:
                System.out.println("  +---+");
                System.out.println("  |   O");
                System.out.println("  |  /|\\");
                System.out.println("  |  / \\");
                System.out.println("  ===");
                break;
        }
    }

    /**
     * Metoda na vykreslení všech aktuálně uhádnutých písmen
     * Například: _e__o
     * @param guess písmeno, které chcemé tipnout
     * @return true, pokud slovo obsahuje písmeno alespoň jednou
     */
    static boolean drawWord(char guess){
        boolean correctGuess = false;

        if(word == null){
            word = new StringBuilder("_".repeat(secret.length()));
        }

        for(int i = 0; i < secret.length(); i++){
            if(secret.charAt(i) == guess){
                word.setCharAt(i, guess);
                correctGuess = true;
            }
        }
        System.out.println("\n--- " + word + " ---");
        return correctGuess;
    }

    /**
     * Metoda pro hraní Hangmana
     * @param guess písmeno, které chcemé uhádnout
     * @return
     */
    static boolean nextRound(char guess){
        if(currentStage == maxStage){
            return true;
        }

        drawHangman(drawWord(guess));

        return secret.contentEquals(word);
    }

    public static void main(String[] args) {
        nextRound('a');
        nextRound('s');
    }

}
