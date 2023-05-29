package org.example.fourHomework;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 Основні команди git:

 git status

 Створити новий репозиторій
 git init

 git add filename

 git add .

 git commit

 git commit -m "Commit message"

 Додати сервер куди відправлятимуть бекапи під умовним ім'ям "origin"

 git remote add origin your_rremote_repo_adress

 Створити гілку homework2 і перейти до неї

 git checkout -b homework2

 Перейти в існуючу гілку

 git checkout master

 Вивести список гілок

 git branch -v

 Відправити всі коміти з поточної гілки в гілку master на сервер параметр -u означає upstream:
 запам'ятати куди ми відправили і надалі при команді "git push" відправляти туди ж

 git push -u origin master

 git push

 Перейти у гілку homework2 і відправити її на сервер у гілку homework2:

 git checkout homework2

 git push -u origin homework2

 Як створити SSH ключ:

 <a href="https://docs.github.com/en/authentication/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent">...</a>

 Як додати SSH ключ на github:

 <a href="https://docs.github.com/en/authentication/connecting-to-github-with-ssh/adding-a-new-ssh-key-to-your-github-account">...</a>
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        try {
            System.out.print("Введите первое число: ");
            num1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            num2 = scanner.nextInt();

            if (num1 > num2) {
                System.out.println("Сумма двух чисел: " + (num1 + num2));
            } else if (num1 < num2) {
                System.out.println("Произведение двух чисел: " + (num1 * num2));
            } else {
                System.out.println("Числа равны.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено неправильное значение.");
        }
    }
}
