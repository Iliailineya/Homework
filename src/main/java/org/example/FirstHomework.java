package org.example;

//        Створити по 1 екземпляру кожного примітивного типу
//        Створити строку двома способами
//        Написати по 2 арифметичні операції з кожною змінною та вивести результат
//        Написати по 2 реляцонні та логічні операції кожного типу та вивести результат,написати 2 тернарні операції та вивести результат
//        Створити змінну 1 та використовуючи інкремент та декремент вивести 1  1 1 0 2 1 1
//        Створити одномірний масив на 10 елементів та заповнити його будь-якими значеннями.Вивести парні числа.

public class FirstHomework {
    public static void main(String[] args) {
        // створення екземплярів примітивних типів
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.5f;
        double d = 6.6;
        char c = 'a';
        boolean bool = true;

        // створення рядка двома способами
        String str1 = new String("Hello World!");
        String str2 = "Hello World!";

        // арифметичні операції з кожною змінною окрім bool
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


        // реляційні та логічні операції
        boolean bool_one = i > l;
        boolean bool_one1 = i < l;

        boolean bool_two = f <= d;
        boolean bool_two1 = f >= d;

        boolean bool_res3 = s == c;
        boolean bool_res31 = s == d;

        boolean bool_res4 = b != l;

        boolean bool_res5 = bool && bool_one;

        boolean bool_res6 = !bool || bool_two;

        // тернарні операції
        int res1 = (i > 0) ? 1 : -1;
        int res2 = (i == 0) ? 0 : ((i > 0) ? 1 : -1);

        // створення та виведення масиву
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) j++;
        }
    }
}