package practice18_20.practice18;

public class ThrowsDemo {

    // Шаг 1: Генерация исключения
    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("Ключ получен: " + key);
    }

    // Шаг 2: С обработкой внутри метода
    public void getDetailsWithTryCatch(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            System.out.println("Ключ получен: " + key);
        } catch (NullPointerException e) {
            System.out.println("Ошибка перехвачена: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();

        // Шаг 1: Вызовет исключение
        try {
            demo.getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в main: " + e.getMessage());
        }

        // Шаг 2: Обработка внутри метода
        System.out.println("С обработкой внутри метода");
        demo.getDetailsWithTryCatch(null);
        demo.getDetailsWithTryCatch("validKey");
    }
}