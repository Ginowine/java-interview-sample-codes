package collectionexamples;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedListExample {
    public static void main(String[] args) {

        ArrayList<String> arrlistobj = new ArrayList<String>();
        arrlistobj.add("One");
        arrlistobj.add("Two");
        arrlistobj.add("Three");
        arrlistobj.remove(1); // Remove value at index 2
        System.out.println("ArrayList object output: " + arrlistobj);

        // Checking if an element is present.
        if (arrlistobj.contains("Two"))
            System.out.println("Found");
        else
            System.out.println("Not found");


        LinkedList llobj = new LinkedList();
        llobj.add("Four");
        llobj.add("Five");
        llobj.add("Six");
        llobj.remove("Five");
        System.out.println("LinkedList object output: " + llobj);

        // Checking if an element is present.
        if (llobj.contains("Five"))
            System.out.println("Found");
        else
            System.out.println("Not found");
    }
}
