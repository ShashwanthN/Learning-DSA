public class IsArrSorted {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 10, 24, 44};
        helper(arr);
    }
    static void helper(int[] arr) {
        if(arr == null) System.out.println(false);;
        System.out.println(checkSorted(arr, 0));
    }
    private static boolean checkSorted(int[] arr, int idx) {
        if(idx==arr.length -1){
            return true;
        }

        return arr[idx]<arr[idx + 1] && checkSorted(arr, idx+1);


    }

}
