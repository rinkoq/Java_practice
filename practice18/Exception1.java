package practice18_20.practice18;

public class Exception1 {

    // Исходный код (вызовет исключение)
    public void exceptionDemo1() {
        System.out.println(2 / 0); // ArithmeticException: / by zero
    }

    // Измененный код с double
    public void exceptionDemo2() {
        System.out.println(2.0 / 0.0); // Результат: Infinity
    }

    // С обработкой исключения
    public void exceptionDemo3() {
        try {
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String[] args) {
        Exception1 demo = new Exception1();

        // Вызовет исключение
        //demo.exceptionDemo1();

        // Без исключения
        System.out.println("Деление double");
        demo.exceptionDemo2();

        // С обработкой исключения
        System.out.println("С обработкой исключения");
        demo.exceptionDemo3();
    }
}