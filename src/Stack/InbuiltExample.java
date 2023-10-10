package Stack;

import java.util.Stack;

public class InbuiltExample {
    public static void main(String[] args) {
        //Last in first out (LIFO)
        Stack<Integer> stack= new Stack<>();
        stack.push(23);
        stack.push(24);
        stack.push(25);
        stack.push(26);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
