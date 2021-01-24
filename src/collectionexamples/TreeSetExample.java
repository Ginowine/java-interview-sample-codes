package collectionexamples;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]){
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Gino");
        ts.add("Eseosa");
        ts.add("Eghosa");
        ts.add("Iwinosa");
        ts.add("Iwinosa");

        for (String temp: ts){
            System.out.println(temp);
        }
    }
}
