package lesson41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Homework {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("John");
        list.add("Mike");
        list.add("Bill");
        list.add("Bill");
        list.add("John");
        list.add("John");

        System.out.println(findNameOccurrence(list,"Bill"));
    }

    public static int findNameOccurrence(List<String> list, String name){
        Map<String, Integer> repeat = list.stream().collect(Collectors.toMap(e->e, e->1,Integer::sum));
        return repeat.get(name);
    }
    public int findNameToNumberOccurrence(List<String> strings, String name){
        Map<String,Integer>nameToNumber = new HashMap<>();
        for(String s : strings){
           if(nameToNumber.containsKey(s))
               nameToNumber.put(s, nameToNumber.get(s)+1);
           else nameToNumber.put(s,1);
        }
        return nameToNumber.containsKey(name)?nameToNumber.get(name):0;
    }

}
