package org.example.thirdHomework.tranport;
final public class SportCar extends Car {
    private double acceleration;
    private boolean nitro;

    public SportCar(String name, int numberOfWheels, int maxSpeed, String color, double acceleration, boolean nitro) {
        super(name, numberOfWheels, maxSpeed, color);
        this.acceleration = acceleration;
        this.nitro = nitro;
    }

    @Override
    public void accelerate() {
        System.out.println("SportCar have so much power to accelerate!");
    }

    public void race() {
        System.out.println("The sports car is racing!");
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
}
