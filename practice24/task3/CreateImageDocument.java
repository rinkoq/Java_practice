package practice24_26.practice24.task3;

public class CreateImageDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        System.out.println("[Фабрика] Создание нового изображения");
        return new ImageDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("[Фабрика] Открытие существующего изображения");
        return new ImageDocument("Фото.png", "3840x2160");
    }
}
