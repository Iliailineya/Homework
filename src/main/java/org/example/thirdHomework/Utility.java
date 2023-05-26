package org.example.thirdHomework;

import org.example.thirdHomework.shape.*;
import org.example.thirdHomework.tranport.*;

public class Utility {
    SportsCar sportsCar = new SportsCar(
            "McQuine",
            4,
            301,
            "Red",
            4.4,
            true);
    Truck truck = new Truck(
            "Mac",
            8,
            120,
            "Red",
            20,
            120);
    Sedan sedan = new Sedan(
            "Doc Hudson",
            4,
            220,
            "Blue",
            150,
            4);


    public void viewTransport() {

        sportsCar.move();
        sportsCar.controlled();
        sportsCar.groundMovement();
        sportsCar.shining();
        sportsCar.race();

        truck.move();
        truck.controlled();
        truck.groundMovement();
        truck.shining();
        truck.carry();

        sedan.move();
        sedan.controlled();
        sedan.groundMovement();
        sedan.shining();
        sedan.checkAvailableTrunkSpace();
        sedan.pickupPassenger();
    }

    Triangle triangle = new Triangle(1,6,3);
    Rectangle rectangle = new Rectangle(10,10);
    Pentagon pentagon = new Pentagon(4,4,4,4,4);
    public void viewShape(){
//        triangle.calculatePerimeter();
//        triangle.numOfAngles();
//        triangle.calculateHeight();
//        triangle.getArea();

        rectangle.calculateDiagonal();
        rectangle.calculatePerimeter();
        rectangle.numOfAngles();
        rectangle.getArea();
//
//        pentagon.calculatePerimeter();
//        pentagon.isRegular();
//        pentagon.numOfAngles();
//        pentagon.getArea();
    }
}
