import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 34, 24, 44};
        System.out.println(Arrays.toString(sortHelper(arr)));
    }

    static int[] sortHelper(int[] arr) {
        if(arr == null) {
            return null;
        }
        return sort(arr, 0, arr.length -1);
    }

    static int[] sort(int[] arr, int c, int r) {
        if(r == 0){
            return arr;
        }

        if(c < r) {
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;

            }
            return sort(arr, c+1, r);
        } else {
            return sort(arr, 0, r-1);
        }

    }

}
