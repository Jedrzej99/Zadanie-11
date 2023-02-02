package creatures;

import creatures.Human;

public interface salleable {
    static void sell(Human seller, Human buyer, double price) {
        if (seller.car == null){
            System.out.println("Nie posiada auta");
        }
        if (buyer.cash > price){
            System.out.println("Kupujący ma dosć pieniędzy");
        }
        buyer.cash = buyer.cash - price;
        seller.cash = seller.cash + price;
        buyer.car = seller.car;
        seller.car = null;
        System.out.println(seller.cash + " " + buyer.cash + " " + buyer.car + " " + seller.car);

    }




}
