package algorithms;

public class LinearSearchExample {

    public static int linearSearch(int[] arr, int key){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] numbers = {10, 23, 33, 30, 50, 100, 7, 5};
        int key = 1;

        System.out.println(key + " " + "is found at index: " + linearSearch(numbers, key));
    }
}
