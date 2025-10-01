package practice2.author;

public class TestAuthor {
    public static void main(String[] args) { //psvm
        System.out.println("test"); // sout
        Author author0 = new Author("rinkoq@mail.ru", "Рита Овчаренко", 'f'); //char - '?' один символ
        System.out.println(author0);
        Author author1 = new Author("Artem", "abadzanartem0@gmail.com", 'm');
        System.out.println(author1);
        author0.setEmail("ovcharenkomargarira497@gmail.com");
        System.out.println(author0);
        System.out.println(author0.getEmail());
    }
}
