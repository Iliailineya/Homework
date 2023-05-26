package org.example.thirdHomework.tranport;
final public class SportsCar extends Car {
    private double acceleration;
    private boolean nitro;

    public SportsCar(String name, int numberOfWheels, int maxSpeed, String color, double acceleration, boolean nitro) {
        super(name, numberOfWheels, maxSpeed, color);
        this.acceleration = acceleration;
        this.nitro = nitro;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public boolean getNitro() {
        return nitro;
    }

    public void setNitro(boolean nitro) {
        this.nitro = nitro;
    }

    public void race() {
        System.out.println("The sports car is racing!");
    }
}
