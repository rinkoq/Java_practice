package practice2.circle;

public class Tester {
    private Circle[] circles;  // массив для хранения окружностей
    private int count;  // счетчик реального количества окружностей в массиве

    public Tester(int size) {
        circles = new Circle[size];  // создаем массив заданного размера
        count = 0; // изначально массив пустой
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {  // проверяем, есть ли место в массиве
            circles[count] = circle; // добавляем окружность в массив
            count++; // увеличиваем счетчик
        }
    }

    public void showCircles() {
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester(3);

        tester.addCircle(new Circle(new Point(0, 0), 5));
        tester.addCircle(new Circle(new Point(3, 4), 7));
        tester.addCircle(new Circle(new Point(-2, 1), 3));

        tester.showCircles();
    }
}