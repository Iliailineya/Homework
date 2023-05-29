package org.example.thirdHomework;

import org.example.thirdHomework.shape.*;
import org.example.thirdHomework.tranport.*;

public class Utility {
    public void viewSportCar() {

        SportCar sportCar = new SportCar(
                "McQuine",
                4,
                301,
                "Red",
                4.4,
                true);

        sportCar.start();
        sportCar.move();
        sportCar.accelerate();
        sportCar.control();
        sportCar.groundMovement();
        sportCar.shining();
        sportCar.race();
        sportCar.brake();
        sportCar.stop();
    }

    public void viewTruck() {
        Truck truck = new Truck(
                "Mac",
                8,
                120,
                "Red",
                20,
                120);

        truck.start();
        truck.move();
        truck.accelerate();
        truck.control();
        truck.groundMovement();
        truck.shining();
        truck.carry();
        truck.brake();
        truck.stop();
    }
    public void viewSedan() {
        Sedan sedan = new Sedan(
                "Doc Hudson",
                4,
                220,
                "Blue",
                150,
                4);

        sedan.start();
        sedan.move();
        sedan.accelerate();
        sedan.control();
        sedan.groundMovement();
        sedan.shining();
        sedan.checkAvailableTrunkSpace();
        sedan.pickupPassenger();
        sedan.brake();
        sedan.stop();
    }

    public void viewTriangle() {
        Triangle triangle = new Triangle(5, 4, 3);

        triangle.getSize();
        triangle.numOfAngles();
        triangle.calculateHeight(3);
        triangle.numOfPlane();
        triangle.resize(5);
        triangle.getSize();
        triangle.calculateHeight(triangle.getSideA());
        triangle.randomlyResize();
        triangle.getSize();
        triangle.isExist();
        triangle.display();
    }

    public void viewRectangle() {
        Rectangle rectangle = new Rectangle(10, 10);

        rectangle.getSize();
        rectangle.numOfAngles();
        rectangle.numOfPlane();
        System.out.println("Diagonal is " + rectangle.calculateDiagonal());
        System.out.println("Dimensions is " + rectangle.getDimensions());
        rectangle.randomlyResize();
        rectangle.getSize();
        rectangle.resize(0.11);
        rectangle.getSize();
        rectangle.isExist();
        rectangle.display();
    }

    public void viewPentagon() {
        Pentagon pentagon = new Pentagon(4, 4, 4, 4, 4);


        pentagon.getSize();
        pentagon.isRegular();
        pentagon.numOfAngles();
        pentagon.numOfPlane();
        System.out.println("Area is " + pentagon.getArea());
        System.out.println("Dimensions is " + pentagon.getDimensions());
        pentagon.randomlyResize();
        pentagon.getSize();
        pentagon.resize(0.11);
        pentagon.getSize();
        pentagon.isExist();
        pentagon.display();
    }
}
