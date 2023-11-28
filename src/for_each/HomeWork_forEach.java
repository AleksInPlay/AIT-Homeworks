package for_each;

public class HomeWork_forEach {
    public static void main(String[] args) {
        System.out.println(areEqual());
        System.out.println(findEvenNumbers());
    }

    static boolean areEqual() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};

        if (array1.length != array2.length)
            return false;

        boolean result = true;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                result = false;
                break;
            }
        }
        return result;
    }

    static int findEvenNumbers() {
        int[] numbers = {1, 2, 8, 7, 20, 34};
        int n = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                n++;
            }

        }
        return n;
    }


}







