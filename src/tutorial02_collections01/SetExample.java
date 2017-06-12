package tutorial02_collections01;


import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class SetExample {

    public static void main(String[] args) {


        // simple set creation
        HashSet<String> unorderdSet = new HashSet<>();
        TreeSet<Integer> orderdSet = new TreeSet<>();


        unorderdSet.add("some string");
        unorderdSet.add("some other string");
        unorderdSet.add("ABC");

        boolean res = unorderdSet.contains("ABC"); // O(log(N)) worst case look up O(1) average case

        IntStream.range(0, 10).forEach(e -> orderdSet.add(e)); // fill the set with numbers from 0, 10

        // equivalent of c++ set lower_bound and upper_bound
        orderdSet.ceiling(3);
        orderdSet.floor(3); // ceil and floor operations only available on tree sets

        TreeSet<Integer> inverseOrderedSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(b, a); // originaly it's written Integer.compare(a, b)
            }
        });

        // this will sort the inserted integers in reverse order
        // you can also do it in other ways such as
        // those are basically the same code as above, only with java 8 magic to shorten the code

        inverseOrderedSet = new TreeSet<>(Comparator.comparing(e -> -e));
        inverseOrderedSet = new TreeSet<>((a, b) -> Integer.compare(b, a));

    }
}
