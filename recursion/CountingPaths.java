import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountingPaths {

    public static void main(String[] args) {
        System.out.println(countingPath(4,3));
        System.out.println(countingPathWithDiagonals(4,3));
    }
    static Map<String, BigInteger> hashMap = new HashMap<>();

    static BigInteger countingPath(int n, int m) {
        String key = Math.min(n, m) + "," + Math.max(n, m);
        if (hashMap.containsKey(key)) return hashMap.get(key);
        if (n == 1 || m == 1) {
            hashMap.put(key, BigInteger.ONE);
            return BigInteger.ONE;
        }
        BigInteger count = countingPath(n - 1, m).add(countingPath(n, m - 1));
        hashMap.put(key, count);
        return count;
    }
    static Map<String, BigInteger> hashMap2 = new HashMap<>();
    static BigInteger countingPathWithDiagonals(int n, int m) {
        String key = Math.min(n, m) + "," + Math.max(n, m);
        if (hashMap2.containsKey(key)) return hashMap2.get(key);
        if (n == 1 || m == 1) {
            hashMap2.put(key, BigInteger.ONE);
            return BigInteger.ONE;
        }
        BigInteger count1 = BigInteger.ZERO;
        if(n>1 && m>1){
            count1 = countingPathWithDiagonals(n-1,m-1);
            }
        BigInteger count = countingPathWithDiagonals(n - 1, m).add(count1).add(countingPathWithDiagonals(n, m - 1));
        hashMap2.put(key, count);
        return count;
    }
}
