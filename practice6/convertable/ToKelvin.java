package practice6.convertable;

public class ToKelvin implements Convertable {
    private double celsius;

    public ToKelvin(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public double convert() {
        return celsius + 273.15;
    }

    @Override
    public String toString() {
        return celsius + " °C = " + convert() + " K";
    }
}
