package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        do {
            s = scanner.nextLine();
            switch (s){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                case "Россия":
                    System.out.println("Россия");
                    break;

                case "Рим":
                case "Милан":
                case "Турин":
                case "Италия":
                    System.out.println("Италия");
                    break;

                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                case "Англия":
                    System.out.println("Англия");
                    break;

                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                case "Германия":
                    System.out.println("Германия");
                    break;
                case "Stop":
                    break;

                default:
                    System.out.println("Неизвестная страна");
            }
        } while (!s.equals("Stop"));
    }
}
