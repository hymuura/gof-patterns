package main.java.factory;

import main.java.car.BMWCar;
import main.java.car.Car;
import main.java.car.NormalCar;
import main.java.car.RaceCar;

public class FactoryCar implements FactoryCarMethod{
    @Override
    public Car createCar(float velocity, float money, String size) {
        if(velocity>200 && money<6000 && size.equals("small")){
            return new RaceCar();
        }else if(velocity<200 && money>20000 && size.equals("small")){
            return new BMWCar();
        }else{
            return new NormalCar();
        }
    }
}
