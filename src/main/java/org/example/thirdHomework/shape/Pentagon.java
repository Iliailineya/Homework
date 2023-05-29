package org.example.thirdHomework.shape;

/**
 * Неможливий для спадкування клас
 * Характеристики: довжини сторін
 * Методи: конструктор, геттери і сеттери для характеристик, додатковий метод "обчислити правильність п'ятикутника"
 */
final public class Pentagon extends TwoDimensionalShape {
    private double sideA;
    private double sideB;
    private double sideC;
    private double sideD;
    private double sideE;

    public Pentagon(double sideA, double sideB, double sideC, double sideD, double sideE) {
        super("Pentagon", 2, calculateArea(sideA, sideB, sideC, sideD, sideE), 5);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideE = sideE;
    }

    public static double calculateArea(double sideA, double sideB, double sideC, double sideD, double sideE) {
        double perimeter = sideA + sideB + sideC + sideD + sideE;
        double semiPerimeter = perimeter / 2;
        return Math.sqrt((semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC) *
                (semiPerimeter - sideD) * (semiPerimeter - sideE));
    }

    public void isRegular() {
        System.out.println(getType() + " is regular");
    }

    @Override
    public void numOfAngles() {
        System.out.println(getType() + " have 5 angles");
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC + sideD + sideE;
    }

    @Override
    public void getSize() {
        System.out.println("Size is " + calculatePerimeter());
    }

    @Override
    public void resize(double scaleFactor) {
        this.sideA = this.sideA * scaleFactor;
        this.sideB = this.sideB * scaleFactor;
        this.sideC = this.sideC * scaleFactor;
        this.sideD = this.sideD * scaleFactor;
        this.sideE = this.sideE * scaleFactor;
    }

    @Override
    public void randomlyResize() {
        double scaleFactor = Math.random() * 10;
        this.sideA = this.sideA * scaleFactor;
        this.sideB = this.sideB * scaleFactor;
        this.sideC = this.sideC * scaleFactor;
        this.sideD = this.sideD * scaleFactor;
        this.sideE = this.sideE * scaleFactor;
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
}