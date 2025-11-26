package practice22;

import java.util.Stack;

public class RPNCalculator {
    private Stack<Double> stack;

    // Конструктор без параметров
    public RPNCalculator() {
        stack = new Stack<>();
    }

    public double evaluate(String expression) {
        if (expression == null || expression.trim().isEmpty()) {
            throw new IllegalArgumentException("Выражение не может быть пустым");
        }

        String[] tokens = expression.trim().split("\\s+");
        stack.clear();

        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalStateException("Недостаточно операндов для операции " + token);
                }
                double b = stack.pop();
                double a = stack.pop();
                double result = performOperation(a, b, token);
                stack.push(result);
            } else {
                throw new IllegalArgumentException("Некорректный токен: " + token);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalStateException("Некорректное выражение: в стеке осталось " + stack.size() + " элементов");
        }

        return stack.peek();
    }

    // Исправленное имя метода
    public int getStackSize() {
        return stack.size();
    }

    private boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private double performOperation(double a, double b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Деление на ноль");
                return a / b;
            default: throw new IllegalArgumentException("Неизвестный оператор: " + operator);
        }
    }
}