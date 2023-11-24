package scanner_class;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        multiply();
    }
    static void multiply () {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = scanner.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
    }
}





























