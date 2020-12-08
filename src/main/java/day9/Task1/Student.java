package day9.Task1;

public class Student extends Human{
    private String namegr;

    public Student (String name, String namegr){
        super(name);
        this.namegr = namegr;
    }

    public String getNamegr() {
        return namegr;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }
}
