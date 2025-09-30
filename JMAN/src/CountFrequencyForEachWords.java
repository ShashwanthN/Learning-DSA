import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountFrequencyForEachWords {
    public static void main(String[] args) {
        mapfrequency("Hello My Name is Shashwanth");
        mapfrequency("");
        mapfrequency("  ");
        mapfrequency("34234  4324 edwedwe 3424");
        mapfrequency("314234234");
    }

    static void mapfrequency(String s) {
        if(s.isBlank()) {
            System.out.println("Input Words!");
            System.out.println();
            return;
        }
        String[] words = s.trim().split("\\s+");

        for (String word : words) {
            System.out.println(word);
            Map<Character, Integer> freq = new LinkedHashMap<>();
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }

            for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            System.out.println();
        }
    }
}
