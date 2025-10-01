package practice4;

public class Main {
    public static void main(String[] args) {
        Season myFavorite = Season.SPRING;
        System.out.println("Мое любимое время года: " + myFavorite);
        System.out.println("Средняя температура: " + myFavorite.getAvgTemp());
        System.out.println("Описание: " + myFavorite.getDescription());
        System.out.println();
        whatILove(myFavorite);
        System.out.println("\nВсе времена года:");
        for (Season s : Season.values()) {
            System.out.println(s + " | Температура: " + s.getAvgTemp() +
                    " | " + s.getDescription());
        }
    }

    public static void whatILove(Season season) {
        switch (season) {
            case WINTER: System.out.println("Я люблю зиму");
            break;
            case SPRING: System.out.println("Я люблю весну");
            break;
            case SUMMER: System.out.println("Я люблю лето");
            break;
            case AUTUMN: System.out.println("Я люблю осень");
            break;        }
    }
}
