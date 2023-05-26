package org.example.thirdHomework.shape;

final public class Rectangle extends TwoDimensionalShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle", 2, length*width, 4);
        this.length = length;
        this.width = width;
    }

    @Override
    public void numOfAngles() {
        System.out.println("I have 4 angles");
    }

    @Override
    public double calculatePerimeter() {
        return 2*length + 2*width;
    }

    public void calculateDiagonal() {
        System.out.println("Diagonal is " + (Math.sqrt(length*length + width*width)));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter is " + calculatePerimeter());
    }

    @Override
    public void display() {
        System.out.println("Display Rectangle");
    }

    @Override
    public void resize(double scaleFactor) {
        this.length = length*scaleFactor;
        this.width = width*scaleFactor;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
