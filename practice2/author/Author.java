package practice2.author;

public class Author {
    private String email;
    private String name;
    private char gender;

    //Alt + Insert или пкм + Generate
    //Задача конструктора выделить память
    //  Метод get позволяет получить значение поля, set — установить новое значение
    // set: тип возвращ знач - имя - [(тип имя), (тип имя)... формальный параметр]
    //Author a = this.Author


    public Author(String email, String name, char gender) {
        this.email = email;
        this.name = name;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        // this для класса - ссылка на этот объект
        // void - тип возвращаемого значения
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    Author() {}

    @Override
    public String toString() {
        return "Author{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
    //lab.Author@a09ee92 без toString
    //Author{email='null', name='null', gender= } с toString
}
