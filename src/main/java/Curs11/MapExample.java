package Curs11;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        boolean isEmpty = map.isEmpty();
        System.out.println("Map size is : " + map.size()+ "; isEmpty : "+ isEmpty);

        map.put("T", "Tester");
        map.put("M", "Manager");
        map.put("D", "Developer");
        map.put("P","ProductOwner");

        boolean checkKey = map.containsKey("T");
        System.out.println("Contain key 'T': "+ checkKey);
        boolean checkValue = map.containsValue("Developer");
        System.out.println("Contain value 'Developer': "+ checkValue);

        System.out.println("\nList o keys ........");
        for(String key: map.keySet()){
            System.out.print(key+ " ");
        }
        System.out.println("\nList o values ........");
        for(String value: map.values()){
            System.out.print(value + " ");
        }
        System.out.println(map.get("M"));
    }
}
