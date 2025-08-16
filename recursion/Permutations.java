public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");
    }

    static void permutations(String p, String up) {
       if(up.isEmpty()){
           System.out.println(p);
           return;
       }

       char ch = up.charAt(0);
       for(int i = 0; i<=p.length(); i++){
           String s = p.substring(0,i);
           String e = p.substring(i);
           permutations(s+ch+e, up.substring(1));
        }
    }
}
