package generaljavaexamples;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

    public static void main(String args[]){
        int[] array = {2,3,4,2, 2, 2};
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i < array.length; i++){
            //If same integer is already present then add method will return FALSE
            if(set.add(array[i]) == false) {
                System.out.println("Duplicate Element Found: " + array[i]);
            }
        }
    }
}
