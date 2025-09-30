public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("okok"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("heleh"));
        System.out.println(isPalindrome("helleh"));
    }

    static boolean isPalindrome(String s) {
        int i = 0, j =  s.length() - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
