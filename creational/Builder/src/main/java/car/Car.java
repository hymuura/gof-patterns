package main.java.car;

public class Car {

    private Integer wheels;
    private Integer doors;
    private String patent;

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public static class CarBuilder {
        private Car car;

        public CarBuilder builder(){
            car = new Car();
            return this;
        }

        public CarBuilder setWheels(Integer wheels){
            car.setWheels(wheels);
            return this;
        }

        public CarBuilder setDoors(Integer doors){
            car.setDoors(doors);
            return this;
        }

        public CarBuilder setPatent(String patent){
            car.setPatent(patent);
            return this;
        }

        public Car build(){
            return car;
        }
    }
}
