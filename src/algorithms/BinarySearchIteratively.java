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
        int low = 0;
        int high = sortedArrays.length - 1;
        int key = 8;

        int result = binarySear(sortedArrays, low, high, key);

        System.out.println("the index of the searched key is: " + result);


        //This is a simple way to do binary search
        //int index = Arrays.binarySearch(sortedArrays, key);

        //int index = Collections.binarySearch(sortedList, key);
    }
}
