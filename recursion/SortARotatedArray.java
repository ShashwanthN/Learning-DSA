public class SortARotatedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 10, 24, 44};
        System.out.println(searchHelper(arr, 10));
    }

    private static int searchHelper(int[] arr, int target) {
        if(arr == null) return -1;
        return searchArr(arr, target, 0, arr.length - 1, (arr.length - 1)/2);
    }

    private static int searchArr(int[] arr, int target, int l, int h, int m) {
        if(l>h){
            return -1;
        }
        if(arr[m] ==  target){
            return m;
        }
        if(arr[l] < arr[m] && arr[m] < target){
            return searchArr(arr, target, l, m-1, l + m/2);
        } else if (arr[h] > arr[m] && arr[m] > target) {
            return searchArr(arr, target, m + 1, h, m + h / 2);
        }
        return -2;
    }
}
