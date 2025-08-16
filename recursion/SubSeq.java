import java.util.ArrayList;
import java.util.Objects;

public class SubSeq {
    public static void main(String[] args) {
        subseq("", "abc");
        System.out.println(ascii("", "abc").toString());
    }

    static void subseq(String p, String up) {
        if(up.isEmpty()){
            if(!Objects.equals(p, "")) {
                System.out.println(p);
            }
            return;
        }

        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subSeqRtr(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(!Objects.equals(p, "")) {

                list.add(p);

            }
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeqRtr(p+ch, up.substring(1));
        ArrayList<String> right = subSeqRtr(p, up.substring(1));

        left.addAll(right);

        return left;
    }

    static ArrayList<String> ascii(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            if(!Objects.equals(p, "")) {

                list.add(p);

            }
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = ascii(p+ch, up.substring(1));
        ArrayList<String> right = ascii(p, up.substring(1));
        ArrayList<String> asciiList= ascii(p + (ch+0), up.substring(1));

        left.addAll(right);
        left.addAll(asciiList);
        return left;
    }
}
