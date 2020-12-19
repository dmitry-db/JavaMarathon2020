package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers, numbers.length));
    }

    public static int recursionSum(int[] s, int size) {
        if (size > 0){
            return s[size - 1] + recursionSum(s, size - 1);
        }
        return 0;
    }
}
