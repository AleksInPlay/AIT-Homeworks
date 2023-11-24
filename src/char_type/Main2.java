package char_type;

public class Main2 {

    public static void main(String[] args) {

        int a = 8;
        int b = 4;
        System.out.println(" a is " + a + " , b is " + b );

        a = a + b - ( b = a);
        System.out.println(" a now is " + a +" , b now is " + b);







    }
}
