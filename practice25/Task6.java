package practice24_26.practice25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static boolean isValidEmail(String email) {
        // Упрощенная проверка по RFC 2822
        Pattern pattern = Pattern.compile(
                "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"
        );
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testEmails = {
                "user@example.com",
                "root@localhost",
                "myhost@@com.ru",
                "@my.ru",
                "Julia String",
                "test.user+tag@example.co.uk"
        };

        for (String email : testEmails) {
            boolean result = isValidEmail(email);
            System.out.println("Email: " + email + " - " +
                    (result ? "валидный" : "невалидный"));
        }
    }
}
