public class ReverseInt2 {
    public static void main(String[] args) {

        System.out.println(reverseInt(1234));
    }
    static int sum = 0;
    static int reverseInt(int n) {

        if(n==0){
            return n;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        return reverseInt(n/10);
    }
}
