package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("Test2");
        try{
            printSumDigits(file);
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }

    }
    public static void printSumDigits(File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        if (arr.length != 10){
            try {
                throw new ArithmeticException();
            }
            catch (ArithmeticException e){
                System.out.println("Некорректный входной файл");
            }
        }
        else {
            int[] mas = new int[arr.length];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                mas[i] = Integer.parseInt(arr[i]);
                sum += mas[i];
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}
