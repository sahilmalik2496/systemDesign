package machineCoding.chessGame;

class Pawn extends Piece {
    public Pawn(String black) {
        super();
    }

    @Override
    boolean isValidMove(int startX, int startY, int endX, int endY, ChessBoard board) {
        if (color.equals("White")) {
            // Move forward
            if (startX == endX && endY == startY + 1 && board.isEmpty(endX, endY)) {
                return true;
            }
            // Capture diagonally
            if (Math.abs(endX - startX) == 1 && endY == startY + 1 && board.isOpponentPiece(endX, endY, color)) {
                return true;
            }
        } else {
            // Similar logic for Black
            if (startX == endX && endY == startY - 1 && board.isEmpty(endX, endY)) {
                return true;
            }
            if (Math.abs(endX - startX) == 1 && endY == startY - 1 && board.isOpponentPiece(endX, endY, color)) {
                return true;
            }
        }
        return false;
    }
}

