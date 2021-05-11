package main.java;

import main.java.car.Car;
import main.java.car.Plane;

public class Builder {

    public static void main(String[] args) {
        Car car = new Car.CarBuilder().builder().setDoors(4).setWheels(4).setPatent("pepe").build();
        Car car2 = new Car.CarBuilder().builder().setDoors(4).setWheels(4).setPatent("pepaaaa").build();

        System.out.println(car.getPatent());
        System.out.println(car2.getPatent());

        Plane plane1 = new Plane.PlaneBuilder().setWindows(4).setWheels(5).setChairs(4).build();
        System.out.println(plane1);
    }
}
