package day4;



public class Task3 {
    public static void main(String[] args) {
        int imax = 0;
        int max = 0;
        int[][] arr = new int[12][8];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int) (Math.random() * 51);
            }
        }

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        for (int j = 0; j < arr[0].length; j++){
            max += arr[0][j];
        }

        for (int i = 0; i <arr.length; i++){
            int n = 0;
            for (int j = 0; j < arr[i].length; j++){
                n += arr[i][j];
            }
            if (n >= max){
                max = n;
                imax = i;
            }
        }

        System.out.println("Индекс строки с наибольшей суммой = " + imax);
    }
}
