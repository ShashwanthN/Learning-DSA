import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String[] elements = {"ok", "not ok", "9", "20", "20", "not ok", "", ""};

        System.out.printf(Arrays.toString(removeDupsWithSet(elements)));
    }

    static String[] removeDupsWithSet(String[] s) {
        return Arrays.stream(s).distinct().toArray(String[]::new);
    }
}

// use link ed hashed set to preserve the order, distinct uses hashset internally, both the above code yields o(n) mem and time;