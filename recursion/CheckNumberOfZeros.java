public class CheckNumberOfZeros {
    public static void main(String[] args) {
        countZeros(202000);
        System.out.println(count);
    }

    private static void countZeros(int i) {
        if(i==0){
            count++;
        }
        int rem = i%10;
        if( rem == i){
            return;
        }
        if(rem == 0){
            count++;
        }


        countZeros(i/10);
    }

    static int count = 0;
}
