package practice24_26.practice24.task3;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        // Получаем фабрику
        ICreateDocument factory = getSelectedFactory();

        if (factory == null) {
            System.out.println("Ошибка: не удалось создать фабрику");
            return;
        }

        // Запуск GUI приложения
        startEditor(factory);

        // Демонстрация работы в консоли
        demonstratePattern(factory);
    }

    // Метод для получения фабрики (возвращает финальное значение)
    private static ICreateDocument getSelectedFactory() {
        int choice = showOptionDialog();
        ICreateDocument factory = null;

        switch (choice) {
            case 0: // Текстовый редактор
                factory = new CreateTextDocument();
                System.out.println("Выбран текстовый редактор");
                break;

            case 1: // Редактор изображений
                factory = new CreateImageDocument();
                System.out.println("Выбран редактор изображений");
                break;

            case 2: // Аудио редактор
                factory = new CreateMusicDocument();
                System.out.println("Выбран аудио редактор");
                break;

            default:
                System.out.println("По умолчанию: текстовый редактор");
                factory = new CreateTextDocument();
        }

        return factory;
    }

    // Метод для запуска GUI (принимает фабрику как параметр)
    private static void startEditor(ICreateDocument factory) {
        SwingUtilities.invokeLater(() -> {
            EditorApplication app = new EditorApplication(factory);
            app.setVisible(true);
        });
    }

    private static int showOptionDialog() {
        String[] options = {"Текстовый редактор", "Редактор изображений", "Аудио редактор"};
        return JOptionPane.showOptionDialog(null,
                "Выберите тип редактора для запуска:",
                "Выбор редактора",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
    }

    private static void demonstratePattern(ICreateDocument factory) {

        System.out.println("1. Создание нового документа:");
        IDocument newDoc = factory.createNew();
        System.out.println("Тип созданного документа: " + newDoc.getType());

        System.out.println("\n2. Открытие существующего документа:");
        IDocument openDoc = factory.createOpen();
        System.out.println("Тип открытого документа: " + openDoc.getType());

        System.out.println("\n3. Работа с документами:");
        newDoc.open();
        newDoc.save();
        newDoc.close();

    }
}