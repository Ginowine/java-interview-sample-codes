package collectionexamples;

/**
 * Java program illustrating usage of HashMap class methods
 * keySet(), values(), containsKey()
 *
 **/
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapExampleA {
    public static void main(String args[]) {

        // Creation of HashMap
        HashMap<String, String> map = new HashMap<>();

        // Adding values to HashMap as ("keys", "values")
        map.put("Language", "Java");
        map.put("Platform", "Window");
        map.put("Code", "HashMap");
        map.put("Learn", "More");

        for (String str : map.keySet()){
            System.out.println("key " + str + " value " + map.get(str));
        }

        // containsKey() method is to check the presence of a particular key
        if (map.containsKey("Code"))
            System.out.println("Testing .containsKey : " + map.get("Code"));

        // keySet() method returns all the keys in HashMap
        Set<String> mapKeys = map.keySet();
        System.out.println("Initial keys  : " + mapKeys);


        // values() method return all the values in HashMap
        Collection<String> mapValues = map.values();
        System.out.println("Initial values : " + mapValues);

        // Adding new set of key-value
        map.put("Search", "JavaArticle");

        // Again using .keySet() and .values() methods
        System.out.println("New Keys : " + mapKeys);
        System.out.println("New Values: " + mapValues);
    }
}
