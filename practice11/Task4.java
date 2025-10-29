package practice11;

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Чтение даты
            System.out.print("Введите дату (Год Месяц Число): ");
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();

            // Чтение времени
            System.out.print("Введите время (Часы Минуты): ");
            int hours = scanner.nextInt();
            int minutes = scanner.nextInt();

            // Создание объекта Calendar
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, day, hours, minutes, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            // Создание объекта Date из Calendar
            Date date = calendar.getTime();

            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
            System.out.println("Объект Date: " + sdf.format(date));

            System.out.println("Объект Calendar: " +
                    String.format("%02d.%02d.%d %02d:%02d",
                            calendar.get(Calendar.DAY_OF_MONTH),
                            calendar.get(Calendar.MONTH) + 1,
                            calendar.get(Calendar.YEAR),
                            calendar.get(Calendar.HOUR_OF_DAY),
                            calendar.get(Calendar.MINUTE)));

        } catch (Exception e) {
            System.out.println("Ошибка ввода данных");
        } finally {
            scanner.close();
        }
    }
}
