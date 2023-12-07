package trucks;


public class Truck_Project {

    public static void main(String[] args) {

        Truck truck1 = new Truck("FH", "Volvo", 2021, "white", 15, 500, "Ivanov");

        System.out.println(truck1.load(11));
        System.out.println(truck1.load(16));
        System.out.println(truck1.load(15));

        System.out.println(truck1.unload(7));
        System.out.println(truck1.unload(20));
        System.out.println(truck1.unload(15));

        System.out.println(truck1.move());

        System.out.println(truck1.stop(45, 10));
        System.out.println(truck1.stop(0, 0));

        System.out.println(truck1.fillFuel(100));

        System.out.println(truck1.getOwner());


        Truck truck2 = new Truck("TGS", "MAN", 2022, "grey", 18, 600, "Belov");


    }

}

