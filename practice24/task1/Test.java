package practice24_26.practice24.task1;

public class Test {
    public static void main(String[] args) {
        ComplexAbstractFactory factory = new ConcreteFactory();

        Complex c1 = factory.createComplex();
        Complex c2 = factory.createComplex(5, 3);

        System.out.println("Complex 1: " + c1);
        System.out.println("Complex 2: " + c2);
    }
}
