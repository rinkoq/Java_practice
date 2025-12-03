package practice24_26.practice24.task3;

public class CreateMusicDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        System.out.println("[Фабрика] Создание нового аудиофайла");
        return new MusicDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("[Фабрика] Открытие существующего аудиофайла");
        return new MusicDocument("Песня.mp3", "Queen", "5:55");
    }
}