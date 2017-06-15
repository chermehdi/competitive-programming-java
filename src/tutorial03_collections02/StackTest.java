package tutorial03_collections02;

import java.util.Collections;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);

        while (!stack.empty()) {
            System.out.println(stack.peek()); // you can use stack.pop() to remove the element
            stack.pop();
        }
        // this will print 4 3 2 1

        stack.push(3); // this is the same as stack.add(3)
        stack.addAll(Collections.emptyList()); // this adds a whole collectoin


    }
}
