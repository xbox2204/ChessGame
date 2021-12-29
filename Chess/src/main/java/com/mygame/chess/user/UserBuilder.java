package com.mygame.chess.user;

import com.mygame.chess.piece.Piece;

import java.util.HashSet;

public interface UserBuilder {
    User addName(String name);
    User addColor(String color);
    boolean isCheck();
    boolean isCheckMate();
}
