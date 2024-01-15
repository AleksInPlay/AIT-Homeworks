package lesson33;

import java.util.Comparator;


public class NameComparator implements Comparator<Employee> {

    public int compare(Employee emp1, Employee emp2) {

       int result = emp1.getFirstName().compareTo(emp2.getFirstName());
       if(result == 0) {
           result = Integer.compare(emp1.getId(), emp2.getId());
       }
           return result;
       }
    }



