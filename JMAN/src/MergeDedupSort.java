public class MergeDedupSort {

    public static void main(String[] args) {
        String[] arr1 = new String[] {"hello", "notHello", "Small", "big", "big", "hello", "diewd"};
        String[] arr2 = new String[] {"Small", "big", "dekdwd", "diewd", "hello", "kokojjfoir", "notHello", "ooijffr"};

        String[] merged = mergeArrays(arr1, arr2);
        String[] unique = removeDuplicatesCaseInsensitive(merged);
        quickSortCaseInsensitive(unique, 0, unique.length - 1);

        // print result
        for (String s : unique) System.out.println(s);
    }

    // merge two arrays into one
    static String[] mergeArrays(String[] a, String[] b) {
        String[] out = new String[a.length + b.length];
        int idx = 0;
        for (String s : a) out[idx++] = s;
        for (String s : b) out[idx++] = s;
        return out;
    }

    // remove duplicates case-insensitively without using sets
    static String[] removeDuplicatesCaseInsensitive(String[] input) {
        // worst-case unique count is input.length
        String[] temp = new String[input.length];
        int uniqueCount = 0;

        for (int i = 0; i < input.length; ++i) {
            String s = input[i];
            if (s == null) continue; // skip nulls if any
            boolean seen = false;
            // linear scan to see if an equivalent (ignore-case) already exists
            for (int j = 0; j < uniqueCount; ++j) {
                if (temp[j].equalsIgnoreCase(s)) { seen = true; break; }
            }
            if (!seen) {
                temp[uniqueCount++] = s;
            }
        }

        // copy to an array of exact size
        String[] result = new String[uniqueCount];
        for (int i = 0; i < uniqueCount; ++i) result[i] = temp[i];
        return result;
    }

    // quicksort using case-insensitive comparison
    static void quickSortCaseInsensitive(String[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSortCaseInsensitive(arr, low, p - 1);
            quickSortCaseInsensitive(arr, p + 1, high);
        }
    }

    static int partition(String[] arr, int low, int high) {
        String pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; ++j) {
            // compare case-insensitively
            if (arr[j].compareToIgnoreCase(pivot) <= 0) {
                i++;
                // swap arr[i], arr[j]
                String tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        // final swap with pivot
        String tmp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = tmp;
        return i + 1;
    }
}
