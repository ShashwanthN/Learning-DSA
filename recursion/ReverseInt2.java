public class ReverseInt2 {
    public static void main(String[] args) {
        reverseInt(1234);
        System.out.println(sum);
    }
    static int sum = 0;
    static void reverseInt(int n) {

        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
    reverseInt(n/10);
    }
}
