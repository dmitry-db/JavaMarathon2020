package day2;
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int q = a + 1;

        if (a >= b){
            System.out.println("Некорректный ввод");
        }
        else {
            while (q < b){
                if (q % 5 ==0 && q % 10 != 0){
                    System.out.print(q + " ");
                }
                q++;
            }
        }
    }
}
