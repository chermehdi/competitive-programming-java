package tutorial02_collections01;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        Integer hello = hashMap.get("hello"); // hello now is null
        hashMap.put("hello", 1);
        hello = hashMap.get("hello"); // hello now is 1

        // Exercice : given a list of strings, determine which string occured the most ?
        // input : {"hello", "movies", "abc", "movies", "abc", "movies", "abc", "abc"}
        // solution : easy with maps

        String[] arr = {"hello", "movies", "abc", "movies", "abc", "movies", "abc", "abc"};
        HashMap<String, Integer> freq = new HashMap<>();

        String max = "";
        int maxValue = 0;
        for (String s : arr) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
            if (freq.get(s) > maxValue) {
                max = s;
                maxValue = freq.get(s);
            }
        }

        // answer =>  max
        // freq.getOrdDefault is a helper method that prevents that we do null + 1
        // so in case of null it returns 0

        // maps got a lot of method

        hashMap.keySet(); // returns a set contains all the keys
        hashMap.clear(); // clears all the entries of the map

        hashMap.size(); // the size of the map
        hashMap.values(); // gets a collection of the values of the map


    }
}
