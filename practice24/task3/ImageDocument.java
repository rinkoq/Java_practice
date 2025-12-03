package practice24_26.practice24.task3;

public class ImageDocument implements IDocument {
    private String filename;
    private String resolution;

    public ImageDocument() {
        this.filename = "Новое изображение.png";
        this.resolution = "1920x1080";
    }

    public ImageDocument(String filename, String resolution) {
        this.filename = filename;
        this.resolution = resolution;
    }

    @Override
    public void open() {
        System.out.println("Открытие изображения: " + filename);
        System.out.println("Разрешение: " + resolution);
    }

    @Override
    public void save() {
        System.out.println("Сохранение изображения: " + filename);
        System.out.println("Сжатие в формате PNG...");
    }

    @Override
    public void close() {
        System.out.println("Закрытие изображения: " + filename);
    }

    @Override
    public String getType() {
        return "Изображение";
    }

    @Override
    public String getContent() {
        return "Изображение [" + resolution + "]";
    }

    public void editWithFilter(String filter) {
        System.out.println("Применение фильтра '" + filter + "' к изображению");
    }
}
