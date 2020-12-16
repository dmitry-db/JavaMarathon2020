package day16;

import java.io.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("C:/Users/Dmitry/javaprojects/JavaMarathon2020/src/main/java/day16/file1.txt");
        File file2 = new File("C:/Users/Dmitry/javaprojects/JavaMarathon2020/src/main/java/day16/file2.txt");

        file1.createNewFile();
        file2.createNewFile();

        PrintWriter fl = new PrintWriter(file1);
        for (int i = 0; i < 1000; i++){
            fl.print((int) (Math.random()*100 + 1) + " ");
        }
        fl.flush();

        Scanner scanner = new Scanner(file1);
        String s = scanner.nextLine();
        String[] ss = s.split(" ");

        double[] arr = new double[50];
        int e = 0;
        int w = 0;
        int sum = 0;
        for (int i = 0; i < 1000; i++){
            w++;
            sum += Integer.parseInt(ss[i]);
            if (w == 20){
                arr[e] = sum / 20.0;
                e++;
                w = 0;
                sum = 0;
            }
        }

        PrintWriter fl2 = new PrintWriter(file2);
        for (int i = 0; i < arr.length; i++) {
            fl2.print(arr[i] + " ");
        }
        fl2.flush();
        printResult(file2);

    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        double sum = 0;
        for (int i = 0; i < 50; i++){
            sum += Double.parseDouble(ss[i]);
        }
        System.out.println((int) sum);
    }
}
