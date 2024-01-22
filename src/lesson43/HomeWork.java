package lesson43;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HomeWork {


    public static void main(String[] args) {
        File file = new File("number.txt");
        System.out.println(findSum(file));

        File file1 = new File("letters.txt");
        System.out.println();

    }

    public static int findSum(File file){
      int sum = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("number.txt"))){
            String str;
            while((str = br.readLine()) != null){
                System.out.println(sum = sum + Integer.parseInt(str));
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        return sum;
    }

}


