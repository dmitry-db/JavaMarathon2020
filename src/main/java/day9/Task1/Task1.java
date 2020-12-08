package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Виктор", "309");
        Teacher teacher = new Teacher("Сергей семенович", "История");
        System.out.println(student.getNamegr());
        System.out.println(teacher.getNamepr());
        student.printInfo();
        teacher.printInfo();
    }
}
