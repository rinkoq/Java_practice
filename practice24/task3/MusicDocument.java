package practice24_26.practice24.task3;

public class MusicDocument implements IDocument {
    private String filename;
    private String artist;
    private String duration;

    public MusicDocument() {
        this.filename = "Новая композиция.mp3";
        this.artist = "Неизвестный исполнитель";
        this.duration = "3:45";
    }

    public MusicDocument(String filename, String artist, String duration) {
        this.filename = filename;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public void open() {
        System.out.println("Воспроизведение аудиофайла: " + filename);
        System.out.println("Исполнитель: " + artist);
        System.out.println("Длительность: " + duration);
        System.out.println("♪ ♫ ♬ Звучит музыка... ♬ ♫ ♪");
    }

    @Override
    public void save() {
        System.out.println("Сохранение аудиофайла: " + filename);
        System.out.println("Экспорт в MP3 формат...");
    }

    @Override
    public void close() {
        System.out.println("Остановка воспроизведения: " + filename);
    }

    @Override
    public String getType() {
        return "Аудиофайл";
    }

    @Override
    public String getContent() {
        return artist + " - " + duration;
    }

    public void play() {
        System.out.println("▶ Воспроизведение: " + filename);
    }

    public void pause() {
        System.out.println("⏸ Пауза: " + filename);
    }
}
