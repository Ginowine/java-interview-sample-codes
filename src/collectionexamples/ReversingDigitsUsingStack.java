package collectionexamples;

import java.util.Stack;

public class ReversingDigitsUsingStack {

    static Stack<Integer> stack = new Stack<>();

    static void  pushDigits(int numbers){
        while (numbers != 0){
            stack.push(numbers % 10);
            numbers = numbers / 10;
        }
    }

    static int reverseDigits(int number){
        pushDigits(number);

        int reverse = 0;
        int i = 1;

        while (!stack.isEmpty()){
            reverse = reverse + (stack.peek() * i);
            stack.pop();
            i = i * 10;
        }

        return reverse;
    }

    public static void main(String[] args){
        int number = 39997;
        System.out.println(reverseDigits(number));
    }
}
