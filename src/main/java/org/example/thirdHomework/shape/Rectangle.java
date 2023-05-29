package org.example.thirdHomework.shape;

/**
 * Неможливий для спадкування клас
 * Характеристики: довжина, ширина
 * Методи: конструктор, геттери і сеттери для характеристик, додатковий метод "обчислити діагональ"
 */
final public class Rectangle extends TwoDimensionalShape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle", 2, length * width, 2 * length + 2 * width);
        this.length = length;
        this.width = width;
    }

    public double calculateDiagonal() {
        return Math.sqrt(length * length + width * width);
    }


    @Override
    public void numOfAngles() {
        System.out.println("I have 4 angles");
    }

    @Override
    public double calculatePerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public void getSize() {
        System.out.println("Size is " + calculatePerimeter());
    }

    @Override
    public void resize(double scaleFactor) {
        this.length = length * scaleFactor;
        this.width = width * scaleFactor;
    }

    @Override
    public void randomlyResize() {
        double scaleFactor = Math.random() * 10;
        this.length = length * scaleFactor;
        this.width = width * scaleFactor;
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
