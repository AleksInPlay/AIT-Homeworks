package enumeration;

import java.util.Scanner;

public class Weekend {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of week that is a weekend:");
        String anyDay = scanner.next();

        boolean weekend;

        if (anyDay.equalsIgnoreCase((Week.SATURDAY).toString())
                || anyDay.equalsIgnoreCase((Week.SUNDAY).toString())) {
            weekend = true;
                System.out.println(weekend);

            }
        else {
            weekend = false;
            System.out.println(weekend);
        }

    }
}
