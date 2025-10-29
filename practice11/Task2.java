package practice11;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Получаем текущую дату
        Date currentDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Текущая системная дата: " + sdf.format(currentDate));

        // Запрашиваем дату у пользователя
        System.out.println("\nВведите дату (в формате dd.MM.yyyy):");
        String userInput = scanner.nextLine();

        try {
            // Парсим введенную дату
            Date userDate = sdf.parse(userInput);

            // Форматируем обе даты в строки для сравнения
            String currentDateStr = sdf.format(currentDate);
            String userDateStr = sdf.format(userDate);

            System.out.println("Введенная дата: " + userDateStr);
            System.out.println("Текущая дата: " + currentDateStr);

            if (userDateStr.equals(currentDateStr)) {
                System.out.println("Даты равны");
            } else if (userDate.before(sdf.parse(currentDateStr))) {
                System.out.println("Введенная дата раньше текущей даты");
            } else {
                System.out.println("Введенная дата раньше текущей даты");
            }

        } catch (ParseException e) {
            System.out.println("Ошибка");
        }

        scanner.close();
    }
}