package org.example.sixHomework;

public class Additional {

//    Створити метод findSymbolOccurrence. Метод приймає як параметр рядок і символ.
//    Необхідно обчислити, скільки разів символ зустрічається в переданому рядку і повернути це числове значення.
    public static int findSymbolOccurrence(String str, char symbol) {
        int occurrence = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) {
                occurrence++;
            }
        }
        return occurrence;
    }

//    Створити метод findWordPosition. Метод приймає як параметри два рядки (source, target).
//    Необхідно з'ясувати, чи є target (підрядок) частиною рядка source.
//    Якщо так, тоді повернути номер позиції (індекс) першого елемента підрядка у рядку, інакше повернути -1.
    public static int findWordPosition(String source, String target) {
        int position = source.indexOf(target);
        return position;
    }

//    Створити метод stringReverse. Метод приймає як параметр - рядок.
//    Необхідно її розгорнути та повернути змінений варіант.
    public static String stringReverse(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

}
