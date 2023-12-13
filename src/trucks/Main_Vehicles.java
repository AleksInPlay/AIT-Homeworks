package trucks;


import java.util.Arrays;

public class Main_Vehicles {


    public static void main(String[] args) {

        Truck truck1 = new Truck("FH", "Volvo", 2021, "white", 15, 500, "Ivanov");
        System.out.println(truck1);
        truck1.load(1500);
        truck1.load(10000);


        truck1.move();


        truck1.unload(10000);
        truck1.unload(3000);

        Truck truck2 = new Truck("SuperTruck","MAN",2021,"black",10000,400,"Jonny Cage");

        int[] x = {1,2};
        for(int i = 0; i < x.length;i++){
            System.out.println(x[i]);
        }
        Truck[] trucks = {truck1, truck2};
        for(int i =0; i < trucks.length;i++){
            System.out.println(trucks[i]);
        }
        System.out.println(Arrays.toString(trucks));
        System.out.println();
        for(Truck tr : trucks ){
            System.out.println("truck" + tr.getManufacturer() + ":" + tr.getOwner());
        }

        PassengerCar passengerCar = new PassengerCar("X1", "BMW", 2015, "black", 3500, 60, "George");
        passengerCar.move();
        System.out.println(passengerCar.getManufacturer());















    }


}



