package auto_haus;

import java.util.Arrays;

public class Autos {
    public String auto1;
    public String auto2;
    public String auto3;
    public String auto4;
    public String auto5;
    public String auto6;
    public String auto7;

    public Autos(String auto1, String auto2, String auto3, String auto4, String auto5, String auto6, String auto7) {
        this.auto1 = auto1;
        this.auto2 = auto2;
        this.auto3 = auto3;
        this.auto4 = auto4;
        this.auto5 = auto5;
        this.auto6 = auto6;
        this.auto7 = auto7;
        String[] salon = {auto1, auto2, auto3, auto4, auto5, auto6, auto7};
    }

    public String findCar(String carToFind) {
        String[] salon = {auto1, auto2, auto3, auto4, auto5, auto6, auto7};

        for (String x : salon) {

            if (carToFind == x) {
                System.out.println("В салоне есть такая машина.");
                break;

            } else {
                System.out.println("В салоне нет такой машины, выберите из: " + Arrays.toString(salon));

            }

        }
        return toString();


    }

    public String toString() {
        return "";
    }

    public String findAuto(String carToFind) {
        String[] salon = {auto1, auto2, auto3, auto4, auto5, auto6, auto7};

        int j = Arrays.toString(salon).indexOf(carToFind);
        if (j != -1) {
            System.out.println("В салоне есть такая машина.");

        }
        if (j == -1) {
            System.out.println("В салоне нет такой машины, выберите из: " + Arrays.toString(salon));

        }
        return "";
    }

}
