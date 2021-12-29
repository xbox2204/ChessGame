package com.mygame.chess.piece;

public class Piece implements PieceBuilder{

    protected String color;
    protected String currPos;
    protected String name;

    protected boolean isAlive;

    public Piece() {
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Piece setAlive() {
        this.setAlive(true);
        return this;
    }

    public Piece kill() {
        this.setAlive(false);
        return this;
    }

    public String getColor() {
        return color;
    }

    @Override
    public Piece addColor(String color){this.color=color;return this;};

    @Override
    public Piece addCurrPosition(String currPos){this.currPos=currPos;return this;};

    @Override
    public Piece addName(String name){this.name=name; return this;}

    public boolean isValidMove(String curr, String dest){return false;}
}
