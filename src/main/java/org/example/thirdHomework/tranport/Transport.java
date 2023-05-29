package org.example.thirdHomework.tranport;

import org.example.thirdHomework.myInterface.*;

/**
 * Абстрактний клас без можливості створення екземплярів
 * Характеристики: назва, кількість коліс
 * Методи: конструктор, геттери і сеттери для характеристик, додатковий метод "Рух" та "Управління"
 */
public abstract class Transport implements Driveable, Moveable {
    private String name;
    private int numberOfWheels;

    public Transport(String name, int numberOfWheels) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
    }

    public void move() {
        System.out.println(name + " can move with " + numberOfWheels + (numberOfWheels == 1 ? " wheel" : " wheels"));
    }

    public void control() {
        System.out.println(name + " can controlled");
    }

    @Override
    public void start() {
        System.out.println("Transport has been started");
    }

    @Override
    public void stop() {
        System.out.println("Transport has been stopped");
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}
