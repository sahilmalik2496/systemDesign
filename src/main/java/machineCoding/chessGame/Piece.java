package machineCoding.chessGame;

abstract class Piece {
    String color; // "White" or "Black"

    abstract boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board);

    void move(int startX, int startY, int endX, int endY, ChessBoard board) {
        if (isValidMove(startX, startY, endX, endY, board)) {
            board.movePiece(startX, startY, endX, endY);
        } else {
            throw new IllegalMoveException("Invalid move for " + this.getClass().getSimpleName());
        }
    }
}
