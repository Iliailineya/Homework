package org.example.thirdHomework.shape;

final public class Triangle extends TwoDimensionalShape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super("Triangle", 3, calculateTriangleArea(sideA, sideB, sideC), 3);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private static double calculateTriangleArea(double sideA, double sideB, double sideC) {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    public void calculateHeight() {
        double height = (2 * getArea()) / sideA;
        System.out.println("Height is " + height);
    }

    @Override
    public void numOfAngles() {
        System.out.println("I have 3 angles");;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println(sideA + sideB + sideC);
        return 0;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public void getPerimeter() {

    }

    @Override
    public void display() {

    }

    @Override
    public void resize(double scaleFactor) {

    }
}
