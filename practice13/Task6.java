package practice13;

import java.io.*;
import java.util.*;

public class Task6 {
    public static String getLine(String... words) {
        if (words == null || words.length == 0) {
            return "";
        }

        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        StringBuilder result = new StringBuilder();
        result.append(wordList.get(0));
        wordList.remove(0);

        while (!wordList.isEmpty()) {
            boolean found = false;
            String lastChar = result.substring(result.length() - 1).toLowerCase();

            for (int i = 0; i < wordList.size(); i++) {
                String word = wordList.get(i);
                if (word.toLowerCase().startsWith(lastChar)) {
                    result.append(" ").append(word);
                    wordList.remove(i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                // Если не нашли подходящее слово, добавляем первое оставшееся
                result.append(" ").append(wordList.get(0));
                wordList.remove(0);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        try {
            System.out.println("Введите имя файла:");
            Scanner scanner = new Scanner(System.in);
            String fileName = scanner.nextLine();

            List<String> words = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] lineWords = line.split("\\s+");
                    // Добавляем только непустые слова
                    for (String word : lineWords) {
                        if (!word.trim().isEmpty()) {
                            words.add(word.trim());
                        }
                    }
                }
            }

            System.out.println("Прочитанные слова: " + words);

            if (words.isEmpty()) {
                System.out.println("Файл пуст или не содержит слов");
                return;
            }

            String result = getLine(words.toArray(new String[0]));
            System.out.println("Результат: " + result);

        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }
    }
}

