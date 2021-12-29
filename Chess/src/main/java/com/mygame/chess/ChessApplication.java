package com.mygame.chess;

import com.mygame.chess.board.Board;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class ChessApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(ChessApplication.class, args);
//	}

	public static void main(String args[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("!! WELCOME TO MY CHESS!!");
		boolean choice=true;
		while (choice){
			System.out.println("1. Start a new game");
			System.out.println("2. Resart the game(Pass it any time)");
			System.out.println("3. Quit the game(Pass it any time)");
			int opt=br.read();
			switch (opt){
				case 1:
					Board brd=new Board();

			}
		}
	}

}
