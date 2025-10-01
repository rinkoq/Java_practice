package practice6.moveable;

public class MovablePoint {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    //Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y -= ySpeed;
    }
    public void moveDown() {
        y += ySpeed;
    }

    public void moveLeft() {
        x -= xSpeed;
    }
    public void moveRight() {
        x += xSpeed;
    }

    // Метод toString()
    public String toString() {
        return "MovablePoint[x=" + x + ", y=" + y +
                ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
    }

    // Геттеры (опционально, но полезно)
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXSpeed() {
        return xSpeed;
    }

    public int getYSpeed() {
        return ySpeed;
    }
}

