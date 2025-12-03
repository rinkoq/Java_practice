package practice24_26.practice24.task3;

public interface IDocument {
    void open();
    void save();
    void close();
    String getType();
    String getContent();
}
