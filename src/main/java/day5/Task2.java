package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2005, "yellow", "zvezda");

        System.out.println("Год выпуска - " + motorbike.getYear());
        System.out.println("Цвет - " + motorbike.getColor());
        System.out.println("Модель - " + motorbike.getModel());
    }
}
