package practice11;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Task1 {
    public static void main(String[] args) {
        try {
            // Устанавливаем фиксированную дату и время получения задания: 15.10.25 9:00
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy HH:mm");
            Date startDate = sdf.parse("15.10.25 09:00");

            // Получаем текущую дату и время (время сдачи задания)
            Date endDate = new Date();

            long difference = endDate.getTime() - startDate.getTime();

            // Вычисляем дни, часы, минуты
            long seconds = difference / 1000;
            long minutes = seconds / 60;
            long hours = minutes / 60;
            long days = hours / 24;

            // Выводим информацию о разработчике
            System.out.println("Информация о выполнении задания:");
            System.out.println("Фамилия: Овчаренко");
            System.out.println("Дата и время получения задания: " + sdf.format(startDate));
            System.out.println("Дата и время сдачи задания: " + sdf.format(endDate));

            System.out.println("\nВремя выполнения:");
            System.out.println(days + " дней, " + (hours % 24) + " часов, " + (minutes % 60) + " минут, " +  (seconds % 60) + " секунд.");
        }

        catch (ParseException e) {
            System.out.println("Ошибка при парсинге даты: " + e.getMessage());
        }
    }
}