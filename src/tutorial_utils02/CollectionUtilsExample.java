package tutorial_utils02;

import java.util.*;

/**
 * @Author Mehdi Maick
 */
public class CollectionUtilsExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        /*********************************************/
                    /* Sorting */
        /********************************************/

        // the usual way
        Collections.sort(list);
        // you can also do it like this
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(a, b);
            }
        });
        // to sort in reverse order
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(b, a);
            }
        });
        // or if using java 8, to sort in reverse order
        Collections.sort(list, Comparator.comparing(a -> -a));


        /*********************************************/
                    /* Binary Search */
        /********************************************/

        // the usual way
        Collections.binarySearch(list, 2);
        // or you specify you own comparator for costume classes
        Collections.binarySearch(list, 2, Integer::compare);

        /*********************************************/
                    /* Copy */
        /********************************************/

        // copies the old list into the new list
        // each element in the src list will keep the same index in the new List
        // if the new List is larger than the old list, the other elements are unaffected

        List<Integer> newList = new ArrayList<>();
        Collections.copy(newList, list);

        /*********************************************/
                    /* other */
        /********************************************/

        // fills the given list with the given object
        Collections.fill(list, 2);
        // returns the frequency of the given object in the list
        // based on it's equal method
        int frequency = Collections.frequency(list, 2);
        // randomly shuffle the elements of the list
        Collections.shuffle(list);
        // reverse the order of the elements in the list
        Collections.reverse(list);
        // rotate the elements in the list by the given distance
        // the element  in index i will be the element previously at index (i - dist + size) % size after the rotation
        Collections.rotate(list, 2);
        // returns the maximum/minimum element of the list, based on the natural order
        // you can specify a comparator as a second parameter to add costume logic
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        // it swaps the elements in the given indices
        Collections.swap(list, 0, 3);
    }
}
