package practice9;

public class Test {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Иван", 101, 3.8),
                new Student("Мария", 102, 4.2),
                new Student("Петр", 103, 3.5),
                new Student("Анна", 104, 4.7),
                new Student("Сергей", 105, 3.9),
                new Student("Ольга", 106, 4.1)
        };

        System.out.println("Исходный список студентов:");
        printStudents(students);

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students);

        System.out.println("\nОтсортированный список по GPA (убывание):");
        printStudents(students);
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
