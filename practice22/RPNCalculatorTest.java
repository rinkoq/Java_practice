package practice22;

public class RPNCalculatorTest {
    private RPNCalculator calculator;

    public void setUp() {
        calculator = new RPNCalculator();  // Теперь конструктор без параметров
    }

    //1: Базовые арифметические операции
    public void testBasicOperations() {
        assertEquals(5, calculator.evaluate("2 3 +"), 0.001);
        assertEquals(6, calculator.evaluate("2 3 *"), 0.001);
        assertEquals(2, calculator.evaluate("6 3 /"), 0.001);
        assertEquals(1, calculator.evaluate("3 2 -"), 0.001);
    }

    //2: Комплексные выражения
    public void testComplexExpressions() {
        assertEquals(26, calculator.evaluate("2 3 * 4 5 * +"), 0.001);
        assertEquals(14, calculator.evaluate("5 1 2 + 4 * + 3 -"), 0.001);
    }

    //3: Защита от пустого стека
    public void testEmptyStackProtection() {
        try {
            calculator.evaluate("1 +");
            fail("Должно быть выброшено исключение");
        } catch (IllegalStateException e) {
            // Ожидаемое исключение
        }
    }

    //4: Некорректные выражения
    public void testInvalidExpressions() {
        try {
            calculator.evaluate("1 2 abc +");
            fail("Должно быть выброшено исключение");
        } catch (IllegalArgumentException e) {
            // Ожидаемое исключение
        }
    }

    //5: Деление на ноль
    public void testDivisionByZero() {
        try {
            calculator.evaluate("5 0 /");
            fail("Должно быть выброшено исключение");
        } catch (ArithmeticException e) {
            // Ожидаемое исключение
        }
    }

    //6: Проверка размера стека
    public void testStackSize() {
        calculator.evaluate("2 3 +");
        assertEquals(1, calculator.getStackSize());  // Исправленное имя метода
    }

    // Запуск всех тестов
    public static void main(String[] args) {
        RPNCalculatorTest test = new RPNCalculatorTest();
        test.setUp();

        System.out.println("ЗАПУСК ТЕСТОВ RPN КАЛЬКУЛЯТОРА");
        System.out.println();

        try {
            test.testBasicOperations();
            System.out.println("Базовые операции: ПРОЙДЕНО");

            test.testComplexExpressions();
            System.out.println("Комплексные выражения: ПРОЙДЕНО");

            test.testEmptyStackProtection();
            System.out.println("Защита от пустого стека: ПРОЙДЕНО");

            test.testInvalidExpressions();
            System.out.println("Некорректные выражения: ПРОЙДЕНО");

            test.testDivisionByZero();
            System.out.println("Деление на ноль: ПРОЙДЕНО");

            test.testStackSize();
            System.out.println("Размер стека: ПРОЙДЕНО");

            System.out.println("\nВСЕ ТЕСТЫ УСПЕШНО ПРОЙДЕНЫ");

        } catch (Exception e) {
            System.out.println("ТЕСТ ПРОВАЛЕН: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Вспомогательные методы для тестирования
    private void assertEquals(double expected, double actual, double delta) {
        if (Math.abs(expected - actual) > delta) {
            throw new AssertionError("Ожидалось: " + expected + ", но получено: " + actual);
        }
    }

    private void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Ожидалось: " + expected + ", но получено: " + actual);
        }
    }

    private void fail(String message) {
        throw new AssertionError(message);
    }
}