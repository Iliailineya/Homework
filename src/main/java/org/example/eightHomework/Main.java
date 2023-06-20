package org.example.eightHomework;

import java.io.*;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String rootDirectory = "src/main/java/org/example/eightHomework/resources/";
        loop(rootDirectory);
    }

    public static void traverseDirectory(File directory, boolean writeFile) {
        if (!directory.isDirectory()) {
            System.out.println(directory.getAbsolutePath() + " is not a directory.");
            return;
        }

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    traverseDirectory(file, writeFile); // Рекурсивный вызов для обхода вложенной папки
                } else {
                    System.out.println(file.getName());
                    if (writeFile) {
                        writeToFile(file);
                    } else {
                        readFromFile(file);
                    }
                }
            }
        }
    }

    public static void writeToFile(File file) {
        try (BufferedWriter writer = Files.newBufferedWriter(file.toPath())) {
            System.out.println("Enter text to write to file (press Enter to finish):");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = reader.readLine()) != null && !line.isEmpty()) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Text has been written to file: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Error writing to file: " + file.getAbsolutePath());
        }
    }

    public static void readFromFile(File file) {
        try {
            List<String> lines = Files.readAllLines(file.toPath());
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getAbsolutePath());
        }
    }

    public static void continueLoop(String rootDirectory) {
        System.out.println("Would you still have the will to choose?");
        System.out.println("(1) Yes (2) No");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loop(rootDirectory);
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            break;
        }
    }

    public static void loop(String rootDirectory) {
        while (true) {
            System.out.println("Choose an action: (1) Write to files, (2) Read from files");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    traverseDirectory(new File(rootDirectory), true);
                    continueLoop(rootDirectory);
                    break;
                case 2:
                    traverseDirectory(new File(rootDirectory), false);
                    continueLoop(rootDirectory);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            break;
        }
    }
}