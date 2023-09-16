package sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] q = ArrayUtil.generateRandomArray(10, 1, 100);
        System.out.println("before sort: "+ Arrays.toString(q));
        mergeSort(q, 0, q.length - 1);
        ArrayUtil.isSorted(q);
        System.out.println("after sort: "+ Arrays.toString(q));
    }

    private static void mergeSort(int[] q, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = l + r >> 1;
        mergeSort(q, l, mid);
        mergeSort(q, mid + 1, r);
        int[] temp = new int[r - l + 1];
        int k = 0, i = l, j = mid + 1;
        while (i <= mid && j <= r) {
            //i和j有一个走到尽头，则结束循环
            if (q[i] <= q[j]) {
                temp[k++] = q[i++];
            } else {
                temp[k++] = q[j++];
            }
        }
        //i还没走到mid
        while (i <= mid) {
            temp[k++] = q[i++];
        }
        //或者j还没走到r
        while (j <= r) {
            temp[k++] = q[j++];
        }
        //temp拷贝回q
        System.arraycopy(temp, 0, q, l, temp.length);
    }
}