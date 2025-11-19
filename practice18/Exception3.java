package practice18_20.practice18;

import java.util.Scanner;

public class Exception3 {

    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e) {
            System.out.println("Общее исключение: " + e.getMessage());
//        } catch (NumberFormatException e) {
//            System.out.println("Неверный формат числа!");
//        } catch (ArithmeticException e) {
//            System.out.println("Деление на ноль!");
        } finally {
            myScanner.close();
        }
    }

    // Правильная версия с правильным порядком catch
    public void exceptionDemoCorrect() {
        Scanner myScanner = new Scanner(System.in);

        try {
            System.out.print("Введите Int: ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат числа!");
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        } catch (Exception e) {
            System.out.println("Общее исключение: " + e.getMessage());
        } finally {
            myScanner.close();
        }
    }

    public static void main(String[] args) {
        Exception3 demo = new Exception3();

        System.out.println("Неправильный порядок catch");
        demo.exceptionDemo();

        System.out.println("Правильный порядок catch");
        demo.exceptionDemoCorrect();
    }
}