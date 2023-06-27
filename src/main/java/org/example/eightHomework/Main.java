package org.example.eightHomework;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String rootDirectory = "src/main/java/org/example/eightHomework/resources/";
        TraverseDirectory.createDirectory(rootDirectory, 8);
        loop(rootDirectory);
    }

    public static void continueLoop(String rootDirectory) {
        System.out.println("Would you like to continue?");
        System.out.println("(1) Yes (2) No");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        while (choice != 1 && choice != 2) {
            System.out.println("Invalid choice. Please try again.");
            choice = scanner.nextInt();
        }

        if (choice == 1) {
            loop(rootDirectory);
        }
    }

    public static void loop(String rootDirectory) {
        while (true) {
            System.out.println("Choose an action: (1) Write to files, (2) Read from files");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    TraverseDirectory.traverseDirectory(new File(rootDirectory), true);
                    continueLoop(rootDirectory);
                    return;
                case 2:
                    TraverseDirectory.traverseDirectory(new File(rootDirectory), false);
                    continueLoop(rootDirectory);
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
