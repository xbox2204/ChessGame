package com.mygame.chess.board;

import com.mygame.chess.piece.*;

public class Board {
      public static Spot[][] brd=new Spot[8][8];
      public Board(){
      for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                  brd[i][j]=new Spot();
                  brd[i][j].sethIndex(i);
                  brd[i][j].setvIndex(j);
                  brd[i][j].setPiece(null);
            }
        }
            buildWhiteSide(brd);
            buildBlackSide(brd);
      }

      public void buildWhiteSide(Spot[][] brd) {
            Piece whiteKnight1  = new Knight().addColor("white").addCurrPosition("01").addName("White Knight").setAlive();
            Piece whiteRook1  = new Rook().addColor("white").addCurrPosition("00").addName("White Rook").setAlive();
            Piece whiteBishop1  = new Bishop().addColor("white").addCurrPosition("02").addName("White Bishop").setAlive();
            Piece whiteQueen  = new Queen().addColor("white").addCurrPosition("03").addName("White Queen").setAlive();
            Piece whiteKing  = new King().addColor("white").addCurrPosition("04").addName("White King").setAlive();
            Piece whiteKnight2  = new Knight().addColor("white").addCurrPosition("06").addName("White Knight").setAlive();
            Piece whiteRook2  = new Rook().addColor("white").addCurrPosition("07").addName("White Rook").setAlive();
            Piece whiteBishop2  = new Bishop().addColor("white").addCurrPosition("05").addName("White Bishop").setAlive();

            brd[0][1].setPiece(whiteKnight1);
            brd[0][2].setPiece(whiteBishop1);
            brd[0][3].setPiece(whiteQueen);
            brd[0][4].setPiece(whiteKing);
            brd[0][5].setPiece(whiteBishop2);
            brd[0][6].setPiece(whiteKnight2);
            brd[0][7].setPiece(whiteRook2);
            brd[0][0].setPiece(whiteRook1);
            addWhitePawns(brd);
      }

      public void buildBlackSide(Spot[][] brd) {
            Piece whiteKnight1  = new Knight().addColor("black").addCurrPosition("71").addName("Black Knight").setAlive();
            Piece whiteRook1  = new Rook().addColor("black").addCurrPosition("70").addName("Black Rook").setAlive();
            Piece whiteBishop1  = new Bishop().addColor("black").addCurrPosition("72").addName("Black Bishop").setAlive();
            Piece whiteQueen  = new Queen().addColor("black").addCurrPosition("73").addName("Black Queen").setAlive();
            Piece whiteKing  = new King().addColor("black").addCurrPosition("74").addName("Black King").setAlive();
            Piece whiteKnight2  = new Knight().addColor("black").addCurrPosition("76").addName("Black Knight").setAlive();
            Piece whiteRook2  = new King().addColor("black").addCurrPosition("77").addName("Black Rook").setAlive();
            Piece whiteBishop2  = new Bishop().addColor("black").addCurrPosition("75").addName("Black Bishop").setAlive();

            brd[7][1].setPiece(whiteKnight1);
            brd[7][2].setPiece(whiteBishop1);
            brd[7][3].setPiece(whiteQueen);
            brd[7][4].setPiece(whiteKing);
            brd[7][5].setPiece(whiteBishop2);
            brd[7][6].setPiece(whiteKnight2);
            brd[7][7].setPiece(whiteRook2);
            brd[7][0].setPiece(whiteRook1);
            addBlackPawns(brd);
      }

      public void addBlackPawns(Spot[][] brd) {
            Piece blackPawn0  = new Pawn().addColor("black").addCurrPosition("60").addName("Black Bishop").setAlive();
            Piece blackPawn1  = new Pawn().addColor("black").addCurrPosition("61").addName("Black Bishop").setAlive();
            Piece blackPawn2  = new Pawn().addColor("black").addCurrPosition("62").addName("Black Bishop").setAlive();
            Piece blackPawn3  = new Pawn().addColor("black").addCurrPosition("63").addName("Black Bishop").setAlive();
            Piece blackPawn4  = new Pawn().addColor("black").addCurrPosition("64").addName("Black Bishop").setAlive();
            Piece blackPawn5  = new Pawn().addColor("black").addCurrPosition("65").addName("Black Bishop").setAlive();
            Piece blackPawn6  = new Pawn().addColor("black").addCurrPosition("66").addName("Black Bishop").setAlive();
            Piece blackPawn7  = new Pawn().addColor("black").addCurrPosition("67").addName("Black Bishop").setAlive();
            brd[6][0].setPiece(blackPawn0);
            brd[6][1].setPiece(blackPawn1);
            brd[6][2].setPiece(blackPawn2);
            brd[6][3].setPiece(blackPawn3);
            brd[6][4].setPiece(blackPawn4);
            brd[6][5].setPiece(blackPawn5);
            brd[6][6].setPiece(blackPawn6);
            brd[6][7].setPiece(blackPawn7);
      }

      public void addWhitePawns(Spot[][] brd) {
            Piece whitePawn0  = new Pawn().addColor("black").addCurrPosition("10").addName("Black Bishop").setAlive();
            Piece whitePawn1  = new Pawn().addColor("black").addCurrPosition("11").addName("Black Bishop").setAlive();
            Piece whitePawn2  = new Pawn().addColor("black").addCurrPosition("12").addName("Black Bishop").setAlive();
            Piece whitePawn3  = new Pawn().addColor("black").addCurrPosition("13").addName("Black Bishop").setAlive();
            Piece whitePawn4  = new Pawn().addColor("black").addCurrPosition("14").addName("Black Bishop").setAlive();
            Piece whitePawn5  = new Pawn().addColor("black").addCurrPosition("15").addName("Black Bishop").setAlive();
            Piece whitePawn6  = new Pawn().addColor("black").addCurrPosition("16").addName("Black Bishop").setAlive();
            Piece whitePawn7  = new Pawn().addColor("black").addCurrPosition("17").addName("Black Bishop").setAlive();
            brd[1][0].setPiece(whitePawn0);
            brd[1][1].setPiece(whitePawn1);
            brd[1][2].setPiece(whitePawn2);
            brd[1][3].setPiece(whitePawn3);
            brd[1][4].setPiece(whitePawn4);
            brd[1][5].setPiece(whitePawn5);
            brd[1][6].setPiece(whitePawn6);
            brd[1][7].setPiece(whitePawn7);
      }
}
