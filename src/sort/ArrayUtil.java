package sort;

import java.util.Arrays;

public class ArrayUtil {

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) ((Math.random() * (max - min)) + min);
        }
        return result;
    }

    public static void isSorted(int[] q) {
        for (int i = 0; i < q.length - 1; i++) {
            if (q[i] > q[i + 1]) {
                System.out.println(Arrays.toString(q));
                throw new IllegalStateException("not sorted");
            }
        }
    }
}
