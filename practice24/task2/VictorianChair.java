package practice24_26.practice24.task2;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Сидим на викторианском стуле");
    }

    @Override
    public String getType() {
        return "Викторианский";
    }
}
