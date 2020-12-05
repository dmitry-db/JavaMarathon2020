package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weigth;
    private int fuel;

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Airplane(String producer, int year, int length, int weigth){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weigth = weigth;
        fuel = 0;
    }

    void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска:" + year +
                ", длина:" + length + ", вес:" + weigth + ", количество топлива в баке:" + fuel);
    }

    void fillUp(int x){
        fuel += x;
    }


    public int getFuel() {
        return fuel;
    }
}
