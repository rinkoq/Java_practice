package practice18_20.practice18;

import java.util.Scanner;

public class ThrowsDemo3 {

    // Исправленная версия с циклом повторного ввода
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter a key (non-empty string): ");
                String key = myScanner.next();
                printDetails(key);
                validInput = true;

            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Пожалуйста, попробуйте снова.\n");
            }
        }
        myScanner.close();
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key == null || key.trim().isEmpty()) {
            throw new Exception("Key cannot be null or empty");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo3 demo = new ThrowsDemo3();
        demo.getKey();
    }
}