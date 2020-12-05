package day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model){
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

    void info(){
        System.out.println("Это мотоцикл");
    }
    int yearDifference(int year1) {
        return Math.abs(year1 - year);
    }
}
