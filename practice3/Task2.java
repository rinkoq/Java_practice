package practice3;

public class Task2 {
    public static void main(String[] args) {
        // 1. Создание объектов Double с помощью valueOf()
        Double num1 = Double.valueOf(3.14);
        Double num2 = Double.valueOf("2.71");

        // 2. Преобразование String к double
        String str = "123.45";
        double d = Double.parseDouble(str);

        // 3. Преобразование Double к примитивным типам
        Double doubleObj = 456.78;
        int i = doubleObj.intValue();
        long l = doubleObj.longValue();
        float f = doubleObj.floatValue();

        // 4. Вывод на консоль
        System.out.println("Double объект: " + doubleObj);

        // 5. Преобразование double к String
        String result = Double.toString(3.14);

        System.out.println("valueOf(3.14): " + num1);
        System.out.println("parseDouble(\"123.45\"): " + d);
        System.out.println("intValue(): " + i);
        System.out.println("Double.toString(3.14): \"" + result + "\"");
    }
}
