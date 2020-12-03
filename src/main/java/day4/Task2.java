package day4;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[100];


        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10001);
        }

        int min = arr[0], max = arr[0], sum0 = 0, klv0 = 0;

        for (int x: arr){
            if (x < min){
                min = x;
            }
            if (x > max){
                max = x;
            }
            if (x % 10 == 0){
                klv0++;
                sum0 += x;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("количество оканчивающихся на ноль = " + klv0);
        System.out.println("суммы оканчивающихся на ноль = " + sum0);
    }
}
