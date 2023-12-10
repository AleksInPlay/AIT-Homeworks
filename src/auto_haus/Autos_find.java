package auto_haus;

public class Autos_find {
    public static void main(String[] args) {
        Autos salon = new Autos("Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia", "Mazda");


        System.out.println(salon.findCar("Ford"));

        System.out.println(salon.findAuto("Opel"));
    }
}
