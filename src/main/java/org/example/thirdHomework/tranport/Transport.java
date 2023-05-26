package org.example.thirdHomework.tranport;

abstract class Transport {
    private String name;
    private int numberOfWheels;

    public Transport(String name, int numberOfWheels) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
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

    public void move(){
        System.out.println(getName() + " can move with my " + getNumberOfWheels() + (getNumberOfWheels()==1?" wheel" :" wheels"));
    }
}
