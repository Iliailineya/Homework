package org.example.secondHomework;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        // Логіка запуску електрики
        System.out.println("Starting electricity...");
    }

    private void startCommand() {
        // Логіка запуску команд
        System.out.println("Starting command...");
    }

    private void startFuelSystem() {
        // Логіка запуску системи палива
        System.out.println("Starting fuel system...");
    }
}
