public class ChangeCharacter {
    public static void main(String[] args) {
        change("iqa aoisjiaj");
        change("");
        change("238019238");
        change("     ");
    }

    static void change(String s) {
        if(s.isBlank()) {
            System.out.println("Empty Input");
            return;
        }
        StringBuilder result =  new StringBuilder();
        for(char ch : s.toCharArray()) {
            switch (Character.toLowerCase(ch)) {
                case 'a':
                    result.append('@');
                    break;
                case 'e':
                    result.append('#');
                    break;
                case 'i':
                    result.append('!');
                    break;
                case 'o':
                    result.append('*');
                    break;
                case 'u':
                    result.append('^');
                    break;
                default:
                    result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}
