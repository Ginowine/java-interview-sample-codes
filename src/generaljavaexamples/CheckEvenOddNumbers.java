package generaljavaexamples;

import java.util.Scanner;

public class CheckEvenOddNumbers {
    public static void main (String args[]){
        int num;
        System.out.println("Enter an integer number: ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();

        if (num % 2 == 0){
            System.out.println("Entered number is even");
        }else {
            System.out.println("Entered number is not even");
        }
    }
}
