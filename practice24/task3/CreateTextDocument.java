package practice24_26.practice24.task3;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        System.out.println("[Фабрика] Создание нового текстового документа");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("[Фабрика] Открытие существующего текстового документа");
        // В реальном приложении здесь была бы загрузка из файла
        return new TextDocument("Документ1.txt", "Привет, это тестовый текст!");
    }
}