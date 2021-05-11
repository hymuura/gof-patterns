package main.java;

import main.java.car.Car;
import main.java.factory.FactoryCar;

public class Factory {
    public static void main(String[] args){
        FactoryCar factory = new FactoryCar();
        Car car = factory.createCar(4000,1000,"small");
        System.out.println(car.getDescription());

        Car car2 = factory.createCar(100,100000,"small");
        System.out.println(car2.getDescription());

        Car car3 = factory.createCar(100,100000,"medium");
        System.out.println(car3.getDescription());
    }
}
