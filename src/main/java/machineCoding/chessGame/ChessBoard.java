package machineCoding.chessGame;

class ChessBoard {
    Piece[][] board = new Piece[8][8];

    void initializeBoard() {
        // Add Pawns
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn("White");
            board[6][i] = new Pawn("Black");
        }
        // Add other pieces (Rooks, Knights, etc.)
    }

    boolean isPathClear(int startX, int startY, int endX, int endY) {
        // Check if all squares between start and end are empty
        // Implement logic based on the movement direction
    }

    boolean isEmpty(int x, int y) {
        return board[x][y] == null;
    }

    boolean isOpponentPiece(int x, int y, String color) {
        return board[x][y] != null && !board[x][y].color.equals(color);
    }

    void movePiece(int startX, int startY, int endX, int endY) {
        board[endX][endY] = board[startX][startY];
        board[startX][startY] = null;
    }
}

