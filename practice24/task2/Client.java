package practice24_26.practice24.task2;

public class Client {
    public void sit(Chair chair) {
        System.out.println("Клиент садится на " + chair.getType() + " стул");
        chair.sitOn();
    }
}