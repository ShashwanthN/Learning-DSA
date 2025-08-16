public class SkipAChar {

    public static void main(String[] args) {
       String str = "bappleccad";
        filterStr("", str ,'a');
        System.out.println(filterStrRtr(str ,"apple"));
    }

    static void filterStr(String str, String subStr, char toBeRemoved) {

        if(subStr.isEmpty()){
            System.out.println(str);
            return;
        }
        char ch = subStr.charAt(0);
        if(ch == toBeRemoved) {
            filterStr(str, subStr.substring(1), toBeRemoved);
        } else {
            filterStr(str + ch, subStr.substring(1), toBeRemoved);
        }
    }

    static String filterStrRtr(String str, String toBeRemoved) {

        if(str.isEmpty()){
            //System.out.println(str);
            return str;
        }
        //char ch = subStr.charAt(0);
        if(str.startsWith(toBeRemoved)) {
            return filterStrRtr(str.substring(toBeRemoved.length()), toBeRemoved);
        } else {
            return str.charAt(0) + filterStrRtr(str.substring(1), toBeRemoved);
        }
    }
}


/*
s = baccad
    |{    } -> input at recursive call
    -> until only last element in the string is visited, return.
       <-|

 */