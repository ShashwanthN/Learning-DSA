public class TrianglePattern {

    public static void main(String[] args) {
        printTHelper(4);
    }
    static void printTHelper(int height){
        if(height <= 0){
            System.out.println("");
        }
        printT(height, height);
    }
    static void printT(int h, int l) {
        if(h == 0){
            return;
        }

        if(l == 0) {
            System.out.println("");
            printT(h - 1, h - 1);
            return;
        }
        System.out.print("*" + " ");
        printT(h, l-1);


    }
}
