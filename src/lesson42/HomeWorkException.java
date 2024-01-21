package lesson42;

import java.io.IOException;

public class HomeWorkException {

    public static void main(String[] args) throws IOException {

        number_one();
        number_two();
        number_three();

    }

    public static void number_one(){
        try{
            int a = 40/0;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println("Error! Not possible to divide by zero. ArithmeticException ");
        }
    }

    public static void number_two(){
        try{
            String s = null;
            String m = s.toLowerCase();
            System.out.println(m);
        }catch(NullPointerException e){
            System.out.println("Error! Not possible to modify null. NullPointerException ");
        }
    }

    public static void number_three(){
        try{
            int[] m = new int[2];
        m[8]=5;
        System.out.println(m);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Error! Array index is out of bounds. IndexOutOfBoundsException ");


        }
    }

}
