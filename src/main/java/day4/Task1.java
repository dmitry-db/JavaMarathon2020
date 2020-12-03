package day4;

import java.util.Scanner;

import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int b8 = 0, r1 = 0, ch = 0, sum = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
            if (arr[i] > 8){
                b8++;
            }
            if (arr[i] == 1){
                r1++;
            }
            if (arr[i] % 2 == 0){
                ch++;
            }
        }
        System.out.println("Длина массива: " + n);
        System.out.println("Количество чисел больше 8: " + b8);
        System.out.println("Количество чисел равных 1: " + r1);
        System.out.println("Количество четных чисел: " + ch);
        System.out.println("Количество нечетных чисел: " + (n - ch));
        System.out.println("Сумма всех элементов массива: " + sum);

    }
}
