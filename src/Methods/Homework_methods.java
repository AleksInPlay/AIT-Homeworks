package Methods;

public class Homework_methods {
    public static void main(String[] args) {
        double r = 2.5;
        System.out.println(calculateArea(r));

        double fahrenheit = 45.0;
        System.out.println(fahrenheit + "F ->" + convertToCelsius(fahrenheit) + "C");

        area();

        String name = "John";
        int age = 25;
        float salary = 3000.76789f;

        System.out.printf("name: %s, age: %d, salary: %.2f", name, age, salary);



        int a = 5;
        int b = 15;

        System.out.println("a = "+a+";b = "+b);
        System.out.printf("a = %d;b =%d",a,b);

    }
    static void area() {
        int radius = 20;
        double Pi = Math.PI;
        System.out.println(Pi * radius * radius);
    }
    static int convert(){
            int F = 95;
            int resultC;
            System.out.println(resultC=5*(F-32)/9);

           return F;
    }

        static double calculateArea(double radius){
        double area = Math.PI * radius * radius;
         return area;

        }

        static double convertToCelsius( double fahrenheit){
        double celsius = 5*(fahrenheit-32.0)/9;
        return celsius;
        }



}

