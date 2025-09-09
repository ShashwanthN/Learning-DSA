class UserMainCode {
    public static void main(String[] args) {
        System.out.println(returneven(3, new int[]{1,2,3}));
    }
    public static int returneven(int input1, int[] input2) {
        return countWays(input2, 0, 0) - 1;
    }

    // Recursive helper
    private static int countWays(int[] arr, int index, int total) {
        // Base case: all rounds finished
        if (index == arr.length) {
            return total % 2 == 0 ? 1 : 0;
        }

        // Case 1: Skip this round
        int skip = countWays(arr, index + 1, total);

        // Case 2: Eat this round
        int[] updated = arr.clone();
        for (int i = index + 1; i < arr.length; i++) {
            updated[i] += arr[index];  // add effect to future rounds
        }
        int eat = countWays(updated, index + 1, total + arr[index]);

        return skip + eat;
    }
}
