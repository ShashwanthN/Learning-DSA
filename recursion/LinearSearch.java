public class LinearSearch {
    public static void main(String[] args) {
            int[] arr = {1, 3, 4, 6, 10, 24, 44};
            System.out.println(recHelper(arr, 24));
    }

    static int recHelper(int[] arr, int target) {
        if(arr == null) {
            return -1;
        }
        return recLinearSearch(arr, target, 0);
    }

    private static int recLinearSearch(int[] arr, int target, int idx) {
        if(arr[idx] ==  target){
            return idx;
        } else if(idx >= arr.length -1){
            return -1;
        }

        return recLinearSearch(arr, target, idx+1);
    }
}
