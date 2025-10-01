package practice6.convertable;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        Convertable toKelvin = new ToKelvin(celsius);
        Convertable toFahrenheit = new ToFahrenheit(celsius);

        System.out.println(toKelvin);
        System.out.println(toFahrenheit);

        scanner.close();
    }
}

