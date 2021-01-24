package collectionexamples;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayListExample {
    public static void main(String args[]) {

        /* ........... Normal Array............. */
        // Need to specify the size for array
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        // We cannot add more elements to array arr[]

        /*............ArrayList..............*/
        // Need not to specify size
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(10);
        arrL.add(20);
        arrL.add(30);
        arrL.add(40);
        // We can add more elements to arrL

        System.out.println(arrL);
        System.out.println(Arrays.toString(arr));
    }
}
