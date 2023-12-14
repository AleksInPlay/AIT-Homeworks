package practice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Figure circle = new Circle(3);
        Figure circle1 = new Circle(9);

        Figure rectangle = new Rectangle(5, 8);
        Figure rectangle1 = new Rectangle(12,55);


        Figure square = new Square(4);
        Figure square1 = new Square(25);


        Object[] figures = {circle, rectangle, square};
        for (int i = 0; i < figures.length; i++) {
            System.out.println(figures[i]);

        }
        System.out.println();
        Object[] figures1 = {circle1, rectangle1, square1};
        System.out.println(Arrays.toString(figures1));



    }
}

