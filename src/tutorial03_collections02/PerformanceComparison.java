package tutorial03_collections02;


import java.util.ArrayDeque;
import java.util.Stack;
import java.util.stream.IntStream;

public class PerformanceComparison {

    public static void main(String[] args) {

        /* the stack part */

        Stack<Integer> st = new Stack<>();
        long stackStart = System.currentTimeMillis();
        IntStream.range(0, 100000).forEach(st::add);
        while (!st.empty()) st.pop();
        System.out.println("finished in " + (System.currentTimeMillis() - stackStart));

        /* now the array deque */

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        long dequeStart = System.currentTimeMillis();
        IntStream.range(0, 100000).forEach(deque::addFirst);
        while (!deque.isEmpty()) deque.removeFirst();
        System.out.println("finished in " + (System.currentTimeMillis() - dequeStart));
    }

}
