package Curs11;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"orange");
        map.put(50,"red");
        map.put(2, "blue");
        Map<Integer, String> map2 = new HashMap<>();
        map2.put(12,"black");
        map2.put(5,"green");
        map2.put(30, "white");
        System.out.println("Map 1 : "+ map);
        System.out.println("Map 2 : "+ map2);
        map.putAll(map2);
        System.out.println(" Move all to Map");
        System.out.println("Map 1 : "+ map);
        System.out.println("Map 2 : "+ map2);

    }
}
