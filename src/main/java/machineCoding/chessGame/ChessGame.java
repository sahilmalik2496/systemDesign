package machineCoding.chessGame;

import machineCoding.cricketInfo.Player;

class ChessGame {
    ChessBoard board = new ChessBoard();
    Player[] players = new Player[2];
    Player currentPlayer;

    void startGame() {
        board.initializeBoard();
        players[0] = new Player("Player 1");
        players[1] = new Player("Player 2");
        currentPlayer = players[0];
    }

    void makeMove(int startX, int startY, int endX, int endY) {
        Piece piece = board.getPiece(startX, startY);
        if (piece.color.equals(currentPlayer.color)) {
            piece.move(startX, startY, endX, endY, board);
            switchPlayer();
        }
    }

    void switchPlayer() {
        currentPlayer = (currentPlayer == players[0]) ? players[1] : players[0];
    }
}
