import java.util.Random;

public class GeneratePassword {
    public static void main(String[] args) {
        System.out.println(generatePassword());
        System.out.println(generatePassword());
        System.out.println(generatePassword());
        System.out.println(generatePassword());
        System.out.println(generatePassword());
    }

    static String generatePassword() {
        int maxLength = 8;
        StringBuilder password = new StringBuilder();

        Random random = new Random();

        for (int i = 0; i < maxLength; i++) {
            password.append((char) (random.nextInt(126 - 32 + 1) + 32));
        }
        String result = password.toString();
        if(validatePassword(result)) {
            return result;
        } else {
            return generatePassword();
        }
    }

    static boolean validatePassword(String password) {
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;
        String specialChars = "!@#$%^&*()_+=-";

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (specialChars.indexOf(c) >= 0) hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}


/*
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratePassword {
    private static final SecureRandom RANDOM = new SecureRandom();
    private static final String UPPER   = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER   = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS  = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()_+=-[]{}<>?,./";

    public static void main(String[] args) {
        // recommended length: 12 or more
        System.out.println(generatePassword(12));
        System.out.println(generatePassword(16));
        System.out.println(generatePassword(12));
        System.out.println(generatePassword(14));
        System.out.println(generatePassword(12));
    }

    public static String generatePassword(int length) {
        if (length < 4) {
            throw new IllegalArgumentException("length must be at least 4 to include all character classes");
        }

        List<Character> chars = new ArrayList<>(length);

        // guarantee one of each required category
        chars.add(randomChar(UPPER));
        chars.add(randomChar(LOWER));
        chars.add(randomChar(DIGITS));
        chars.add(randomChar(SPECIAL));

        // fill remaining with random chars from all allowed
        String all = UPPER + LOWER + DIGITS + SPECIAL;
        for (int i = 4; i < length; i++) {
            chars.add(randomChar(all));
        }

        // shuffle to remove predictability of initial category placement
        Collections.shuffle(chars, RANDOM);

        StringBuilder sb = new StringBuilder(length);
        for (char c : chars) sb.append(c);
        return sb.toString();
    }

    private static char randomChar(String source) {
        return source.charAt(RANDOM.nextInt(source.length()));
    }
}

*/