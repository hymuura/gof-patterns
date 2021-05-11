package main.java.car;

public class Plane {
    private int windows;
    private int wheels;
    private int chairs;

    public Plane(PlaneBuilder builder){
        this.windows = builder.windows;
        this.wheels = builder.wheels;
        this.chairs = builder.chairs;
    }

    @Override
    public String toString(){
        return "Plane: Windows-"+this.windows+" Wheels-"+this.wheels+" Chairs-"+this.chairs;
    }
    public static class PlaneBuilder{
        private int windows;
        private int wheels;
        private int chairs;

        public PlaneBuilder setWindows(int windows){
            this.windows = windows;
            return this;
        }

        public PlaneBuilder setWheels(int wheels){
            this.wheels = wheels;
            return this;
        }

        public PlaneBuilder setChairs(int chairs){
            this.chairs = chairs;
            return this;
        }

        public Plane build(){
            return new Plane(this);
        }
    }
}
