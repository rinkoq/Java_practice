package practice18_20.practice19;

public class InvalidINNException extends Exception {

    public InvalidINNException(String errorMessage) {
        super(errorMessage);
    }

    // Конструктор с причиной исключения
    public InvalidINNException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}