package org.example.fourHomework;

//        Напишите программу, которая запрашивает у пользователя два числа и выполняет одну из следующих операций:
//        Если введенное первое число больше второго, программа выводит на экран сумму двух чисел.
//        Если введенное первое число меньше второго, программа выводит на экран произведение двух чисел.
//        Если введенные числа равны, программа выводит на экран сообщение "Числа равны".
//        Программа должна использовать консольный ввод и вывод, а также обработку исключений,
//        чтобы предотвратить возможность ввода неправильных данных.

import java.util.Scanner;

public class MyTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = readIntFromUser("Enter first number:", scanner);
        int num2 = readIntFromUser("Enter second number:", scanner);

        if (num1 > num2) {
            System.out.println(num1+num2);
        } else if (num1 < num2) {
            System.out.println(num1*num2);
        } else {
            System.out.println("Equals number");
        }

    }

    private static int readIntFromUser(String message, Scanner scanner) {
        System.out.println(message);

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer:");
            scanner.next();
        }

        return scanner.nextInt();
    }
}