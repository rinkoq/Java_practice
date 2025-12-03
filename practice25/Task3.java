package practice24_26.practice25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void extractPrices(String text) {
        // Регулярное выражение для цен в USD, RUB, EU
        Pattern pattern = Pattern.compile("\\b\\d+(\\.\\d{1,2})?\\s*(USD|RUB|EU)\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.println("Найденные цены:");
        while (matcher.find()) {
            System.out.println("- " + matcher.group());
        }
    }

    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 1000 RUB, 44.50 EU, 44 ERR, 0.004 EU, 1500.75 USD";
        extractPrices(text);
    }
}
