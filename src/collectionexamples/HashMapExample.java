package collectionexamples;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(new Key("Hello"), 20);
        map.put(new Key("World"), 30);
        map.put(new Key("Java"), 40);

        System.out.println();
        System.out.println("Value for key World: " + map.get(new Key("World"))); //hashCode for key: World = 118
        System.out.println("Value for key Java: " + map.get(new Key("Java")));   //hashCode for key: Java = 115
    }
}
