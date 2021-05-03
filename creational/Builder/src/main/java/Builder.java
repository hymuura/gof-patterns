package main.java;

import main.java.car.Car;

public class Builder {

    public static void main(String[] args) {
        Car car = new Car.CarBuilder().setDoors(4).setWheels(4).setPatent("pepe").build();
        Car car2 = new Car.CarBuilder().setDoors(4).setWheels(4).setPatent("pepaaaa").build();

        System.out.println(car.getPatent());
        System.out.println(car2.getPatent());
    }
}
