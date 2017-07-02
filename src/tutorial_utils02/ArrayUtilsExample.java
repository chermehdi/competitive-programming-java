package tutorial_utils02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Arrays class utility methods examples
 *
 * @Author Mehdi Maick
 */
public class ArrayUtilsExample {

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 5, 6, 7};
        /*********************************************/
                    /* Sorting */
        /********************************************/

        // the usual way
        Arrays.sort(arr);
        // you can also do it like this
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(a, b);
            }
        });
        // to sort in reverse order
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(b, a);
            }
        });
        // or if using java 8, to sort in reverse order
        Arrays.sort(arr, Comparator.comparing(a -> -a));

        /*********************************************/
                    /* Binary Search */
        /********************************************/

        // the usual way
        Arrays.binarySearch(arr, 2);
        // search within a range
        Arrays.binarySearch(arr, 0, 3, 2);
        // or you specify you own comparator for costume classes
        Arrays.binarySearch(arr, 2, Integer::compare);

        /*********************************************/
                    /* Copy */
        /********************************************/

        // copy of given range
        Integer[] range = Arrays.copyOfRange(arr, 0, 4);
        // creates  a copy of the array starting from the beginning
        // if the given length is bigger than the size of the original array
        // null are used to fill the res
        Integer[] integers = Arrays.copyOf(arr, 3);

        /*********************************************/
                    /* debugging */
        /********************************************/

        // gives a nice string representation of the array
        String arrayAsString = Arrays.toString(arr);
        // this one works even if the array has many dimensions
        String multiDimAsString = Arrays.deepToString(arr);

        /*********************************************/
                    /* other */
        /********************************************/

        // fills the given array with the given value
        Arrays.fill(arr, 34);
        // returns true if both the arrays are equal false otherwise
        Arrays.equals(arr, integers);

        // constructs a list object based on the given parameter array,
        List<Integer> list = Arrays.asList(1, 3, 4, 5);
        Arrays.asList(arr);

        // converts an array into a java8 stream , if you fill like doing some
        // functional programming, although don't recommend it in competitive programming
        // it's slow
        Stream<String> binary = Arrays.stream(arr).filter(e -> e % 2 == 0).map(Integer::toBinaryString);
        binary.forEach(System.out::println);

        // this constructs a prefix array, based on the passed function (in this example a prefix sum array)
        // it's faster for really large arrays
        Arrays.parallelPrefix(arr, (a, b) -> a + b);
        Arrays.para
    }

}
