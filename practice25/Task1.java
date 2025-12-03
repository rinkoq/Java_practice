package practice24_26.practice25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для обработки:");
        String input = scanner.nextLine();

        boolean running = true;
        while (running) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Разбить строку по пробелам");
            System.out.println("2. Найти все числа в строке");
            System.out.println("3. Найти все слова");
            System.out.println("4. Удалить все знаки препинания");
            System.out.println("5. Проверить наличие email");
            System.out.println("6. Выход");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    splitBySpaces(input);
                    break;
                case 2:
                    findNumbers(input);
                    break;
                case 3:
                    findWords(input);
                    break;
                case 4:
                    removePunctuation(input);
                    break;
                case 5:
                    findEmails(input);
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный выбор!");
            }
        }
        scanner.close();
    }

    public static void splitBySpaces(String input) {
        String[] parts = input.split("\\s+");
        System.out.println("Разбиение по пробелам:");
        for (String part : parts) {
            System.out.println("- " + part);
        }
    }

    public static void findNumbers(String input) {
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(input);
        System.out.println("Найденные числа:");
        while (matcher.find()) {
            System.out.println("- " + matcher.group());
        }
    }

    public static void findWords(String input) {
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]+");
        Matcher matcher = pattern.matcher(input);
        System.out.println("Найденные слова:");
        while (matcher.find()) {
            System.out.println("- " + matcher.group());
        }
    }

    public static void removePunctuation(String input) {
        String result = input.replaceAll("[^a-zA-Zа-яА-Я0-9\\s]", "");
        System.out.println("Строка без знаков препинания: " + result);
    }

    public static void findEmails(String input) {
        Pattern pattern = Pattern.compile("\\b[\\w.]+@[\\w.]+\\.[a-z]{2,}\\b");
        Matcher matcher = pattern.matcher(input);
        System.out.println("Найденные email:");
        boolean found = false;
        while (matcher.find()) {
            System.out.println("- " + matcher.group());
            found = true;
        }
        if (!found) {
            System.out.println("Email не найдены");
        }
    }
}
