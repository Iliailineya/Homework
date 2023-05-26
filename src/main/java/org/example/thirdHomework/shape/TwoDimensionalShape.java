package org.example.thirdHomework.shape;

abstract class TwoDimensionalShape extends Shape {
    private double area;
    private double side;

    public TwoDimensionalShape(String type, int dimensions, double area, double side) {
        super(type, dimensions);
        this.area = area;
        this.side = side;
    }

    public abstract double calculatePerimeter();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}

