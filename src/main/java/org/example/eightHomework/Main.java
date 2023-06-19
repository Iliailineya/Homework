package org.example.eightHomework;

import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String rootDirectory = "C:\\Users\\user\\IdeaProjects\\Homework1\\src\\main\\" +
                "java\\org\\example\\eightHomework\\resources\\";
        traverseDirectory(new File(rootDirectory), true);
        traverseDirectory(new File(rootDirectory), false);
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
}