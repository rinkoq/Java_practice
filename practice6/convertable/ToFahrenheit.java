package practice6.convertable;

public class ToFahrenheit implements Convertable {
    private double celsius;

     public ToFahrenheit(double celsius){
         this.celsius = celsius;
     }

    @Override
    public double convert() {
        return (celsius * 9/5) + 32;
    }

    @Override
    public String toString() {
        return celsius + " °C = " + convert() + " F";
    }
}
