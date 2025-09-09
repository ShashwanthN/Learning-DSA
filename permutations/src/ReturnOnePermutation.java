import java.util.Arrays;

public class ReturnOnePermutation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnPerm(5, 10)));
    }

    static int[] returnPerm(int n, int k) {
        int[] arr = new int[n];
        int tempCounter =0;
        for(int idx = 0; idx < n; idx++) {
            arr[idx] = ++tempCounter;
        }
        int l = 0;
        while(k>0) {
            for (int i = n - 1; i > l; i--) {
                if (k == 0) {
                    break;
                }
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                k--;
            }
            l++;
        }
        return arr;
    }
}
