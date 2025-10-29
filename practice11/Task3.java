package practice11;

import java.util.Date;

public class Task3 {
    public static void main(String[] args) {
        // Создаем студентов с датами рождения
        Student student1 = new Student("Мария", "Васильева", "Промышленная информатика",
                2, "ПВБО-01-24", 4.1, new Date(106, 3, 03)); // 03.04.2006

        Student student2 = new Student("Артем", "Абаджян", "Промышленная информатика",
                1, "ПВБО-01-24", 4.3, new Date(106, 10, 23)); // 23.11.2006

        Student student3 = new Student("Кристина", "Мордвинова", "Промышленная информатика",
                1, "ПВБО-01-24", 4.0, new Date(107, 9, 07)); // 07.10.2007

        Student student4 = new Student("Маргарита", "Овчаренко", "Промышленная информатика",
                1, "ПВБО-01-24", 5.0, new Date(106, 01, 20)); // 20.02.2006

        // Выводим информацию о студентах в разных форматах
        System.out.println("Информация о студентах");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("\nРазные форматы даты рождения");
        System.out.println("Студент: " + student1.getFirstName() + " " + student1.getLastName());
        System.out.println("Короткий формат: " + student1.getFormattedBirthDate("короткий"));

        System.out.println("\nСтудент: " + student2.getFirstName() + " " + student2.getLastName());
        System.out.println("Средний формат: " + student2.getFormattedBirthDate("средний"));

        System.out.println("\nСтудент: " + student3.getFirstName() + " " + student3.getLastName());
        System.out.println("Полный формат: " + student3.getFormattedBirthDate("полный"));

        System.out.println("\nСтудент: " + student4.getFirstName() + " " + student4.getLastName());
        System.out.println("Стандартный формат: " + student4.getFormattedBirthDate("стандарт"));
    }
}