package lesson44;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Homework_PersonToFile {
    public static void main(String[] args) {
      List <Person> people = new ArrayList();
      people.add(new Person("George",30));
        people.add(new Person("Bill",34));
        people.add(new Person("John",28));
        people.add(new Person("Ronald",25));


createFile("persons list", people);
    }
    public static void createFile(String fileName, List<Person> people) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
          for(Person p : people) {
              bufferedWriter.write(String.valueOf(p) + "\n");
          }
        } catch (IOException exception) {
            exception.getMessage();
        }
    }
    }

