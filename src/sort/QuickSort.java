package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] q = ArrayUtil.generateRandomArray(10, 1, 100);
        quickSort(q, 0, q.length - 1);
        ArrayUtil.isSorted(q);
    }

    private static void swap(int[] q, int i, int j) {
        int temp = q[i];
        q[i] = q[j];
        q[j] = temp;
    }

    private static void quickSort(int[] q, int l, int r) {
        if (l >= r) {
            return;
        }
        int x = q[l], i = l - 1, j = r + 1;
        while (i < j) {
            //从前往后找到>=x的
            do {
                i++;
            } while (q[i] < x);
            //从后往前找到<=x的
            do {
                j--;
            } while (q[j] > x);
            //交换
            if (i < j) swap(q, i, j);
        }
        quickSort(q, l, j);
        quickSort(q, j + 1, r);
    }
}