package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2030);

        car.info();
        System.out.println(car.yearDifference(2020));

        Motorbike motorbike = new Motorbike(2020,"green", "pobeda");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2015));

    }
}
