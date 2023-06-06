package org.example.thirdHomework;

import org.example.thirdHomework.shape.*;
import org.example.thirdHomework.tranport.*;

/**
 * Створіть 2 низки класів(наприклад: “Animal <- Cat <- Persian” / “People <- Employee <- FireMan”)
 * , тільки придумайте власні класи.
 * Вимоги:
 * а). Для кожної низки повинно бути 5 класів;
 * б). Один головний клас, другий - спадкується від головного, і щк 3 класи, що спадкуються від другого.
 * в). Головний клас та другий нащадок повинен бути “без можливості створити екземпляр класу”
 * г).У кожному класі повинно бути мінімум по 2 характеристики и по 1 методу(додатковому);
 * д). Для кожного класу реалізуйте усі необхідні методи для роботи, знаючи пройдені принципи ООП;
 * е). Останні 3 класи-нащадка в кожній низці повинні бути неможливими для спадкування;
 * Створіть 5 интерфейсів з натсупними вимогами:
 * а). Повинно бути 2 пари, один інтерфейс спадкується від іншого та 1 окремий інтерфейс;
 * б). У кожного з 5 інтерфейсів визначте 2 методи;
 * в). Одна низка класів(створених раніше) повинна реалізовувати(implements) одну зв'язку інтерфейсів
 * , а інша низка класів повинна реалізовувати(implements) іншу зв'язку інтерфейсів та окремий інтерфейс
 * що залишився;
 * В класі Main створіть екземпляри всіх класів, запишіть значення характеристик де можливо
 * та зробіть виклик всіх додаткових реалізованих методів в них.
 * Також створіть два екземпляри класів типу Base b = new Sub() та виведіть всі доступні методи.
 * Нотатка: використовуйте різні модифікатори доступу.
 */
public class Main {
    public static void main(String[] args) {

        Utility utility = new Utility();

        utility.viewSportCar();
        utility.viewSedan();
        utility.viewTruck();
        utility.viewTriangle();
        utility.viewRectangle();
        utility.viewPentagon();

        Shape shape = new Triangle(3, 4, 5);

        shape.display();
        shape.isExist();
        shape.numOfAngles();
        shape.getSize();
        System.out.println("Type is " + shape.getType()
                + " Num of dimensions" +  shape.getDimensions());
        shape.numOfPlane();
        shape.resize(2);
        shape.randomlyResize();
        shape.setType("0_0");
        shape.setDimensions(99);
//        Не можуть бути викликані
//        shape.calculateHeight(3);
//        shape.calculateTriangleArea(3, 4, 5);

        Car car = new SportCar(
                "Noise",
                4,
                351,
                "Blue",
                4.0,
                false);

        car.start();
        car.move();
        car.accelerate();
        car.control();
        car.groundMovement();
        car.shining();
//        Не може бути викликан
//        car.race();
        car.brake();
        car.stop();
    }
}
