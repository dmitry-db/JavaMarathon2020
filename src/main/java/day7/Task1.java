package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boing", 2010, 55, 10000);
        Airplane airplane2 = new Airplane("s7", 2015, 44, 15000);


        Airplane.compareAirplanes(airplane1, airplane2);
    }
}