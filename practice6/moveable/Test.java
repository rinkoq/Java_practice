package practice6.moveable;

public class Test {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 1, 1, 1);
        // Демонстрация движения точки
        System.out.println("MovablePoint");
        System.out.println("Исходное состояние: " + point);
        point.moveUp();
        System.out.println("После moveUp(): " + point);
        point.moveRight();
        System.out.println("После moveRight(): " + point);

        System.out.println();
        MovableCircle circle = new MovableCircle(2, 2, 1, 1, 5);
        // Демонстрация движения круга
        System.out.println("MovableCircle");
        System.out.println("Исходное состояние: " + circle);
        circle.moveDown();
        System.out.println("После moveDown(): " + circle);
        circle.moveLeft();
        System.out.println("После moveLeft(): " + circle);

        System.out.println();
        MovableRectangle rectangle = new MovableRectangle(1, 5, 2, 3, 3, 6);
        //Демонстрация движения прямоугольника
        System.out.println("MovableRectangle");
        System.out.println("Исходное состояние: " + rectangle);
        rectangle.moveDown();
        System.out.println("После moveDown(): " + rectangle);
        rectangle.moveRight();
        System.out.println("После moveLeft(): " + rectangle);
    }

}