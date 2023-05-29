package org.example.thirdHomework.shape;

/**
 * Неможливий для спадкування клас
 * Характеристики: довжини сторін (a, b, c)
 * Методи: конструктор, геттери і сеттери для характеристик, додатковий метод "обчислити висоту",
 */

final public class Triangle extends TwoDimensionalShape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        super("Triangle", 3, calculateTriangleArea(sideA, sideB, sideC), sideA + sideB + sideC);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static double calculateTriangleArea(double sideA, double sideB, double sideC) {
        double semiPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    public void calculateHeight(double side) {
        if (side == sideA || side == sideB || side == sideC) {
            double height = (2 * getArea()) / side;
            System.out.println("Height is " + height);
        } else {
            System.out.println("Side not exist!");
        }
    }

    @Override
    public void numOfAngles() {
        System.out.println(getType() + " have 3 angles");
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public void getSize() {
        System.out.println("Size is " + calculatePerimeter());
    }

    @Override
    public void resize(double scaleFactor) {
        this.sideA = this.sideA*scaleFactor;
        this.sideB = this.sideB*scaleFactor;
        this.sideC = this.sideC*scaleFactor;
    }

    @Override
    public void randomlyResize() {
        double scaleFactor = Math.random()*10;
        this.sideA = this.sideA*scaleFactor;
        this.sideB = this.sideB*scaleFactor;
        this.sideC = this.sideC*scaleFactor;
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
}
