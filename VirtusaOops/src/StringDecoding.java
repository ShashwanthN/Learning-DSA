import java.util.LinkedHashMap;
import java.util.Map;

public class StringDecoding {
    public static void main(String[] args) {
        String s1 = "a2b3c1";
        String s2 = "abc";
        String s3 = "";

        System.out.println(DecodeString(s1));
        System.out.println(DecodeString(s2));
        System.out.println(DecodeString(s3));
    }

    static String DecodeString(String s) {
        // linked hashmap to store the insertion order
        // if the order doesn't matter we can use just ascii look up or hashmap
        // we can use a queue too
        // check if the next value to curr is an integer, if so then just add it to the String builder if not then add it once and move on.
        // Map<String, Integer> count = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (s.isBlank()) {
            return "";
        } else if (s.length() == 1){
            return s;
        }
        while (i < s.length()) {
            char ch = s.charAt(i);
            int n = 1;

            if (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                n = Character.getNumericValue(s.charAt(i + 1));
                i += 2;
            } else {
                i++;
            }

            while (n > 0) {
                sb.append(ch);
                n--;
            }
        }


        return sb.toString();

    }
}
