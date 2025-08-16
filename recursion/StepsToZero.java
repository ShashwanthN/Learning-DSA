public class StepsToZero {

    public static void main(String[] args) {
        System.out.println(stepsHelper(8));
    }
    static int stepsHelper(int n) {
        if(n == 0) return 0;
        return steps(n, 0);
    }
    private static int steps(int n, int acc) {
        if(n==0){
            return acc;
        }

        if(n%2==0){
            return steps(n/2, acc + 1);
        } else {
            return steps(n-1, acc + 1);
        }


    }
}
