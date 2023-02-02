package devices;

import creatures.Human;

public abstract class Car extends Device {
    public String model;
    public String producer;
    public double year;
    public double value;


    public Car(String model, String producer, Double year, Double value) {
        super();
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.value = value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) &&
                producer.equals(car.producer);
    }

    @Override
    public void turnOn() {
        System.out.println("silnik startuje");
    }

    public abstract void refuel();
}

class ElectricCar extends Car {
    public ElectricCar(String model, String producer, Double year, Double value) {
        super(model, producer, year, value);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling electric car with electricity.");
    }
}

class DieselCar extends Car {
    public DieselCar(String model, String producer, Double year, Double value) {
        super(model, producer, year, value);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling diesel car with diesel.");
    }
}

class LPGCar extends Car {
    public LPGCar(String model, String producer, Double year, Double value) {
        super(model, producer, year, value);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling LPG car with LPG.");
    }


}
