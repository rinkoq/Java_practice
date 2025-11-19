package practice18_20.practice18;

import java.util.Scanner;

public class Exception2 {

    // Шаг 1: Исходный код без обработки исключений
    public void exceptionDemo1() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Введите Int:");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println(2 / i);
        myScanner.close();
    }

    // Шаг 3: С обработкой исключений
    public void exceptionDemo2() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Введите Int: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверный формат числа!");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!");
        } finally {
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        Exception2 demo = new Exception2();

        // Тестирование с разными вводами:
        // Qwerty - NumberFormatException
        // 0 - ArithmeticException
        // 1.2 - NumberFormatException
        // 1 - Успешное выполнение

        System.out.println("Тест");
        demo.exceptionDemo2();
    }
}
