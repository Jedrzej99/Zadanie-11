import creatures.Animal;
import creatures.Human;
import creatures.salleable;
import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {



        }
        Car nissan = new Car("Juke", "nissan", 2022.0, 10000.0) {
            @Override
            public void refuel() {

            }
        };
        Car nissan2 = new Car("Juke", "nissan", 2022.0, 10000.0) {
            @Override
            public void refuel() {

            }
        };

        Human Jedrzej = new Human();
        Jedrzej.name = "Jedrzej";
        Jedrzej.surname = "Juskowiak";
        Jedrzej.getGarageValue() = nissan;

        System.out.println(Jedrzej.getGarageValue().model);
        Jedrzej.setSalary(10000.0);
        Jedrzej.getSalary();
        Jedrzej.setCar(nissan);

        if (nissan.equals(nissan2)){
            System.out.println("Samochody są takie same");
        } else {
            System.out.println("Samochody różnią się od siebie");

        }System.out.println(nissan);
        System.out.println(nissan2);
        Phone phone = new Phone("X", "Apple", 2022.0);

        nissan.turnOn();
        phone.turnOn();

        Human Damian = new Human();
        Damian.name = "Damian";
        Damian.surname = "Juskowiak";
        Damian.getGarageValue() = nissan2;
        Damian.cash = 1000.0;
        System.out.println(Damian.getGarageValue().model);
        Damian.setSalary(3500.8);
        Damian.getSalary();

        Damian.setCar(nissan);

        salleable.sell(Damian, Jedrzej, 100.0);

        Jedrzej.getSalary();










    }
}