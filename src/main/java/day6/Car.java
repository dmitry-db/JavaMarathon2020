package day6;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year){
        this.year = year;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }

    void info(){
        System.out.println("Это автомобиль");
    }
    int yearDifference(int year1){
        return Math.abs(year1 - year);
    }
}
