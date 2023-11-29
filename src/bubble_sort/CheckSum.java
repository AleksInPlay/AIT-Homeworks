package bubble_sort;

public class CheckSum {
    public static void main(String[] args) {

        int[] numbers = {10, 26, 10, 5, 10, 7};
        System.out.println(checkTheSum(numbers));
    }

    static boolean checkTheSum(int[] numbers) {

        int n = 10;
        int m = 30;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                sum = sum + numbers[i];
            }
        }
        return m == sum;
    }
}

