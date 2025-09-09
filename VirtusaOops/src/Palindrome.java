public class Palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        String k = "raccar";
        System.out.println(findPalindrome(s));
        System.out.println(findPalindrome(k));

    }

    static boolean findPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
