package practice10;

class Student {
    private String name;
    private String surname;
    private String specialty;
    private int course;
    private String group;
    private double averageScore;

    public Student(String name, String surname, String specialty, int course, String group, double averageScore) {
        this.name = name;
        this.surname = surname;
        this.specialty = specialty;
        this.course = course;
        this.group = group;
        this.averageScore = averageScore;
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public String getSpecialty() { return specialty; }
    public int getCourse() { return course; }
    public String getGroup() { return group; }
    public double getAverageScore() { return averageScore; }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }
    public void setCourse(int course) { this.course = course; }
    public void setGroup(String group) { this.group = group; }
    public void setAverageScore(double averageScore) { this.averageScore = averageScore; }

    @Override
    public String toString() {
        return String.format("%s %s, %s, курс %d, группа %s, средний балл: %.2f",
                surname, name, specialty, course, group, averageScore);
    }
}