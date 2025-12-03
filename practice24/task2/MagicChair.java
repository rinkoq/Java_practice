package practice24_26.practice24.task2;

public class MagicChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сидим на магическом стуле");
    }

    @Override
    public String getType() {
        return "Магический";
    }
}