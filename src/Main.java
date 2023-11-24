import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the action: ") ;
        String action = scanner.next();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        switch (action) {
            case "+":
                int result1 = number1 + number2;
                System.out.println("The result of addition " + result1);
                break;
            case "-":
                int result2 = number1 - number2;
                System.out.println("The result of subtraction " + result2);
                break;
            case "*":
                int result3 = number1 * number2;
                System.out.println("The result of multiplication " + result3);
                break;
            case "/":
                int result4 = number1 / number2;
                System.out.println("The result of division " + result4);
                break;

        }
    }
}