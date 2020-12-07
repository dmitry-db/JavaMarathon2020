package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("");
        long start = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++){
            s.append(i + " ");
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = (finish - start);
        System.out.println(s);
        System.out.println(timeConsumedMillis);
    }
}
