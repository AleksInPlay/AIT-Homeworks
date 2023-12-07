package trucks;

public class Truck {

    private String model;
    private String manufacturer;
    private int year;
    private String color;
    private int maxWeight;

    private int currentWeight = 0;
    private int maxFuel;

    private int currentFuel = 0;
    private String owner;

    public Truck(String model, String manufacturer, int year, String color, int maxWeight, int maxFuel, String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }

    public String load(int weight) {
        if (weight > maxWeight) {
            System.out.println("Loading too many tons.");
        }
        if (weight < maxWeight) {
            System.out.println("You can load " + (maxWeight - weight) + " tons more.");
        }
        if (weight == maxWeight) {
            System.out.println("Truck is full.");
        }
        return toString();
    }


    public String unload(int unloadingWeight) {
        if (unloadingWeight > maxWeight) {
            System.out.println("You try to unload more than possible.");
        }
        if (unloadingWeight < maxWeight) {
            System.out.println((maxWeight - unloadingWeight) + " tons left on board.");
        }
        if (unloadingWeight == maxWeight) {
            System.out.println("Truck is empty.");
        }
        return toString();
    }

    public String move() {
        System.out.println("Truck can move.");
        return toString();
    }

    public String stop(int fuel, int weight) {
        if (fuel == 0) {
            System.out.println("You have to stop, fuel tank is empty.");
        }
        if (fuel <= 50 && fuel > 0) {
            System.out.println("You run out of fuel, stop soon.");
        }
        if (weight == 0) {
            System.out.println("You can not move without a load, please stop.");
        }
        return toString();
    }

    public String fillFuel(int currentFuel) {
        System.out.println("You have to tank " + (maxFuel - currentFuel)+ " liters.");
        return toString();

    }


    public String getOwner() {
        return "The owner is " + owner;
    }


    public String toString() {
        return "";
    }
}
