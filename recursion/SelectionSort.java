import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 34, 24, 44};
        System.out.println(Arrays.toString(selectionSortHelper(arr)));
    }

    static int[] selectionSortHelper(int[] arr) {
        if(arr == null) {
            return null;
        }
        return selectionSort(arr, 0, 0, arr.length - 1);

    }

    static int[] selectionSort(int[] arr,int c, int largest, int l) {
        if(l <= 0) {
            return arr;
        }
        if(c<=l){
            if(arr[c] > arr[largest]){
                return selectionSort(arr, c+1, c, l);
            }
            return selectionSort(arr, c+1, largest, l);
        } else {
            int temp = arr[l];
            arr[l] = arr[largest];
            arr[largest] = temp;

            return selectionSort(arr, 0, 0 , l-1);
        }
    }
}
