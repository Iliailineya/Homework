package org.example.thirdHomework.tranport;
final public class Sedan extends Car {
    private int trunkVolume;
    private int numberOfPassenger;

    public Sedan(String name, int numberOfWheels, int maxSpeed, String color, int trunkVolume, int numberOfPassenger) {
        super(name, numberOfWheels, maxSpeed, color);
        this.trunkVolume = trunkVolume;
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getTrunkVolume() {
        return trunkVolume;
    }

    public void setTrunkVolume(int trunkVolume) {
        this.trunkVolume = trunkVolume;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public void setNumberOfPassenger(int numberOfPassenger) {
        this.numberOfPassenger = numberOfPassenger;
    }

    public void checkAvailableTrunkSpace() {
        System.out.println("Checking available trunk space in the sedan...");
    }

    public void pickupPassenger(){
        System.out.println("Pick up a passenger");
    }
}
