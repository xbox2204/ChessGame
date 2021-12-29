package com.mygame.chess.piece;

import com.mygame.chess.board.Board;

public class Pawn extends Piece{

    @Override
    public boolean isValidMove(String curr, String dest) {
        int src= Integer.valueOf(curr);
        int dst=Integer.valueOf(dest);

        int srcR=Integer.valueOf(curr.charAt(0));
        int srcC=Integer.valueOf(curr.charAt(1));

        int dR=Integer.valueOf(dest.charAt(0));
        int dC=Integer.valueOf(dest.charAt(1));

        if(srcC>=0 && srcC<8 && dC>=0 && dC<8  && srcR>=0 && srcR<8 && dR>=0 && dR<8){
            if("black".equalsIgnoreCase(this.getColor())){
                if(( dR-srcR==-1 && dC-srcC==0) ){
                    return true;
                }
                if ( dR-srcR==-1 && dC-srcC==-1){
                   if(Board.brd[dR][dC].getPiece()!=null){
                       return true;
                   }
                }
            } else if("white".equalsIgnoreCase(this.getColor())){
                if(( dR-srcR==1 && dC-srcC==0) ){
                    return true;
                }
                if ( dR-srcR==1 && dC-srcC==1){
                    if(Board.brd[dR][dC].getPiece()!=null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
