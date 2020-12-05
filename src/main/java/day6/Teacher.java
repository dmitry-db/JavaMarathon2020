package day6;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student student){
        int mark = (int) (Math.random() * 4) + 2;
        System.out.println(mark);
        String s = "";
        switch (mark){
            case 2:
                s = "неудовлетворительно";
                break;
            case 3:
                s = "удовлетворительно";
                break;
            case 4:
                s = "хорошо";
                break;
            case 5:
                s = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.name +
                " по предмету " + subject + " на оценку " + s);
    }
}
