import java.util.ArrayList;

public class LinearSearchMultipleOccurrences {
    public static void main(String[] args) {
            int[] arr = {1, 3, 4, 6, 10, 24, 24, 24, 44};
            System.out.println(recHelper(arr, 24));
    }

    static ArrayList<Integer> recHelper(int[] arr, int target) {
        if(arr == null) {
            return null;
        }
        return recLinearSearch(arr, target, 0, new ArrayList<Integer>());
    }

    private static ArrayList<Integer> recLinearSearch(int[] arr, int target, int idx, ArrayList<Integer> Occurrences) {
        if(arr[idx] ==  target){
            Occurrences.add(idx);
        } else if(idx >= arr.length -1){
            return Occurrences;
        }

        return recLinearSearch(arr, target, idx+1, Occurrences);
    }
}
