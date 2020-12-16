package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1  {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Test2");
        printResult(file);
    }
    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        double sr = sum / arr.length;
        System.out.print(sr + " ---> ");
        System.out.printf("%.3f", sr);
    }

}

