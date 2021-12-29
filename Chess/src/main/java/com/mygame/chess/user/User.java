package com.mygame.chess.user;

public class User implements UserBuilder{
    String name;
    String color;

    private boolean check;
    private boolean checkMate;

    public User() {
    }

    public User(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public User addName(String name) {
        return this;
    }

    @Override
    public User addColor(String color) {
        return this;
    }

    @Override
    public boolean isCheck() {
        return this.check;
    }

    @Override
    public boolean isCheckMate() {
        return this.checkMate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public void setCheckMate(boolean checkMate) {
        this.checkMate = checkMate;
    }
}
