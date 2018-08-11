package primitives;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.function.IntBinaryOperator;

import static java.lang.System.out;

public class ArrayBasics {

    @Test
    public void test() {
        int[] a = new int[3];
        out.println(Arrays.toString(a));
        int[] b = new int[] {11, 22, 66};
        out.println(Arrays.toString(b));

        IntBinaryOperator sum = (x, y) -> x + y;

        Arrays.parallelPrefix(b, sum);
        out.println(Arrays.toString(b));
    }

    @Test
    public void bSearch() {
        int[] a = new int[] { 2, 5, 6, 8, 9, 1};
        Arrays.sort(a);
        // must be sorted for the binary search
        Assert.assertEquals(0, Arrays.binarySearch(a, 1));
    }

}
