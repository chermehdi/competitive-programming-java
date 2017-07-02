package tutorial05_testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static tutorial05_testing.Generator.nextInt;

/**
 * a simple example to use Junit in a CP context
 * you don't need a main method your IDE should have Junit integrated and should
 * give a way to run tests
 *
 * @Author MaxHeap
 */
public class JUnitExample {

    // the problem is to calculate the sum of all the numbers
    // from 0 to n

    // solution in O(1) using formula
    public int superSolver(int n) {
        return n * (n + 1) / 2;
    }

    // solution in O(N) guaranteed to be correct
    public int stupidSolver(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) res += i;
        return res;
    }

    @Test
    public void problemTest() {
        int testCases = 20;
        for (int i = 0; i < testCases; i++) {
            int n = nextInt(1, 200);
            // always assert that they produce the same output
            assertEquals(superSolver(n), stupidSolver(n));
        }
    }


}
