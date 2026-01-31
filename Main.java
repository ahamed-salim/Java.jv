class Student {
    int id;
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.id = 164;
        s1.name = "Salim Ahamed";

        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
    }
}
