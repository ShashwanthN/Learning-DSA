import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 34, 24, 44};
        System.out.println(Arrays.toString(mergeSortHelper(arr)));
    }

    static int[] mergeSortHelper(int[] arr) {
        if (arr == null) return null;
        if (arr.length <= 1) return arr;
        mergeSort(arr, 0, arr.length - 1, new int[arr.length]);
        return arr;
    }

    private static void mergeSort(int[] arr, int l, int h, int[] temp) {
        if (l >= h) return;
        int mid = l + (h - l) / 2;
        mergeSort(arr, l, mid, temp);
        mergeSort(arr, mid + 1, h, temp);
        merge(arr, l, mid, h, temp);
    }

    private static void merge(int[] arr, int l, int mid, int h, int[] temp) {
        int i = l, j = mid + 1, k = l;

        while (i <= mid && j <= h) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= h) temp[k++] = arr[j++];

        for (k = l; k <= h; k++) {
            arr[k] = temp[k];
        }
    }
}
