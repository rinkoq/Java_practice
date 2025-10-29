package practice13;

public class Task1 {
    public static void analyzeString(String str){
        System.out.println("Анализ строки: \"" + str + "\"");
        System.out.println("1. Последний символ: '" + str.charAt(str.length() - 1) + "'");

        System.out.println("2. Заканчивается на '!!!': " + str.endsWith("!!!"));

        System.out.println("3. Начинается на 'I like': " + str.startsWith("I like"));

        System.out.println("4. Содержит 'Java': " + str.contains("Java"));

        System.out.println("5. Позиция 'Java': " + str.indexOf("Java"));

        System.out.println("6. Замена 'a' на 'o': " + str.replace('a', 'o'));

        System.out.println("7. Верхний регистр: " + str.toUpperCase());

        System.out.println("8. Нижний регистр: " + str.toLowerCase());

        int javaIndex = str.indexOf("Java");
        if (javaIndex != -1) {
            System.out.println("9. Вырезать 'Java': " + str.substring(javaIndex, javaIndex + 4));
        }
    }

    public static void main(String[] args) {
        String testString = "I like Java!!";
        analyzeString(testString);
    }
}
