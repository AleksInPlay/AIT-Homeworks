package oop;

public class HomeworkTemperature {
    public static void main(String[] args) {

        Temperature temperature1 = new Temperature(150);
        System.out.println(temperature1.fahrenheitToCelsius() + " Celsius ");

        Temperature temperature2 = new  Temperature(100);
        System.out.println(temperature2.fahrenheitToCelsius() + " Celsius ");

        Temperature temperature3 = new  Temperature(50);
        System.out.println(temperature3.fahrenheitToCelsius() + " Celsius ");

        Temperature temperature4 = new  Temperature(0);
        System.out.println(temperature4.fahrenheitToCelsius() + " Celsius ");




    }
}
