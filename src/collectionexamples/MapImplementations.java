package collectionexamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImplementations {

    public static void main(String[] args) {
        processMap(new LinkedHashMap<String, Integer>());

        processMap(new TreeMap<String, Integer>());
    }

    /**
     * Use a map:
     * 1. Fill the map with key-> value.
     * 2. Print all the keys.
     *
     * @param map The used map.
     */
    public static void processMap(Map<String, Integer> map) {
        System.out.println("Process the map");
        map.put("3", 3);
        map.put("2", 2);
        map.put("1", 1);

        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
