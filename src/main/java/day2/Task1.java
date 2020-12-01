package day2;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int et = sc.nextInt();

    if (et >= 1 && et <= 4){
        System.out.println("Малоэтажный дом");
    } else if(et >= 5 && et <= 8){
        System.out.println("Среднеэтажный дом");
    } else if (et >= 9){
        System.out.println("Многоэтажный дом");
    } else {
        System.out.println("Ошибка ввода");
    }


    }
}
