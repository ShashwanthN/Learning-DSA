public class DigitSum {

    public static void main(String[] args) {
        System.out.println( recDigitSum(102321));
    }

    static int recDigitSum(int n){
        if(n<=0){
            return 0;
        }

        return recDigitSum(n/10) + n%10;
    }
}
