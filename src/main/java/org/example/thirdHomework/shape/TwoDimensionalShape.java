package org.example.thirdHomework.shape;

/**
*        Абстрактний клас без можливості створення екземплярів
*        Характеристики: площа, периметр
*        Методи: абстрактний метод обчислення периметру, конструктор, геттери і сеттери для характеристик
**/

public abstract class TwoDimensionalShape extends Shape {
    private double area;
    private double perimeter;

    public TwoDimensionalShape(String type, int dimensions, double area, double perimeter) {
        super(type, dimensions);
        this.area = area;
        this.perimeter = perimeter;
    }

    public abstract double calculatePerimeter();

    public double getArea() {
        return area;
    }

    @Override
    public void numOfPlane() {
        System.out.println("One plane");
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}

