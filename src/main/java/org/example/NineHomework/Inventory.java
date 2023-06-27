package org.example.NineHomework;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<String, Integer> INGREDIENTS;

    public Inventory() {
        INGREDIENTS = new HashMap<>();
        // Додавання інгредієнтів для страв
        INGREDIENTS.put("Буряк", 0);
        INGREDIENTS.put("Картопля", 0);
        INGREDIENTS.put("Морква", 0);
        INGREDIENTS.put("Капуста", 0);
        INGREDIENTS.put("Цибуля", 0);
        INGREDIENTS.put("Часник", 0);
        INGREDIENTS.put("М'ясо", 0);
        INGREDIENTS.put("Сметана", 0);
        INGREDIENTS.put("Свинина", 0);
        INGREDIENTS.put("Яйце", 0);
        INGREDIENTS.put("Панірувальні сухарі", 0);
        INGREDIENTS.put("Масло", 0);
        INGREDIENTS.put("М'ясний фарш", 0);
        INGREDIENTS.put("Лазанья", 0);
        INGREDIENTS.put("Пармезан", 0);
        INGREDIENTS.put("Куряче філе", 0);
        INGREDIENTS.put("Салат листовий", 0);
        INGREDIENTS.put("Хліб", 0);
        INGREDIENTS.put("Соус цезар", 0);
        INGREDIENTS.put("Горіхи грецькі", 0);
        INGREDIENTS.put("Спеції", 0);
        INGREDIENTS.put("Тісто для піци", 0);
        INGREDIENTS.put("Томатний соус", 0);
        INGREDIENTS.put("Моцарела", 0);
        INGREDIENTS.put("Базилік", 0);
        INGREDIENTS.put("Помідори", 0);
        INGREDIENTS.put("Огірки", 0);
        INGREDIENTS.put("Сир фета", 0);
        INGREDIENTS.put("Чорниці", 0);
        INGREDIENTS.put("Оливки", 0);
        INGREDIENTS.put("Цибуля червона", 0);
        INGREDIENTS.put("Оливкова олія", 0);
        INGREDIENTS.put("Лимонний сік", 0);
        INGREDIENTS.put("Сіль", 0);
        INGREDIENTS.put("Перець", 0);
        // Додавання інгредієнтів для напоїв
        INGREDIENTS.put("Кавові зерна", 0);
        INGREDIENTS.put("Чайні листочки", 0);
        INGREDIENTS.put("Апельсини", 0);
        INGREDIENTS.put("Лимони", 0);
        INGREDIENTS.put("Вода", 0);
        INGREDIENTS.put("Білий ром", 0);
        INGREDIENTS.put("Лайм", 0);
        INGREDIENTS.put("Цукор", 0);
        INGREDIENTS.put("Содова", 0);
        INGREDIENTS.put("М'ята", 0);
        INGREDIENTS.put("Лід", 0);
        INGREDIENTS.put("Вино червоне", 0);

    }

    public Map<String, Integer> getINGREDIENTS() {
        return INGREDIENTS;
    }

    public void useIngredient(String ingredient, int quantity) {
        int currentQuantity = INGREDIENTS.getOrDefault(ingredient, 0);
        if (currentQuantity >= quantity) {
            INGREDIENTS.put(ingredient, currentQuantity - quantity);
        } else {
            if (currentQuantity == 0) {
                System.out.println("Інгрідієнта " + ingredient + " немає в меню");
            } else {
                System.out.println("Недостатньо " + ingredient + " в комірці");
            }
        }
    }


    public void supply() {
        INGREDIENTS.forEach((key, value) -> {
            int newValue = 1000;
            INGREDIENTS.put(key, newValue);
        });
    }
}

