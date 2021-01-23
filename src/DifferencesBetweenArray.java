import java.util.ArrayList;

public class DifferencesBetweenArray {
    public static void main(String args[]) {
        /* ........... Normal Array............. */
        int[] arr = new int[2];
        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr[0]);

        /*............ArrayList..............*/
        // Create an arrayList with initial capacity 2
        ArrayList<Integer> arrL = new ArrayList<Integer>(2);

        // Add elements to ArrayList
        arrL.add(30);
        arrL.add(40);

        // Access elements of ArrayList
        System.out.println(arrL.get(0));
    }
}
