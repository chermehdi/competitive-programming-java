package tutorial05_testing;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Generating test cases for competitive programming contests
 *
 * @author MaxHeap
 */
public class Generator {


    private static Random random = new Random();
    private static final String ALPHA = "abcdefjhijklmnopqrstuvwxyzABCDEFJHIJKLMNOPQRSTUVWXYZ1234567890";
    private static final String ALPHA_DOWN = "abcdefjhijklmnopqrstuvwxyz";
    private static final String ALPHA_UP = "ABCDEFJHIJKLMNOPQRSTUVWXYZ";

    public static enum AlphaType {
        UPPERCASE,
        LOWERCASE,
        ALLCASE
    }

    public static int nextInt() {
        return nextInt(0, Integer.MAX_VALUE - 1);
    }

    public static int nextInt(int from, int to) {
        return random.nextInt((to - from) + 1) + from;
    }

    public static long nextLong() {
        return nextLong(0L, Long.MAX_VALUE - 1L);
    }

    public static long nextLong(long from, long to) {
        if (to < from) throw new RuntimeException("the right bound is bigger than the left bound");
        return (long) (from + random.nextDouble() * (to - from));
    }

    public static String nextString(int length) {
        return nextString(length, AlphaType.ALLCASE);
    }

    public static String nextString(int length, AlphaType type) {
        switch (type) {
            case UPPERCASE:
                return generateString(length, ALPHA_UP);
            case LOWERCASE:
                return generateString(length, ALPHA_DOWN);
            default:
                return generateString(length, ALPHA);
        }
    }

    /**
     * Generate a random string from the given alphabet
     *
     * @param length   length of the string
     * @param alphabet the string representing the alphabet
     * @return the wanted random string
     */
    private static String generateString(int length, String alphabet) {
        StringBuilder sb = new StringBuilder();
        int alphabetLength = alphabet.length();

        for (int i = 0; i < length; i++) {
            sb.append(alphabet.charAt(random.nextInt(alphabetLength)));
        }

        return sb.toString();
    }

    /**
     * returns a random tree with size n and vertices numbered from 0 to n - 1
     *
     * @param n size of the tree
     * @return list of pairs (edges) of the tree
     */
    public static ArrayList<IntPair> generateTree(int n) {
        ArrayList<IntPair> tree = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            tree.add(new IntPair(nextInt(0, i), i + 1));
        }
        Collections.shuffle(tree);
        return tree;
    }

    /**
     * returns a random tree with size n and depth at most depth , vertices numbered from 0 to n - 1
     *
     * @param n     size of the tree
     * @param depth maximum depth
     * @return list of pairs (edges) of the tree
     */
    public static ArrayList<IntPair> generateTree(int n, int depth) {
        ArrayList<IntPair> tree = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            tree.add(new IntPair(nextInt(Math.max(0, i - depth), i), i + 1));
        }
        Collections.shuffle(tree);
        return tree;
    }

    /**
     * returns a random graph with size n and vertices numbered from 0 to n - 1
     *
     * @param n the number of vertices
     * @return pairs representing the graph
     */
    public static ArrayList<IntPair> generateGraph(int n) {
        ArrayList<IntPair> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nextInt(0, 1) == 1)
                    graph.add(new IntPair(i, j));
            }
        }
        Collections.shuffle(graph);
        return graph;
    }


}


