package machineCoding.chessGame;

class Rook extends Piece {
    @Override
    boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
        // Horizontal or vertical movement
        if (startX == endX || startY == endY) {
            return board.isPathClear(startX, startY, endX, endY);
        }
        return false;
    }
}

