package com.mygame.chess.piece;

public class Queen extends Piece {

    @Override
    public boolean isValidMove(String curr, String dest) {
        int src= Integer.valueOf(curr);
        int dst=Integer.valueOf(dest);

        int srcR=Integer.valueOf(curr.charAt(0));
        int srcC=Integer.valueOf(curr.charAt(1));

        int dR=Integer.valueOf(dest.charAt(0));
        int dC=Integer.valueOf(dest.charAt(1));

        if(srcC>=0 && srcC<8 && dC>=0 && dC<8  && srcR>=0 && srcR<8 && dR>=0 && dR<8){

            int hAdvance = java.lang.Math.abs(dR-srcR);
            int vAdvance = java.lang.Math.abs(dC-srcC);
            if(hAdvance==vAdvance){
                return true;
            }
            if((java.lang.Math.abs(dR-srcR)<=7 && java.lang.Math.abs(dC-srcC)==0) || (java.lang.Math.abs(dR-srcR)==0 && java.lang.Math.abs(dC-srcC)<=7)){
                return true;
            }
        }
        return false;
    }
}
