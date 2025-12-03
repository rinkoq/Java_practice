package practice24_26.practice24.task2;

public class MultifunctionalChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сидим на многофункциональном стуле");
    }

    @Override
    public String getType() {
        return "Многофункциональный";
    }
}
