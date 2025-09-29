public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar", 0, "racecar2".length() - 1));
    }

    static boolean isPalindrome(String s, int l, int r) {
        if(l >= r) return true;

        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }

        return isPalindrome(s, l + 1, r - 1);
    }
}
