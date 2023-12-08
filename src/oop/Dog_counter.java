package oop;

public class Dog_counter {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob");
        Dog dog2 = new Dog("Jackson");
        Dog dog3 = new Dog("Bim");

        System.out.println("The number of dogs is " + Dog.counter);


    }
}
