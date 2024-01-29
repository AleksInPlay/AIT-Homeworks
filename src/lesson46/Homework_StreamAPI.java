package lesson46;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Homework_StreamAPI {

    public static void main(String[] args) {

        /*
        Написать метод, принимающий лист имен, в котором некоторые имена повторяются и
        печатающий имена из листа без печати повторений. При решении использовать Stream API
         */

        List<String> names = new ArrayList<>();
        names.add("Mary");
        names.add("Kate");
        names.add("George");
        names.add("Mary");
        names.add("Bill");
        names.add("Trevor");
        names.add("George");

        names.stream().distinct().forEach(System.out::println);

        /*
        Есть класс Address с полями String street и int houseNumber и класс Person с полями String name, int age, Address address.
        Используя Stream API написать метод, принимающий лист Person и печатающий адреса тех, кто старше 17 лет
         */

        Stream<Person> myStream = Stream.of(new Person("Lilia", 27, new Address("Kolibriweg", 9)),
                new Person("Wowa", 18, new Address("Kurzweg", 225)),
                new Person("Karin", 12, new Address("Langstrasse", 2)));

        myStream.filter(pers -> pers.getAge() > 17)
                .map(Person::getAddress)
                .forEach(System.out::println);

    }
}
