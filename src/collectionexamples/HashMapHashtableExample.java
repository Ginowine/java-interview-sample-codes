package collectionexamples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 A sample Java program to demonstrate HashMap and HashTable
 **/
public class HashMapHashtableExample {

    public static void main(String args[]) {

        // hashtable
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(101," ajay");
        ht.put(101,"Vijay");
        ht.put(102,"Ravi");
        ht.put(103,"Rahul");

        System.out.println("Hash table: ");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }

        // hashmap
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(100,"Amit");
        hm.put(104,"Amit");  // hash map allows duplicate values
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");
        System.out.println("Hash map: ");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
