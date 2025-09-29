public class FactorialRec {
    public static void main(String[] args) {
        System.out.println(findFactorialRec(10));
        System.out.println(findFactorialRec(0));
        System.out.println(findFactorialRec(1));
    }



    static int findFactorialRec(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFactorialRec(n - 1);
    }


}
