package collectionexamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String args[]){

        // Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
        set.add("10");
        set.add("20");
        set.add("30");
        set.add("40");
        set.add("50");
        Iterator<String> i=set.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
