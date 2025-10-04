public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(1002));
        System.out.println(isArmstrong(0));
        System.out.println(isArmstrong(1));
    }

    static boolean isArmstrong(int num) {
        String check = String.valueOf(num);
        int maxSum = 0;
        for(int i = 0; i < check.length(); i++) {
            int k = Character.getNumericValue(check.charAt(i));
            maxSum += Math.pow(k, check.length());
        }
        return maxSum == num;
    }
}
