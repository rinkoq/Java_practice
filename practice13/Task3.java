package practice13;

import java.util.*;

public class Task3 {
    public static class Address {
        private String country;
        private String region;
        private String city;
        private String street;
        private String house;
        private String building;
        private String apartment;

        public void parseWithSplit(String address) {
            String[] parts = address.split(",");
            if (parts.length >= 7) {
                country = parts[0].trim();
                region = parts[1].trim();
                city = parts[2].trim();
                street = parts[3].trim();
                house = parts[4].trim();
                building = parts[5].trim();
                apartment = parts[6].trim();
            }
        }

        public void parseWithTokenizer(String address) {
            StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
            if (tokenizer.countTokens() >= 7) {
                country = tokenizer.nextToken().trim();
                region = tokenizer.nextToken().trim();
                city = tokenizer.nextToken().trim();
                street = tokenizer.nextToken().trim();
                house = tokenizer.nextToken().trim();
                building = tokenizer.nextToken().trim();
                apartment = tokenizer.nextToken().trim();
            }
        }

        @Override
        public String toString() {
            return String.format("Страна: %s, Регион: %s, Город: %s, Улица: %s, Дом: %s, Корпус: %s, Квартира: %s",
                    country, region, city, street, house, building, apartment);
        }
    }

    public static void main(String[] args) {
        String[] testAddresses = {
                "Россия, Московская область, Москва, Проспект Вернадского, 86, 2, 1304А",
                "Россия. Тульская область. Тула. Металлургов. 60. -. 127",
                "Россия; Московская область; Москва; Проспект Вернадского; 78; Г; 307",
        };

        System.out.println("=== Метод split() ===");
        for (String addr : testAddresses) {
            Address address = new Address();
            address.parseWithSplit(addr);
            System.out.println(address);
        }

        System.out.println("\n=== Метод StringTokenizer ===");
        for (String addr : testAddresses) {
            Address address = new Address();
            address.parseWithTokenizer(addr);
            System.out.println(address);
        }
    }
}

