package lesson40;

import java.util.HashMap;
import java.util.Map;

public class HomeWork_Map {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();
        map.put("a","Hi");
        map.put("b", "There");
        System.out.println(map);
        System.out.println(newKey(map));
    }
    public static Map<String, String> newKey(Map<String, String> map) {
        Map<String, String> newMap = new HashMap<>(map);
        String str1 = map.get("a");
        String str2 = map.get("b");
        if (map.containsKey("a") && map.containsKey("b")) {
            newMap.put("ab", str1.concat(str2));

        }
        return newMap;

    }
}
  /*Дана Map<String, String> map, написать метод, который вернет Мап, такую, что если в исходной map
    есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b. Если нет, ничего
    не менять.
    Примеры:
    mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
    mapAB({"a": "Hi"}) → {"a": "Hi"}
    mapAB({"b": "There"}) → {"b": "There"}*/
