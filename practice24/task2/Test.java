package practice24_26.practice24.task2;

public class Test {
    public static void main(String[] args) {
        // Создаем фабрику
        ChairFactory factory = new ModernChairFactory();

        // Создаем клиента
        Client client = new Client();

        System.out.println("Тест");

        // Создаем и тестируем разные стулья
        Chair victorianChair = factory.createVictorianChair();
        client.sit(victorianChair);

        Chair multifunctionalChair = factory.createMultifunctionalChair();
        client.sit(multifunctionalChair);

        Chair magicChair = factory.createMagicChair();
        client.sit(magicChair);

        System.out.println();
        // Дополнительный тест: массив стульев
        System.out.println("Создание массива стульев");

        Chair[] chairs = {
                factory.createVictorianChair(),
                factory.createMultifunctionalChair(),
                factory.createMagicChair()
        };

        for (Chair chair : chairs) {
            System.out.println("Создан стул типа: " + chair.getType());
        }
    }
}
