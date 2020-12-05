package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 2005, 20, 1000);
        airplane.setYear(2010);
        airplane.setLength(25);
        airplane.fillUp(20);
        airplane.fillUp(30);
        airplane.info();
    }
}
