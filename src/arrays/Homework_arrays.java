package arrays;

public class Homework_arrays {
    public static void main(String[] args) {
        String[] fruits = {"Orange", "Apple", "Banana", "Mango"};
        System.out.println("Fruits: ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }


        fruits[0] = "Kiwi";
        System.out.println("Fruits with Kiwi");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }


        evenElements();

        System.out.print(findMin());
    }

        static void evenElements(){
            String[] fruits = {"Orange", "Apple", "Banana", "Mango"};
            System.out.println("Even Fruits: ");
            for(int i = 0; i < fruits.length; i++){
                if(i%2==0){
                    System.out.println(fruits[i]);
                }
            }
        }

        static int findMin(){
            int[] ints = new int[]{86, 9, 636, 553, 1000, 24};
            int min = ints[0];
            for(int i = 1; i < ints.length; i++) {
                if (ints[i] < min) {
                    min = ints[i];
                }
            }
            return min;
        }

    }

