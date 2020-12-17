package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] arr = new ChessPiece[8][8];
        arr[0][0] = ChessPiece.ROOK_BLACK;
        arr[0][5] = ChessPiece.ROOK_BLACK;
        arr[0][6] = ChessPiece.KING_BLACK;
        arr[1][1] = ChessPiece.ROOK_WHITE;
        arr[1][4] = ChessPiece.PAWN_BLACK;
        arr[1][5] = ChessPiece.PAWN_BLACK;
        arr[1][7] = ChessPiece.PAWN_BLACK;
        arr[2][0] = ChessPiece.PAWN_BLACK;
        arr[2][6] = ChessPiece.PAWN_BLACK;
        arr[2][2] = ChessPiece.KNIGHT_BLACK;
        arr[3][0] = ChessPiece.QUEEN_BLACK;
        arr[3][3] = ChessPiece.BISHOP_WHITE;
        arr[4][3] = ChessPiece.BISHOP_BLACK;
        arr[4][4] = ChessPiece.PAWN_WHITE;
        arr[5][4] = ChessPiece.BISHOP_WHITE;
        arr[5][5] = ChessPiece.PAWN_WHITE;
        arr[6][0] = ChessPiece.PAWN_WHITE;
        arr[6][3] = ChessPiece.QUEEN_WHITE;
        arr[6][5] = ChessPiece.PAWN_WHITE;
        arr[6][7] = ChessPiece.PAWN_WHITE;
        arr[7][5] = ChessPiece.ROOK_WHITE;
        arr[7][6] = ChessPiece.KING_WHITE;
        ChessBoard chessBoard = new ChessBoard(arr);
        chessBoard.print();
    }
}
