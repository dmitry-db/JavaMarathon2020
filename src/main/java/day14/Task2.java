package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");

        try {
            System.out.println(parseFileToStringList(file));
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }


    }
    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        List<String> list= new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while (true) {
            String s = scanner.nextLine();
            if (s.equals("")){
                break;
            }
            String[] arr = s.split(" ");
            int m = Integer.parseInt(arr[1]);
            if (m < 0){
                try{
                    throw new ArithmeticException();
                }
                catch (ArithmeticException e){
                    System.out.println("Некорректный входной файл");
                    return null;
                }
            }
            else {
                list.add(s);
            }
        }
        return list;
    }
}
