package creatures;

public abstract class Animal implements salleable {
    final String species;
    private Double weight;
    private boolean isAlive;
    public Human owner;

    public Animal(String species) {
        this.isAlive = true;
        this.species = species;
        if (species.equals("owczarek")) {
            weight = 30.0;
        } else if (species.equals("pinczer")) {
            weight = 8.0;
        }

    }

    public void feed() {
        if (isAlive) {
            weight += 1.0;
            System.out.println("Dzięki mordo");
        } else {
            System.out.println("Nie dam rady, wystarczy");
        }
    }

    public void takeForAWalk() {

    }

    {
        if (isAlive) {
            weight -= 1.0;
            if (weight <= 0.0) {
                isAlive = false;
                System.out.println("Zabiłeś zwierzę");
            } else {
                System.out.println("Dzięki za spacer");
            }
        } else {
            System.out.println("Jestem martwy nie mogę chodzić");
        }
    }

    public String toString() {
        return species + " " + weight + " " + isAlive;
    }

    public Human getOwner() {
        return this.owner;

    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.equals(this.owner) && buyer.getCash() >= price) {
            buyer.setCash(buyer.getCash() - price);
            seller.setCash(seller.getCash() + price);
            this.owner = buyer;
            System.out.println(species + " Srpzedane " + buyer.name + " za" + price);
        } else {
            System.out.println(" Zakup nieudany ");
        }
    }




}
