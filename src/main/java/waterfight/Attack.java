package waterfight;

public class Attack {
    private PlayingField field;
    private String[][] arr;
    private String name;

    public Attack(String name ,PlayingField field){
        this.name = name;
        this.field = field;
        arr = field.getMas();
    }

    public void att(int x, int y){
        if (arr[x][y] == "\uD83D\uDEE5"){
            arr[x][y] = "\uD83D\uDFE5";
            { if ((x + 1 <= 9) && arr[x + 1][y] == "\uD83D\uDEE5" ||((x + 1 <= 9) &&(x + 2 <= 9)) && arr[x + 1][y] == "\uD83D\uDFE5" && arr[x+2][y] == "\uD83D\uDEE5" ||
                    ((x + 1 <= 9) &&(x + 2 <= 9) && x + 3 <= 9) && arr[x + 1][y] == "\uD83D\uDFE5" && arr[x + 2][y] == "\uD83D\uDFE5" && arr[x + 3][y] == "\uD83D\uDEE5" ||
                    (x - 1 >= 0) && arr[x - 1][y] == "\uD83D\uDEE5" || (x - 1 >= 0 && x - 2 >= 0) && arr[x - 1][y] == "\uD83D\uDFE5" && arr[x-2][y] == "\uD83D\uDEE5" ||
                    (x - 1 >= 0 && x - 2 >= 0 && x - 3 >= 0) && arr[x - 1][y] == "\uD83D\uDFE5" && arr[x - 2][y] == "\uD83D\uDFE5" && arr[x - 3][y] == "\uD83D\uDEE5" ||
                    (y + 1 <= 9) && arr[x][y + 1] == "\uD83D\uDEE5" || ((y + 1 <= 9) &&(y + 2 <= 9)) && arr[x][y + 1] == "\uD83D\uDFE5" && arr[x][y+2] == "\uD83D\uDEE5" ||
                    ((y + 1 <= 9) &&(y + 2 <= 9) && y + 3 <= 9) && arr[x][y+1] == "\uD83D\uDFE5" && arr[x][y+2] == "\uD83D\uDFE5" && arr[x][y+3] == "\uD83D\uDEE5" ||
                    (y - 1 >= 0) &&arr[x][y-1] == "\uD83D\uDEE5" || (y - 1 >= 0 && y - 2 >= 0) && arr[x][y-1] == "\uD83D\uDFE5" && arr[x][y-2] == "\uD83D\uDEE5" ||
                    (y - 1 >= 0 && y - 2 >= 0 && y - 3 >= 0) && arr[x][y-1] == "\uD83D\uDFE5" && arr[x][y-2] == "\uD83D\uDFE5" && arr[x][y-3] == "\uD83D\uDEE5") {
                System.out.println("Попадание");
                System.out.println("Повторите ход!");
            }
            else {
                System.out.println("Утопил!");
                System.out.println("Повторите ход!");
            }
            }
        }
        else {

            System.out.println("Мимо!");
            System.out.println("Ход делает другой игрок");
        }

        field.setMas(arr);
        int a = 0;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                if (arr[i][j] == "\uD83D\uDEE5"){
                    a = 1;
                }
            }
        }
        if (a == 0){
            System.out.println("Игра закончена - " + name + " победил");
        }
    }


}
