package Games;

import java.util.Scanner;

public class Spanzuratoarea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToGuess = "apple";
        int attempts = 6;
        StringBuilder guessedWord = new StringBuilder("_".repeat(wordToGuess.length()));

        while (attempts > 0 && guessedWord.toString().contains("_")) {
            System.out.println("Current word: " + guessedWord);
            System.out.println("Attempts left: " + attempts);

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            boolean found = false;
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (Character.toLowerCase(wordToGuess.charAt(i)) == guess) {
                    guessedWord.setCharAt(i, wordToGuess.charAt(i));
                    found = true;
                }
            }

            if (!found) {
                attempts--;
                System.out.println("Incorrect guess.");
            }
        }

        if (guessedWord.toString().equalsIgnoreCase(wordToGuess)) {
            System.out.println("Congratulations! You guessed the word: " + wordToGuess);
        } else {
            System.out.println("Yau are dead \uD83D\uDC80. The word was: " + wordToGuess);
        }

        scanner.close();
    }
}
