package trucks;

public class Vehicles {
    String model;
    String manufacturer;
    int year;
    String color;
    int maxWeight;
    int currentWeight = 0;
    int currentFuel = 0;
    int maxFuel;

    String owner;

    public Vehicles(String model, String manufacturer, int year, String color, int maxWeight, int maxFuel, String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }


    public void move() {
        if(currentFuel == 0){
            System.out.println("Not enough fuel, can't drive");
            return;
        }

        if(currentWeight == 0){
            System.out.println("Please load the track before driving!");
            return;
        }
        System.out.println("Trying...");
        System.out.println("Trying...");
        System.out.println("Yes, driving!");
    }

    public String getManufacturer(){
        return manufacturer;
    }
}
