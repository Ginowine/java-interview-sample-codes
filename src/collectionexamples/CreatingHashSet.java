package collectionexamples;

import java.util.HashSet;

public class CreatingHashSet {

    public static void main(String args[]){

        HashSet<String> ht = new HashSet<>();

        ht.add("Gino");
        ht.add("Eseosa");
        ht.add("Eghosa");
        ht.add("Iwinosa");
        ht.add("Iwinosa");

        System.out.println("HashSet contains");
        for (String temp : ht){
            System.out.println(temp);
        }
    }
}
