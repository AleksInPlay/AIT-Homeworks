package lesson33;

import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {
    public int compare(Employee emp1, Employee emp2){

        return Integer.compare(emp1.getId(), emp2.getId());
    }


}
