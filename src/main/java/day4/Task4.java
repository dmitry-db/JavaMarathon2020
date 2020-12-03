package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int max;
        int imax = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 10001);
        }
        max = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < arr.length - 2; i++){
            int s = arr[i] + arr[i + 1] + arr[i + 2];
            if (s > max){
                max = s;
                imax = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(max + "\n" + imax);
    }
}
