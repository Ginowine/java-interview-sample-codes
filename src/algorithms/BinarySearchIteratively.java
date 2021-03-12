package algorithms;

public class BinarySearchIteratively {

    public static int binarySear( int[] sortedArray, int low, int high, int key){
        int index = Integer.MAX_VALUE;

        while (low <= high){
            int mid = (low + high)/ 2;
            if (sortedArray[mid] < key){
                low = mid + 1;
            }else if (sortedArray[mid] > key){
                high = mid - 1;
            }else if (sortedArray[mid] == key){
                index = mid;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args){
        int[] sortedArrays = {2, 4, 6, 7, 8, 9};
        int low = 2;
        int high = 9;
        int key = 6;

        int result = binarySear(sortedArrays, low, high, key);

        System.out.println(result);
    }
}
