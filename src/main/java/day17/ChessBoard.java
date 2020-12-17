package day17;

public class ChessBoard {
    private ChessPiece[][] mas;

    public ChessBoard(ChessPiece[][] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] == null){
                    arr[i][j] = ChessPiece.EMPTY;
                }
            }
        }
        mas = arr;
    }

    public void print(){
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j].getName());
            }
            System.out.println();
        }
    }
}
