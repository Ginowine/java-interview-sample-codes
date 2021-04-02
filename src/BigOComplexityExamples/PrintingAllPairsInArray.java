package BigOComplexityExamples;

public class PrintingAllPairsInArray {
    static void printAllPairs(int[] array){
        for (int i =0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                System.out.println(array[i] + " " + array[j]);
            }
        }
    }

    public static void main(String[] args){

        int[] numbers = {2, 4, 5, 6, 1, 8, 9, 10};
        printAllPairs(numbers);
    }
}
