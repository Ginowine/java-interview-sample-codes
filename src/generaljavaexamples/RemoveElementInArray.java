package generaljavaexamples;

import java.util.Arrays;

public class RemoveElementInArray {
    public static void main(String args[]){
        int[] array = {1, 2,6, 8, 3, 9, 10, 32, 7, 9};
        int[] copy = new int[array.length - 1];

        int index = 3;


        for (int i = 0, j = 0; i < array.length; i++){
            if (i != index){
                copy[j++] = array[i];
            }
        }

        System.out.println(Arrays.toString(copy));
    }
}
