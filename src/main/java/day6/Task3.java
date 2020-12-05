package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Ivan", "history");
        Student student = new Student("Sergey");

        teacher.evaluate(student);

    }
}
