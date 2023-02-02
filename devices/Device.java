package devices;

import creatures.Human;

public abstract class Device {
    public String model;
    public String producer;
    public double year;

    public Device(String model, String producer, double year){
        this.model = model;
        this.producer = producer;
        this.year = year;
    }

    public Device() {

    }
    public abstract void turnOn();

    public String toString(){
        return model+" "+producer+" "+year;
    }

    public double getValue() {
        return this.getValue();
    }

    public void addCarOwner(Human human) {

    }
}
