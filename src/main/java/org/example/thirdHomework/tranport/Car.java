package org.example.thirdHomework.tranport;
abstract class Car extends Transport {
    private int maxSpeed;
    private String color;

    public Car(String name, int numberOfWheels, int maxSpeed, String color) {
        super(name, numberOfWheels);
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void groundMovement(){
        System.out.println(getName() + " can move on the ground at maximum speed: " + getMaxSpeed() + " km/hour");
    }
    public void shining(){
        System.out.println(getName() + " can shine with : " + getColor() + " color");
    }
}