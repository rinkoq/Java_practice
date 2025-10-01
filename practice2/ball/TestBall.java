package practice2.ball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0);
        System.out.println(ball);

        ball.move(5, 3);
        System.out.println("После движения: " + ball);

        ball.setXY(10, 15);
        System.out.println("После setXY: " + ball);
    }
}