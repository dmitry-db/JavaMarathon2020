package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYear(2010);
        car.setColor("green");
        car.setModel("bmw");

        System.out.println("Год выпуска - " + car.getYear());
        System.out.println("Цвет - " + car.getColor());
        System.out.println("Модель - " + car.getModel());
    }
}
