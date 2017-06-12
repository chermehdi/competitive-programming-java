package tutorial02_collections01;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>(list); // you can create list from other lists which is cool

        list.add("hello");
        list.add("java");
        list.remove("java");

        List<Integer> intlist = new ArrayList<>();
        List<Integer> vector = new Vector<>();
        List<Integer> linked = new LinkedList<>();


        intlist.add(3);
        intlist.add(4);
        intlist.add(2);
        intlist.add(5);
        intlist.add(9);
        intlist.add(10);
        intlist.remove(3); // this will remove the third element
        intlist.remove(Integer.valueOf(3)); // this will remove the integer 3

        boolean isThere = list.contains("hello"); // Attention : Linear time operation

        // some java 8 stuff to keep even elements
        List<Integer> even = intlist.stream()
                .filter(e -> e % 2 == 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(even);
    }
}
