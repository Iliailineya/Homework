package org.example.fiveHomework;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/** Розбитися на пари

 Зробити clone репозиторію напарника

 Зробити fork репозиторію напарника

 Зробити будь-які зміни в окремій гілці та запушити

 Стягнути зміни один одного та додати свої

 Зробити пулреквест у девелоп гілку та змержити у своїх репозиторіях

 ---------------------------------------

 У своєму репозиторії:

 Зробити декілька комітів у двох різних гілках

 Виконати команди: reset (hard, soft), amend, revert.

 Виконати сквош комітів

 Виконати rebase своєї гілки девом

 Виконати cherry-pick у дев гілку
 **/
public class Main {
    public static void main(String[] args) {
        //    Задача на работу с массивами:
        //    Напишите программу, которая принимает на вход массив целых чисел A и число K,
        //    и выводит K-ую порядковую статистику в массиве A (т.е. K-ое наименьшее число в массиве).

        int size = 20;
        int[] arrA = new int[size];
        Arrays.setAll(arrA, i -> ThreadLocalRandom.current().nextInt(30, 101));

        System.out.println(Arrays.toString(arrA));

        Random random = new Random();

        int K = random.nextInt(size + 1);

        System.out.println("K=" + K);
        System.out.println("K-oe порядковое в массиве A = " + findKthStatistic(arrA, K));
    }

    public static int findKthStatistic(int[] arr, int k) {
        Arrays.sort(arr); // сортировка массива по возрастанию
        System.out.println(Arrays.toString(arr));
        return arr[k - 1]; // возвращаем K-ый элемент массива (индексация массивов начинается с 0)
    }
}
