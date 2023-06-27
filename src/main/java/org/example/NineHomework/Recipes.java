package org.example.NineHomework;

public class Recipes {

    public static final Inventory inventory = new Inventory();

    public Recipes() {
        inventory.supply();
    }
    public void doBorsch() {
        inventory.useIngredient("Буряк", 200);
        inventory.useIngredient("Картопля", 150);
        inventory.useIngredient("Морква", 100);
        inventory.useIngredient("Капуста", 100);
        inventory.useIngredient("Цибуля", 50);
        inventory.useIngredient("Часник", 10);
        inventory.useIngredient("М'ясо", 200);
        inventory.useIngredient("Сметана", 50);
    }
    public void doSchnitzel() {
        inventory.useIngredient("Свинина", 200);
        inventory.useIngredient("Яйце", 40);
        inventory.useIngredient("Панірувальні сухарі", 100);
        inventory.useIngredient("Картопля", 200);
        inventory.useIngredient("Масло", 50);
    }
    public void doLasagna() {
        inventory.useIngredient("М'ясний фарш", 300);
        inventory.useIngredient("Лазанья", 200);
        inventory.useIngredient("Томатний соус", 200);
        inventory.useIngredient("Моцарела", 150);
        inventory.useIngredient("Пармезан", 50);
        inventory.useIngredient("Спеції", 10);
    }
    public void doCaesarSalad() {
        inventory.useIngredient("Куряче філе", 200);
        inventory.useIngredient("Салат листовий", 150);
        inventory.useIngredient("Хліб", 50);
        inventory.useIngredient("Пармезан", 50);
        inventory.useIngredient("Соус цезар", 50);
        inventory.useIngredient("Яйце", 80);
        inventory.useIngredient("Горіхи грецькі", 30);
        inventory.useIngredient("Спеції", 10);
    }
    public void doPizza() {
        inventory.useIngredient("Тісто для піци", 200);
        inventory.useIngredient("Томатний соус", 100);
        inventory.useIngredient("Моцарела", 150);
        inventory.useIngredient("Помідори", 100);
        inventory.useIngredient("Базилік", 20);
        inventory.useIngredient("Сіль", 15);
        inventory.useIngredient("Оливкова олія", 30);
    }
    public void doGreekSalad() {
        inventory.useIngredient("Помідори", 150);
        inventory.useIngredient("Огірки", 100);
        inventory.useIngredient("Сир фета", 100);
        inventory.useIngredient("Чорниці", 50);
        inventory.useIngredient("Оливки", 50);
        inventory.useIngredient("Цибуля червона", 50);
        inventory.useIngredient("Оливкова олія", 30);
        inventory.useIngredient("Лимонний сік", 30);
        inventory.useIngredient("Сіль", 10);
        inventory.useIngredient("Перець", 10);
    }
    public void doCoffee() {
        // Додавання інгредієнтів для напоїв
        inventory.useIngredient("Кавові зерна", 10);
        inventory.useIngredient("Вода", 150);
        inventory.useIngredient("Цукор", 20);
    }
    public void doTea() {
        inventory.useIngredient("Чайні листочки", 5);
        inventory.useIngredient("Вода", 150);
        inventory.useIngredient("Цукор", 10);
    }
    public void doJuice() {
        inventory.useIngredient("Апельсини", 500);
    }
    public void doLemonade() {
        inventory.useIngredient("Лимони", 300);
        inventory.useIngredient("Вода", 200);
        inventory.useIngredient("Цукор", 50);
    }
    public void doMohito() {
        inventory.useIngredient("Білий ром", 50);
        inventory.useIngredient("Лайм", 100);
        inventory.useIngredient("Цукор", 20);
        inventory.useIngredient("Содова", 100);
        inventory.useIngredient("М'ята", 10);
        inventory.useIngredient("Лід", 100);
    }
    public void doVine() {
        inventory.useIngredient("Вино червоне", 150);

    }
}


