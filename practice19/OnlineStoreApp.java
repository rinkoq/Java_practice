package practice18_20.practice19;

public class OnlineStoreApp {
    public static void main(String[] args) {
        OnlineOrder orderProcessor = new OnlineOrder();

        // Пример 1: Успешное оформление заказа
        try {
            System.out.println("Валидный ИНН");
            orderProcessor.placeOrder("Иванов Иван Иванович", "123456789012");
        } catch (InvalidINNException e) {
            System.out.println("Ошибка: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Причина: " + e.getCause().getMessage());
            }
        }

        // Пример 2: Невалидный ИНН (короткий)
        try {
            System.out.println("Невалидный ИНН");
            orderProcessor.placeOrder("Иванов Иван Иванович", "123");
        } catch (InvalidINNException e) {
            System.out.println("Поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }

        // Пример 3: Пустой ИНН
        try {
            System.out.println("Пустой ИНН");
            orderProcessor.placeOrder("Иванов Иван Иванович", "");
        } catch (InvalidINNException e) {
            System.out.println("Поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }

        // Пример 4: ИНН с буквами
        try {
            System.out.println("ИНН с недопустимыми символами");
            orderProcessor.placeOrder("Иванов Иван Иванович", "123abc456789");
        } catch (InvalidINNException e) {
            System.out.println("Поймано исключение: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
        }
    }
}