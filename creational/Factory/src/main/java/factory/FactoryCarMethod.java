package main.java.factory;

import main.java.car.Car;

public interface FactoryCarMethod {
    Car createCar(float velocity, float money, String size);
}
