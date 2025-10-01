package practice6.moveable;

// MovableCircle.java
public class MovableCircle {
    private int radius;
    private MovablePoint center;

    // Конструктор
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // Реализация методов интерфейса Movable через делегирование
    public void moveUp() {
        center.moveUp();
    }

    public void moveDown() {
        center.moveDown();
    }

    public void moveLeft() {
        center.moveLeft();
    }

    public void moveRight() {
        center.moveRight();
    }

    // Метод toString()
    public String toString() {
        return "MovableCircle[center=" + center.toString() +
                ", radius=" + radius + "]";
    }

    // Геттеры (опционально)
    public int getRadius() {
        return radius;
    }

    public MovablePoint getCenter() {
        return center;
    }
}