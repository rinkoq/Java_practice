package practice11;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Task1Lite {
    public static void main(String[] args) {
        // Получаем дату и время получения задания (текущее время)
        Date startDate = new Date();
        long startTimeMillis = System.currentTimeMillis();

        // Выводим информацию о разработчике
        System.out.println("Информация о выполнении задания");
        System.out.println("Фамилия разработчика: Овчаренко");
        System.out.println("Дата и время получения задания: " + startDate);


        // Получаем дату и время сдачи задания
        Date endDate = new Date();
        long endTimeMillis = System.currentTimeMillis();

        System.out.println("Дата и время сдачи задания: " + endDate);

        // Вычисляем время выполнения
        long executionTime = endTimeMillis - startTimeMillis;
        System.out.println("Время выполнения задания: " + executionTime + " мс");

    }
}
