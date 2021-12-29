package com.mygame.chess.piece;

public interface  PieceBuilder {
    Piece addColor(String color);
    Piece addCurrPosition(String currPos);
    Piece addName(String name);
    Piece setAlive();
    Piece kill();
}
