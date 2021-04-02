package algorithms;

public class AddAdjacentElementInArray {
    public static int pairSumSequence(int n){
        int sum = 0;

        for (int i = 0; i < n; i++){
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    public static int pairSum(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        int n = 10;

        System.out.println(pairSumSequence(n));
    }
}
