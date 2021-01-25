package generaljavaexamples;

import java.util.Random;

// A java program to get generate random numbers withing a range of numbers
public class RandomNumberWithingRange {
    public static void main(String args[]){
        //int number  = getRandomNumber(2, 20);
        int number  = getRandomNumberUsingNextInt(2, 20);
        System.out.println(number);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
