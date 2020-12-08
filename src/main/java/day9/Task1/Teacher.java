package day9.Task1;

public class Teacher extends Human{
    private String namepr;

    public Teacher(String name, String namepr){
        super(name);
        this.namepr = namepr;
    }

    public String getNamepr() {
        return namepr;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + super.getName());
    }
}
