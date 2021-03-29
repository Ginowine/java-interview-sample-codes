package collectionexamples;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionProgram {
    public static void main(String[] args) {
        Collection myCollection = new ArrayList();
        myCollection.add("1");
        myCollection.add("2");
        myCollection.add("3");
        System.out.println("The collection contains " + myCollection.size() + " item(s).");

        myCollection.clear();
        if (myCollection.isEmpty()) {
            System.out.println("The collection is empty.");
        } else {
            System.out.println("The collection is not empty.");
        }
    }
}
