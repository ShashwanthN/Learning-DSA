public class Factorial {

    public static void main(String[] args) {
        System.out.println(recFactorial(5));
    }
    int returnVal = 1;
    public static int recFactorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n * recFactorial(n - 1);
    }
}
