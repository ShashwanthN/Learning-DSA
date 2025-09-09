public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverseInt(1234));
    }

    static int reverseInt(int n) {
        int digits = (int) Math.log10(n) + 1;
        return reverseInt(n, digits);
    }

    static int reverseInt(int n, int args) {
        if(n<10){
            return n;
        }

         return (n%10)* (int) (Math.pow(10, args-1)) + reverseInt(n / 10, args -1);
    }
}
