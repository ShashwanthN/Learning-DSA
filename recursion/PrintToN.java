public class PrintToN {
    public static void main(String[] args) {
        printToN(10);
    }

    static void printToN(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        printToN(n-1);
        System.out.println(n);

    }
}
