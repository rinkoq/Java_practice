package practice21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryViewer {

    public static List<String> getFirstFiveFiles(String directoryPath) {
        List<String> fileList = new ArrayList<>();
        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Каталог не существует или путь ведет к файлу");
            return fileList;
        }

        File[] files = directory.listFiles();
        if (files != null) {
            for (int i = 0; i < Math.min(files.length, 5); i++) {
                fileList.add(files[i].getName());
            }
        }

        return fileList;
    }

    public static void main(String[] args) {
        // Просмотр текущей директории
        String currentDir = ".";
        List<String> files = getFirstFiveFiles(currentDir);

        System.out.println("Первые 5 элементов в каталоге '" + currentDir + "':");
        for (int i = 0; i < files.size(); i++) {
            System.out.println((i + 1) + ". " + files.get(i));
        }

        // Просмотр корневой директории проекта (пример)
        String projectDir = "src";
        List<String> projectFiles = getFirstFiveFiles(projectDir);

        if (!projectFiles.isEmpty()) {
            System.out.println("\nПервые 5 элементов в каталоге '" + projectDir + "':");
            for (int i = 0; i < projectFiles.size(); i++) {
                System.out.println((i + 1) + ". " + projectFiles.get(i));
            }
        }
    }
}
