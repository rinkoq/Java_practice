package practice17;

public class MVCPatternDemo {
    public static void main(String[] args) {
        // Получаем данные студента из базы данных
        Student model = retrieveStudentFromDatabase();

        // Создаем представление
        StudentView view = new StudentView();

        // Создаем контроллер
        StudentController controller = new StudentController(model, view);

        // Обновляем представление
        controller.updateView();

        // Обновляем модель через контроллер
        controller.setStudentName("Rita");

        System.out.println("\nAfter updating student name:");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student("018", "Nastya");
        return student;
    }
}
