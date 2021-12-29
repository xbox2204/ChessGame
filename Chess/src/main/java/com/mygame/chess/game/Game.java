package com.mygame.chess.game;

import com.mygame.chess.board.Board;
import com.mygame.chess.user.User;

public class Game {
    private Board brd;
    private User userWhite;
    private User userBlack;

    public Game(String name1,String name2){
      this.brd=new  Board();
      userWhite.addColor("white").addName(name1);
      userBlack.addName(name2).addColor("black");
    }

    public void quit(){
      this.brd=null;
        userWhite= null;
        userBlack=null;
    }

    public void restart(){
        this.brd=null;
        this.brd=new Board();;
    }

    public String isFinished(){
        if(userBlack.isCheckMate()) return userWhite.getName()+"WON!!!";
        else if(userWhite.isCheckMate()) return userBlack.getName()+"WON!!!";

        return "GAME IS NOT YET FINISHED, KEEP PLAYING";
    }

}
