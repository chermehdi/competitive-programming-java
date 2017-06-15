package tutorial03_collections02;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {

        /* Example of creation */

        Queue<Integer> deque = new ArrayDeque<>();
        Queue<Integer> list = new LinkedList<>();

        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.add(6);

        // 3 4 5 6
        while (!deque.isEmpty()) {
            System.out.println(deque.peek()); // you can use deque.peek() if you don't want to remove the element
            deque.poll();
        }
        // 3 4 5 6
        deque.offer(2); // this is equivalent to deque.add(2)

    }
}
