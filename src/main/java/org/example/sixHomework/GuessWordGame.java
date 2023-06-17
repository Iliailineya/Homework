package org.example.sixHomework;

import java.util.Random;
import java.util.Scanner;

import static org.example.sixHomework.AdditionalString.printMatrixStyleMessage;

public class GuessWordGame {
    private static final String[] WORDS = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango",
            "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private static final String TARGET_WORLD = getRandomWord();

    public static void start() {
        printMatrixStyleMessage("Welcome to Guess the Word Game!");
        printMatrixStyleMessage("Try to guess the word. It consists of " + TARGET_WORLD.length() + " letters.");
        printMatrixStyleMessage("Enter your guess:");


        Scanner scanner = new Scanner(System.in);
        while (true) {
            String guess = scanner.nextLine().toLowerCase();

            if (guess.equals(TARGET_WORLD)) {
                printMatrixStyleMessage("Congratulations! You guessed the word correctly.");
                break;
            } else {
                String feedback = provideFeedback(guess);
                printMatrixStyleMessage(feedback);
            }
        }

        scanner.close();
    }

    private static String getRandomWord() {
        Random random = new Random();
        int index = random.nextInt(WORDS.length);
        return WORDS[index];
    }

    private static String provideFeedback(String guess) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < TARGET_WORLD.length(); i++) {
            if (i < guess.length() && TARGET_WORLD.charAt(i) == guess.charAt(i)) {
                sb.append(TARGET_WORLD.charAt(i));
            } else {
                sb.append("#");
            }
        }

        return sb.toString();
    }
}

