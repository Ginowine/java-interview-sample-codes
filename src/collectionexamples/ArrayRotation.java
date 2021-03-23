package collectionexamples;

public class ArrayRotation {

    /*Function to left rotate arr[] of size n by d*/
    public void leftRotate(int arr[], int d, int n){
        for (int i = 0; i < d; i++){
            leftRotateByOne(arr, n);
        }
    }

    public void leftRotateByOne(int arr[], int n){
        int i, temp;

        temp = arr[0];
        for (i = 0; i < n-1; i++){
            arr[i] = arr[i + 1];
            arr[n - 1] = temp;
        }
    }

    /* utility function to print an array */
    public void printArray(int arr[], int n){
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        ArrayRotation rotation = new ArrayRotation();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        rotation.leftRotate(arr, 2, 7);
        rotation.printArray(arr, 7);
    }
}
