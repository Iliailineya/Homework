package org.example.firstHomework;

//        Створити по 1 екземпляру кожного примітивного типу
//        Створити строку двома способами
//        Написати по 2 арифметичні операції з кожною змінною та вивести результат
//        Написати по 2 реляцонні та логічні операції кожного типу та вивести результат,написати 2 тернарні операції та вивести результат
//        Створити змінну 1 та використовуючи інкремент та декремент вивести 1 1 1 0 2 1 1
//        Створити одномірний масив на 10 елементів та заповнити його будь-якими значеннями.Вивести парні числа.


import java.util.*;

 public class FirstHomework {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Press Enter to continue");

//        Створити по 1 екземпляру кожного примітивного типу
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.5f;
        double d = 6.6;
        char c = 'a';
        boolean bool = true;

        Thread.sleep(1000);
        scanner.nextLine();

//        Створити строку двома способами
        System.out.println("Створення рядка двома способами");

        String str1 = new String("Hello World!");
        String str2 = "Hello World!";

        System.out.println(str1);
        System.out.println(str2);

        // Рядки однакові
        System.out.println("Is this the Strings are same? " + str1.equals(str2));
        // але оператор new прямо створює новий лінк, тому референси на них різні
        System.out.println("Is the same Strings make the same link? " + (str1==str2));

        Thread.sleep(1000);
        scanner.nextLine();

//        Написати по 2 арифметичні операції з кожною змінною та вивести результат
        System.out.println("Арифметичні операції з кожною змінною окрім bool");
        byte b_one = (byte) (b + 2);
        byte b_two = (byte) (b * 3);
        System.out.println("Result of first arithmetic byte operation: " + b_one);
        System.out.println("Result of second arithmetic byte operation: " + b_two);
        short s_one = (short) (s - 4);
        short s_two = (short) (s / 2);
        System.out.println("Result of first arithmetic short operation: " + s_one);
        System.out.println("Result of second arithmetic short operation: " + s_two);
        int i_one = i + 5;
        int i_two = i % 2;
        System.out.println("Result of first arithmetic int operation: " + i_one);
        System.out.println("Result of second arithmetic int operation: " + i_two);
        long l_one = l - 6L;
        long l_two = l * 7L;
        System.out.println("Result of first arithmetic long operation: " + l_one);
        System.out.println("Result of second arithmetic long operation: " + l_two);
        float f_one = f + 8.8f;
        float f_two = f / 2.0f;
        System.out.println("Result of first arithmetic float operation: " + f_one);
        System.out.println("Result of second arithmetic float operation: " + f_two);
        double d_one = d - 9.9;
        double d_two = d * 10.0;
        System.out.println("Result of first arithmetic double operation: " + d_one);
        System.out.println("Result of second arithmetic double operation: " + d_two);
        char c_one = (char) (c + 1);
        char c_two = (char) (c*2);
        System.out.println("Result of first arithmetic char operation: " + c_one);
        System.out.println("Result of second arithmetic char operation: " + c_two);

        Thread.sleep(1000);
        scanner.nextLine();

//        Написати по 2 реляцонні та логічні операції кожного типу та вивести результат
        System.out.println("Реляційні операції");
        int testVal_1 = random.nextInt(100);
        int testVal_2 = random.nextInt(100);
        int testVal_3 = random.nextInt(100);
        System.out.println("First value: " + testVal_1 +  "\nSecond value: " + testVal_2 + " \nThird value: " + testVal_3);


        // == - Дорівнює
        System.out.println(testVal_1 == testVal_3);
        System.out.println(testVal_1 == testVal_2);

        // != - Не дорівнює
        System.out.println(testVal_1 != testVal_2);
        System.out.println(testVal_1 != testVal_3);

        // > - Більше
        System.out.println(testVal_1 > testVal_2);
        System.out.println(testVal_2 > testVal_1);

        // < - Менше
        System.out.println(testVal_2 < testVal_1);
        System.out.println(testVal_1 < testVal_3);

        // >= - Більше або рівне
        System.out.println(testVal_1 >= testVal_2);
        System.out.println(testVal_1 >= testVal_3);

        // <= - Менше або рівне
        System.out.println(testVal_1 <= testVal_2);
        System.out.println(testVal_1 <= testVal_3);

        Thread.sleep(1000);
        scanner.nextLine();

        System.out.println("Логічні операції");

        boolean bool_1 = random.nextBoolean();
        boolean bool_2 = random.nextBoolean();
        boolean bool_3 = random.nextBoolean();

        System.out.println("First boolean value: " + bool_1
                +  "\nSecond boolean value: " + bool_2
                + " \nThird boolean value: " + bool_3);

        // & - Логічна операція "І"
        System.out.println(bool_1 & bool_2);
        System.out.println(bool_2 & bool_3);

        // | - Логічна операція "АБО"
        System.out.println(bool_1 | bool_2);
        System.out.println(bool_2 | bool_3);

        // ^ - Логічна операція виключне "АБО"
        System.out.println(bool_1 ^ bool_2);
        System.out.println(bool_1 ^ bool_3);

        // || - Скорочена логічна операція "АБО"
        System.out.println(bool_1 || bool_2);
        System.out.println(bool_2 || bool_3);

        // && - Скорочена логічна операція "І"
        System.out.println(bool_1 && bool_2);
        System.out.println(bool_2 && bool_3);

        // ! - Унарна логічна операція "НІ"
        System.out.println(!bool_1);
        System.out.println(!bool_2);

        // &= - Логічна операція "І" з присвоюванням
        bool_1 &= bool_2;
        System.out.println(bool_1);

        // |= - Логічна операція "АБО" з присвоюванням
        bool_2 |= bool_3;
        System.out.println(bool_2);

        // ^= - Логічна операція виключне "АБО" з присвоюванням
        bool_3 ^= bool_1;
        System.out.println(bool_3);

        Thread.sleep(1000);
        scanner.nextLine();

//        Написати 2 тернарні операції та вивести результат
        System.out.println("Тернарні операції");
        System.out.println(bool_1 ? "bool_1 is true" : "bool_1 is false");
        System.out.println(bool_2 ? "bool_2 is true" : "bool_2 is false");

        Thread.sleep(1000);
        scanner.nextLine();

//        Створити змінну 1 та використовуючи інкремент та декремент вивести 1 1 1 0 2 1 1
        int one = 1;
        System.out.println(one);
        System.out.println(one);
        System.out.println(one--);
        System.out.println(one++);
        System.out.println(++one);
        System.out.println(--one);
        System.out.println(one);

        Thread.sleep(1000);
        scanner.nextLine();

//        Створити одномірний масив на 10 елементів та заповнити його будь-якими значеннями.Вивести парні числа.
        System.out.println("Створення масиву та виведення парних чисел");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int k : arr) {
            if (k % 2 == 0)
                System.out.println(k);
        }
    }
}