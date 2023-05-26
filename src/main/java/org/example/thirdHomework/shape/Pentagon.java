package org.example.thirdHomework.shape;

final public class Pentagon extends TwoDimensionalShape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double sideE;

    public Pentagon(double sideA, double sideB, double sideC, double sideD, double sideE) {
        super("Pentagon", 2, calculatePentagonArea(sideA, sideB, sideC, sideD, sideE), 5);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideE = sideE;
    }

    public static double calculatePentagonArea(double sideA, double sideB, double sideC, double sideD, double sideE) {
        double perimeter = sideA + sideB + sideC + sideD + sideE;
        double semiPerimeter = perimeter / 2;
        double area = Math.sqrt((semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC) *
                (semiPerimeter - sideD) * (semiPerimeter - sideE));
        return area;
    }
    public void isRegular() {
        // implementation for checking if the pentagon is regular
        System.out.println(getType() + " is regular");
    }

    @Override
    public void numOfAngles() {
        System.out.println(getType() + " have 5 angles");
    }

    @Override
    public double calculatePerimeter() {
        System.out.println(sideA + sideB + sideC + sideD + sideE);
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

    public double getSideD() {
        return sideD;
    }

    public void setSideD(double sideD) {
        this.sideD = sideD;
    }

    public double getSideE() {
        return sideE;
    }

    public void setSideE(double sideE) {
        this.sideE = sideE;
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter is " + calculatePerimeter());
    }

    @Override
    public void display() {
        System.out.println("Display Pentagon");
    }

    @Override
    public void resize(double scaleFactor) {

    }
}