package boolean_type;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.println("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();

        scanner.nextLine();//musor, kotorui v bufere obmena.

        System.out.println("Enter an operator(+,-,/,*");
        String operator = scanner.nextLine();

        switch(operator){
            case "+":
                System.out.println(num1 +" "+ operator + " " + num2 + " = " + (num1 + num2));
                break;
            case "-":
                System.out.println(num1 +" "+ operator + " " + num2 + " = " + (num1 - num2));
                break;
            case "*":
                System.out.println(num1 +" "+ operator + " " + num2 + " = " + (num1 * num2));
                break;
            case "/":
                if(num1 == 0){
                    System.out.println("Division by zero is forbidden");
                    break;
                }
                System.out.println(num1 +" "+ operator + " " + num2 + " = " + (num1 / num2));
                break;
            default:
                System.out.println("You have entered wrong operator");


        }





    }

    }





























