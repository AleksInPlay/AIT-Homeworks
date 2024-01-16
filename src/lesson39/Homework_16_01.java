package lesson39;


import java.util.List;

public class Homework_16_01 {
    public static void main(String[] args) {

        List<String> animals = List.of("cat", "bulldog", "mouse", "ox", "dog");
        System.out.println(printRes(animals));
    }

    public static String printRes(List<String> animals) {
        String longest = animals.get(0);
        String shortest = animals.get(0);
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).length() > longest.length()) {
                longest = animals.get(i);
            }
            if (animals.get(i).length() < shortest.length()) {
                shortest = animals.get(i);
            }
        }
                return animals.indexOf(longest)<animals.indexOf(shortest) ? longest:shortest;

    }

}

/*
Написать метод, принимающий не пустой лист строк и возвращающий строку,
которая встречается раньше в листе - самую короткую или самую длинную.
Все строки в листе разной длины
 */