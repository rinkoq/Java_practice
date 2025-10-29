package practice13;

public class Task5 {
    public static class PhoneNumberFormatter {
        public static String formatPhoneNumber(String phone) {
            // Удаляем все нецифровые символы кроме '+'
            String cleaned = phone.replaceAll("[^\\d+]", "");

            if (cleaned.startsWith("+")) {
                // Международный формат: +79175655655 -> +7 917 565 5655
                String countryCode = cleaned.substring(1, cleaned.length() - 10);
                String number = cleaned.substring(1 + countryCode.length());
                return formatNumberParts(countryCode, number);
            } else if (cleaned.startsWith("8") && cleaned.length() == 11) {
                // Российский формат: 89175655655 -> +7 917 565 5655
                String number = cleaned.substring(1);
                return formatNumberParts("7", number);
            } else {
                return "Неверный формат номера";
            }
        }

        private static String formatNumberParts(String countryCode, String number) {
            if (number.length() != 10) {
                return "Неверная длина номера";
            }

            String part1 = number.substring(0, 3);
            String part2 = number.substring(3, 6);
            String part3 = number.substring(6);

            return "+" + countryCode + " " + part1 + " " + part2 + " " + part3;
        }
    }
    public static void main(String[] args) {
        PhoneNumberFormatter phone = new PhoneNumberFormatter();
        String[] testNumbers = {
                "+79175655655",
                "+104289652211",
                "89175655655",
                "+441234567890"
        };

        for (String number : testNumbers) {
            System.out.println(number + " -> " + phone.formatPhoneNumber(number));
        }
    }
}
