public class PasswordValidation {
    public static void main(String[] args) {
        System.out.println(isValidPassword(""));
        System.out.println(isValidPassword("3923"));
        System.out.println(isValidPassword("3232323123123"));
        System.out.println(isValidPassword("sijsqwiojo@sijsw"));
        System.out.println(isValidPassword("sijsqwioj@342osijsw"));
        System.out.println(isValidPassword("sijsqwioj@342 osijsw"));
        System.out.println(isValidPassword("                 "));
        System.out.println(isValidPassword("siSsqwioj@342osijsw"));
        System.out.println(isValidPassword("43d@23"));
    }

    static boolean isValidPassword(String password) {
        return password.length() > 8 && password.length() < 40 &&
                password.matches(".*[A-Z].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[0-9].*") &&
                password.matches(".*[!@#$%^&*_+=-].*");
    }
}
