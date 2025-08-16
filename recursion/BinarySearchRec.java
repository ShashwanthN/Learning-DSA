public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 10, 24, 44};
        System.out.println(recBinarySearch(arr, 32));
    }

    static int recBinarySearch(int[] arr, int find){
        if(arr == null ||arr.length == 0) return -1;
        return recBinarySearch(arr, find, 0, arr.length -1);
    }

    static int recBinarySearch(int[] arr, int find, int L, int H) {

        if(L>H) {
            return -1;
        }
        int m = (L + H) / 2;

        if(arr[m] == find) {
            return m;
        } else if (arr[m] > find) {
            return recBinarySearch(arr, find, L, m -1);
        } else {
            return recBinarySearch(arr, find, m + 1, H);
        }


    }

}
