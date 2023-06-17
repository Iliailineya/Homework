package org.example.sixHomework;

import org.fusesource.jansi.Ansi;

import java.util.Scanner;

import static org.example.sixHomework.AdditionalString.printMatrixStyleMessage;

public class Main {
    public static void main(String[] args) {

        printMatrixStyleMessage("Hello, Neo");
        printMatrixStyleMessage("Welcome to the Matrix!");
        printMatrixStyleMessage("You have a choice to make: Red or Blue pill?");
        System.out.println(Ansi.ansi().fg(Ansi.Color.RED).a("Enter 'R' for the Red pill").reset());
        System.out.println(Ansi.ansi().fg(Ansi.Color.BLUE).a("Enter 'B' for the Blue pill").reset());
        matrix();

    }

    public static void matrix() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("R")) {
                swallowRedPill();
                break;
            } else if (choice.equals("B")) {
                swallowBluePill();
                break;
            } else {
                System.out.println(Ansi.ansi().fg(Ansi.Color.YELLOW)
                        .a("Invalid choice! Please select 'R' or 'B'.").reset());
            }
        }
    }

    public static void swallowRedPill() {
        System.out.println(Ansi.ansi().fg(Ansi.Color.RED).a("You have chosen the Red pill.").reset());
        GuessWordGame.start();
    }

    public static void swallowBluePill() {
        System.out.println(Ansi.ansi().fg(Ansi.Color.BLUE).a("You have chosen the Blue pill.").reset());
        AdditionalString.test();
    }
}
