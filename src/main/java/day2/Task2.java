package day2;
import com.sun.xml.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;


public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        //System.out.println("Введите число a");
        int a = s.nextInt();
       // System.out.println("Введите число b");
        int b = s.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            for (int i = a + 1; i < b; i++) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }

}

