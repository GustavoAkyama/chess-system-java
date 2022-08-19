package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;

public class Program {
    public static void main(String[] args) {

        ChessMatch chassMatch = new ChessMatch();
        UI.printBoard(chassMatch.getPieces());

    }
}