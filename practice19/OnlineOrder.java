package practice18_20.practice19;

import java.util.regex.Pattern;

public class OnlineOrder {

    // Метод проверки корректности ИНН (упрощенная версия)
    private boolean isValidINN(String inn) {
        if (inn == null || inn.trim().isEmpty()) {
            return false;
        }

        // Проверка формата: 12 цифр для физического лица
        Pattern innPattern = Pattern.compile("\\d{12}");
        return innPattern.matcher(inn).matches();
    }

    // Метод оформления заказа с обработкой исключений
    public void placeOrder(String fullName, String inn) throws InvalidINNException {
        try {
            // Проверяем валидность ИНН
            if (!isValidINN(inn)) {
                // Создаем исключение с информацией об ошибке
                throw new InvalidINNException(
                        "Недействительный ИНН: '" + inn + "' для клиента: " + fullName +
                                ". ИНН должен содержать 12 цифр."
                );
            }

            // Если ИНН валиден, продолжаем оформление заказа
            processOrder(fullName, inn);

        } catch (IllegalArgumentException e) {
            // Перехватываем возможные другие ошибки и связываем с нашим исключением
            throw new InvalidINNException(
                    "Ошибка при проверке ИНН для клиента: " + fullName,
                    e
            );
        }
    }

    private void processOrder(String fullName, String inn) {
        // Логика обработки заказа
        System.out.println("Заказ успешно оформлен для: " + fullName);
        System.out.println("ИНН клиента: " + inn);
        // Дополнительная логика оформления заказа...
    }
}