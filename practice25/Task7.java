package practice24_26.practice25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static boolean isStrongPassword(String password) {
        // Проверяем длину не менее 8 символов
        if (password.length() < 8) {
            return false;
        }

        // Проверяем наличие хотя бы одной заглавной буквы
        Pattern upperCasePattern = Pattern.compile("[A-Z]");
        Matcher upperCaseMatcher = upperCasePattern.matcher(password);
        if (!upperCaseMatcher.find()) {
            return false;
        }

        // Проверяем наличие хотя бы одной строчной буквы
        Pattern lowerCasePattern = Pattern.compile("[a-z]");
        Matcher lowerCaseMatcher = lowerCasePattern.matcher(password);
        if (!lowerCaseMatcher.find()) {
            return false;
        }

        // Проверяем наличие хотя бы одной цифры
        Pattern digitPattern = Pattern.compile("\\d");
        Matcher digitMatcher = digitPattern.matcher(password);
        if (!digitMatcher.find()) {
            return false;
        }

        // Проверяем, что используются только разрешенные символы
        Pattern validCharsPattern = Pattern.compile("^[a-zA-Z0-9_]+$");
        Matcher validCharsMatcher = validCharsPattern.matcher(password);
        return validCharsMatcher.matches();
    }

    public static void main(String[] args) {
        String[] testPasswords = {
                "F032_Password",
                "TrySpy1",
                "smart_pass",
                "A007",
                "StrongPass123",
                "weak"
        };

        for (String password : testPasswords) {
            boolean result = isStrongPassword(password);
            System.out.println("Пароль: " + password + " - " +
                    (result ? "надежный" : "ненадежный"));
        }
    }
}
