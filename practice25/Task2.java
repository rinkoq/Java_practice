package practice24_26.practice25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static boolean checkString(String input) {
        Pattern pattern = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String[] testStrings = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340",
                "abc",
                "abcdefghijklmnopqrstuv183401"
        };

        for (String test : testStrings) {
            boolean result = checkString(test);
            System.out.println("Строка: \"" + test + "\" - " +
                    (result ? "правильная" : "неправильная"));
        }
    }
}
