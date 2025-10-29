package practice11;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Student {
    private String firstName;
    private String lastName;
    private String specialty;
    private int course;
    private String group;
    private double averageScore;
    private Date birthDate; // Добавлено поле для даты рождения

    public Student(String firstName, String lastName, String specialty,
                   int course, String group, double averageScore, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.averageScore = averageScore;
        this.birthDate = birthDate;
    }

    // Геттеры и сеттеры
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSpecialty() { return specialty; }
    public int getCourse() { return course; }
    public String getGroup() { return group; }
    public double getAverageScore() { return averageScore; }
    public Date getBirthDate() { return birthDate; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }
    public void setCourse(int course) { this.course = course; }
    public void setGroup(String group) { this.group = group; }
    public void setAverageScore(double averageScore) { this.averageScore = averageScore; }
    public void setBirthDate(Date birthDate) { this.birthDate = birthDate; }

    // Метод для получения строкового представления даты рождения по формату
    public String getFormattedBirthDate(String formatType) {
        if (birthDate == null) {
            return "Дата рождения не указана";
        }

        SimpleDateFormat sdf;
        switch (formatType.toLowerCase()) {
            case "короткий":
            case "short":
                sdf = new SimpleDateFormat("dd.MM.yy");
                break;
            case "средний":
            case "medium":
                sdf = new SimpleDateFormat("dd MMM yyyy");
                break;
            case "полный":
            case "full":
                sdf = new SimpleDateFormat("EEEE, d MMMM yyyy 'г.'");
                break;
            case "стандартный":
            case "standard":
                sdf = new SimpleDateFormat("yyyy-MM-dd");
                break;
            default:
                sdf = new SimpleDateFormat("dd.MM.yyyy");
        }

        return sdf.format(birthDate);
    }

    // Переопределенный метод toString()
    @Override
    public String toString() {
        String birthDateStr = (birthDate != null) ?
                getFormattedBirthDate("средний") : "не указана";

        return String.format("%s %s, %s, курс %d, группа %s, средний балл: %.2f, дата рождения: %s",
                firstName, lastName, specialty, course, group, averageScore, birthDateStr);
    }
}

// Тестовый класс для демонстрации