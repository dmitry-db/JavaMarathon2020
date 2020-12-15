package day15.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/Dmitry/javaprojects/JavaMarathon2020/src/main/resources/shoes.csv");
        File file1 = new File("test15");

        Scanner scanner = new Scanner(file);
        PrintWriter pr = new PrintWriter(file1);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] s = line.split(";");
            if (Integer.parseInt(s[2]) == 0) {
                pr.println(line);
            }
        }

        pr.flush();
        pr.close();
        scanner.close();
    }

}

