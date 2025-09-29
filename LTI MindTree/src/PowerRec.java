public class PowerRec {
    public static void main(String[] args) {
        System.out.println(findPower(2, 5));
        System.out.println(findPower(2, 0));
        System.out.println(findPower(0, 0));
        System.out.println(findPower(1, 2));
        System.out.println(findPower(1, 0));
        System.out.println(findPower(0, 5));
    }

    static int findPower(int n, int pow) {
        if (n == 0 && pow == 0) {
            return 1;
        }

        if (pow == 0) {
            return 1;
        }

        if (pow == 1) {
            return n;
        }

        return n * findPower(n, pow - 1);
    }
}
