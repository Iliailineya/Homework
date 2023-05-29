package org.example.thirdHomework.tranport;

final public class Truck extends Car {
    private int maxLoad;
    private double cargoVolume;

    public Truck(String name, int numberOfWheels, int maxSpeed, String color, int maxLoad, double cargoVolume) {
        super(name, numberOfWheels, maxSpeed, color);
        this.maxLoad = maxLoad;
        this.cargoVolume = cargoVolume;
    }

    public void carry(){
        System.out.println(getName() + " can carrying " + maxLoad + " ton of cargo");
    }

    @Override
    public void brake() {
        System.out.println("Truck has been looong brake");
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }
    public void setCargoVolume(double cargoVolume) {
        this.cargoVolume = cargoVolume;
    }
}
