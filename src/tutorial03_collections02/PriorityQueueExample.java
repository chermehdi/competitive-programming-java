package tutorial03_collections02;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // natural order
        PriorityQueue<Integer> pqCostume = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(a, b);
            }
        });
        // this is reverse converts it from a min heap (default order ) to (Max Heap :p)
        // java8 style
        PriorityQueue<Integer> pqConstumeReverse = new PriorityQueue<>(Comparator.comparing(a -> -a));

        pq.add(3);
        pq.add(4);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        //prints : 1 3 4
        pq.offer(8); // same as add
        pq.offer(null); // this will throw an exception
    }
}
