package practice24_26.practice24.task3;

public class TextDocument implements IDocument {
    private String content;
    private String filename;

    public TextDocument() {
        this.content = "";
        this.filename = "Новый текстовый документ.txt";
    }

    public TextDocument(String filename, String content) {
        this.filename = filename;
        this.content = content;
    }

    @Override
    public void open() {
        System.out.println("Открытие текстового документа: " + filename);
        System.out.println("Содержимое: " + content);
    }

    @Override
    public void save() {
        System.out.println("Сохранение текстового документа: " + filename);
        // Здесь обычно запись в файл
    }

    @Override
    public void close() {
        System.out.println("Закрытие текстового документа: " + filename);
    }

    @Override
    public String getType() {
        return "Текстовый документ";
    }

    @Override
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFilename() {
        return filename;
    }
}