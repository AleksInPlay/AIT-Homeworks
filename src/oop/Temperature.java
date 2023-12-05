package oop;

public class Temperature {

    int F;

    public Temperature(int fahrenheit){
        F = fahrenheit;

    }
    public int fahrenheitToCelsius(){
        return 5*(F-32)/9;
    }
}
