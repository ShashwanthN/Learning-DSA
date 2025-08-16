public class DiceRoll {
    public static void main(String[] args) {
        NumberOfCombinations("", 10);
    }

    static void NumberOfCombinations(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i<=6 && i<=target; i++) {
            NumberOfCombinations(p + i, target - i);
        }
    }

}
