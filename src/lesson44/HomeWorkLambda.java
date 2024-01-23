package lesson44;

public class HomeWorkLambda {

    public static void main(String[] args) {

        Printable printable = (s) -> {
            System.out.println("!" + s + "!");
        };
        printable.print("Life is beautiful");

        Producible producible = () -> {
            return "Hello World";
        };
        System.out.println(producible.produce());
    }

}


