package practice13;

public class Task2 {
    public static class Person {
        private String lastName;
        private String firstName;
        private String middleName;

        public Person(String lastName, String firstName, String middleName) {
            this.lastName = lastName != null ? lastName : "";
            this.firstName = firstName != null ? firstName : "";
            this.middleName = middleName != null ? middleName : "";
        }

        public String getFullName() {
            StringBuilder sb = new StringBuilder();
            sb.append(lastName);

            if (!firstName.isEmpty()) {
                sb.append(" ").append(firstName.charAt(0)).append(".");
            }

            if (!middleName.isEmpty()) {
                sb.append(middleName.charAt(0)).append(".");
            }

            return sb.toString();
        }
    }
    public static void main(String[] args) {
        Person p1 = new Person("Овчаренко", "Маргарита", "Игоревна");
        Person p2 = new Person("Овчаренко", "Маргарита", null);
        Person p3 = new Person("Овчаренко", null, null);

        System.out.println("ФИО 1: " + p1.getFullName());
        System.out.println("ФИО 2: " + p2.getFullName());
        System.out.println("ФИО 3: " + p3.getFullName());
    }
}
