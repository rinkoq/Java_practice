package practice18_20.practice18;

import java.util.Scanner;

public class Exception4 {

    public void exceptionDemo() {
        Scanner myScanner = null;

        try {
            myScanner = new Scanner(System.in);
            System.out.print("Введите Int: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println("Результат: " + (2 / i));

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Неверный формат числа!");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!");
        } finally {
            // Блок finally выполняется ВСЕГДА
            if (myScanner != null) {
                myScanner.close();
            }
            System.out.println("Блок finally выполнен.");
        }
    }

    public static void main(String[] args) {
        Exception4 demo = new Exception4();
        demo.exceptionDemo();
    }
}