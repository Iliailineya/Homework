package org.example.thirdHomework.shape;

import org.example.thirdHomework.myInterface.*;

/**
 *     Абстрактний клас без можливості створення екземплярів
 *     Імплементує інтерфейс Resizable (отже і методи батьківського інтерфейсу Dimensional) та Identifiable,
 *     що означає, що всі неабстрактні нащадки будуть мати їх поведінку
 *     Характеристики: тип фігури, розмірність
 *     Методи: абстрактний метод обчислення кількості кутів, конструктор, геттери і сеттери для характеристик
**/

public abstract class Shape implements Resizable, Identifiable {
    private String type;
    private int dimensions;

    public Shape(String type, int dimensions) {
        this.type = type;
        this.dimensions = dimensions;
    }

    public abstract void numOfAngles();

    @Override
    public void isExist() {
        System.out.println(getType() + " is exist");
    }

    @Override
    public void display() {
        System.out.println("Display me");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDimensions() {
        return dimensions;
    }

    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }
}
