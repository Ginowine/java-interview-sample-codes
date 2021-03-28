package collectionexamples;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        int top = stack.peek();
        System.out.println("top element " + top);

        int first = stack.pop();
        System.out.println("popped element " + first + "\n" + stack);

        top = stack.peek();
        System.out.println("top element " + top);
    }
}
