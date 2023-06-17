package org.example.sixHomework;

import org.fusesource.jansi.Ansi;

public class AdditionalString {

    // Метод, що знаходить кількість входжень символу в рядок
    public static int findSymbolOccurrence(String str, char symbol) {
        int occurrence = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                occurrence++;
            }
        }
        return occurrence;
    }

    // Метод, що знаходить позицію першого входження підрядка у рядку
    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    // Метод, що розгортає рядок у зворотньому порядку
    public static String stringReverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Метод, що перевіряє, чи є рядок паліндромом
    public static boolean isPalindrome(String input) {
        input = input.toLowerCase();
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            char firstChar = input.charAt(start);
            char lastChar = input.charAt(end);

            if (!Character.isLetter(firstChar)){
                start++;
                continue;
            }
            if (!Character.isLetter(lastChar)){
                end--;
                continue;
            }

            if (firstChar != lastChar) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void printMatrixStyleMessage(String message) {
        for (int i = 0; i < message.length(); i++) {
            Ansi ansi = Ansi.ansi();
            ansi.fg(Ansi.Color.GREEN);
            ansi.a(message.charAt(i));
            ansi.reset();
            System.out.print(ansi);
            sleep();
        }

        System.out.println();
    }

    private static void sleep() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void test(){
        System.out.println("Метод, що знаходить кількість входжень символу в рядок");
        String str = "Hello, World!";
        char symbol = 'o';
        int symbolOccurrence = AdditionalString.findSymbolOccurrence(str, symbol);
        System.out.println("Number of occurrences of '" + symbol + "' in the string: " + symbolOccurrence);
        System.out.println();

        System.out.println("Метод, що знаходить позицію першого входження підрядка у рядку");
        String source = "Hello, World!";
        String target = "World";
        int wordPosition = AdditionalString.findWordPosition(source, target);
        System.out.println("Position of the word '" + target + "' in the string: " + wordPosition);
        System.out.println();

        System.out.println("Метод, що розгортає рядок у зворотньому порядку");
        String input = "Hello";
        String reversedString = AdditionalString.stringReverse(input);
        System.out.println("Reversed string: " + reversedString);
        System.out.println();

        System.out.println("Метод, що перевіряє, чи є рядок паліндромом");
        String palindrome = "А роза упала на лапу Азора!";
        boolean isPalindrome = AdditionalString.isPalindrome(palindrome);
        System.out.println("Is '" + palindrome + "' a palindrome? " + isPalindrome);
    }
}

