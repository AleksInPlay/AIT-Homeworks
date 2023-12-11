package calculator;

public class Calculator {
    public static void main(String[] args) {


        System.out.println(add(5.4, 3.6));
        System.out.println(add(63, 876.9, 4));
        System.out.println(sub(85, 75.8));
        System.out.println(sub(5, 45.7, 13));

    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static double sub(double a, double b) {
        return a - b;
    }

    static double sub(double a, double b, double c) {
        return a - b - c;
    }

}

