package creatures;

import devices.Car;

public class Human   {
    private static final Integer DEFAULT_GARAGE_SIZE = 3;
    public Animal pet;
    public String name;
    public String surname;
    public Car[] garage;
    Integer yearOfBirth;
    private Double salary;
    public double cash;
    public String buyer;


    public Human(String name, Double cash, Integer yearOfBirth) {
        this.name = name;
        this.cash = cash;
        this.yearOfBirth = yearOfBirth;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }
    public Human(String name, Double cash,Integer yearOfBirth, Car[] garageArg){
        super();
        this.name = name;
        this.cash = cash;
        this.yearOfBirth = yearOfBirth;
        this.garage = garageArg;
    }

    public Human(String name, Double cash,Integer yearOfBirth, Integer garageArg){
        super();
        this.name = name;
        this.cash = cash;
        this.yearOfBirth = yearOfBirth;
        this.garage = new Car[garageArg];
    }
    

    public Human() {

    }
    public boolean hasCar(Car car){
        for (int i = 0; i < garage.length; i++) {
            if(garage[i] == car){
                return true;
            }
        }
        return false;
    }
    public boolean hasFreeGarageSpace(){
        for (int i = 0; i < garage.length; i++) {
            if(garage[i] == null){
                return true;
            }
        }
        return false;
    }
    public double getCarsValue(){
        double carsValue = 0;
        for (Car car: garage) {
            if (car != null){
                carsValue += car.getValue();
            }
        }
        return carsValue;
    }

    public void addCar(Car car) throws Exception {
        Integer freeGarageSlot = checkGarageEmptySlot();
        if (freeGarageSlot == -1){
            throw new Exception("Human doesn't have enough garage space");
        }
        if (hasCar(car)){
            throw new Exception("Cant have the same car on multiple parking spots");
        }
        garage[freeGarageSlot] = car;
        car.addCarOwner(this);
    }
    public void removeCar(Car car) throws Exception {
        Integer garageSlot = -1;
        for (int i = 0; i < garage.length; i++) {
            if(garage[i] == car){
                garageSlot = i;
            }
        }
        if(garageSlot == -1){
            throw new Exception("Human doesn't have this car");
        }
        garage[garageSlot] = null;
    }

    public Double getCash() {
        return cash;
    }
    public void setCash(Double cash) {
        this.cash = cash;
    }




    public Car getCar(Integer garageSlot){
        return garage[garageSlot];
    }
    public Double getSalary() {
        System.out.println(java.time.LocalDate.now());
        System.out.println(this.salary);
        return this.salary;
    }
    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            System.out.println("Na koncie nie moze byc ujemna wartość");
        } else {
            System.out.println("Wysyłanie nowych danych do systemu księgowości");
            System.out.println("Konieczność odebrania umowy w kadrach");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = newSalary;
        }
    }
    public void setCar(Car car){
        Integer freeGarageSlot = checkGarageEmptySlot();
        double carValue = car.getValue();
        if(this.salary >= carValue){
            System.out.println("Udalo sie kupic samochod");
            this.garage[freeGarageSlot] = car;
            car.addCarOwner(this);
            return;
        } else if (this.salary >= (carValue / 12)){
            System.out.println("Udalo sie kupic samochod na kredyt");
            this.garage[freeGarageSlot] = car;
            car.addCarOwner(this);
            return;
        } else {
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po\n" +
                    "podwyżkę");
            return;
        }
    }

    private Integer checkGarageEmptySlot() {
        return null;
    }

    public String toString(){
        return name+" "+surname+" "+garage+" "+salary;
    }
    public void sell(Human seller, Human buyer, Double price) {
        throw new IllegalArgumentException("Humans cannot be sold");
    }


    public Car getGarageValue() {
    }
}
