// 318247822 Idan Hur
package hw3;

import java.util.Scanner;

public class Sudoku {
	Scanner scan = new Scanner(System.in);
	int [][] myGame;
	
	public Sudoku () {
		
		int boardSize = 0;
		double root;
		boolean isBoard = false;
		int rootInInt;
		
		while (!isBoard) {	
		System.out.println("please enter the size of the sudoku board: ");
		boardSize = scan.nextInt();
		root = Math.sqrt(boardSize);
		rootInInt = (int) root;
		if (boardSize < 1) {
			System.out.println("please enter a board size that is bigger then 0");
		}
		if (rootInInt == root) {
			myGame = new int[boardSize][boardSize];
			isBoard = true;
		}
		else {
			System.out.println("the board size has to be a root of an intiger");
		}
		}
		System.out.printf("A board in the size: %d was created \n", boardSize);
		initialSudokuMatrix(boardSize);
		if (checkSudoku()) {
			System.out.println("you made a sudoku board!");
			printSudoku();
		}
		else {
			System.out.println("your sudoku board isnt good!");
		}
		
			
	}
	
	public void initialSudokuMatrix (int boardSize) {
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				System.out.printf("\nplease enter the number in the (%d,%d) location: ",(i+1),(j+1));
				myGame[i][j] = scan.nextInt();
			}
		}
	}
	private boolean isValidSodukoRow(int indexRow) {
		boolean[] cheack = new boolean[myGame.length +1];
		for (int i = 0; i < cheack.length; i++) {
			cheack[i] = false;
		}
		for (int i = 0; i < myGame.length; i++) {
			if (cheack[myGame[indexRow][i]]) {
				return false;
			}
			else {
				cheack[myGame[indexRow][i]] = true;
			}
		}
		return true;
	}
	private boolean isValidSodukoCol(int indexCol) {
		boolean[] cheack = new boolean[myGame.length +1];
		for (int i = 0; i < cheack.length; i++) {
			cheack[i] = false;
		}
		for (int i = 0; i < myGame.length; i++) {
			if (cheack[myGame[i][indexCol]]) {
				return false;
			}
			else {
				cheack[myGame[i][indexCol]] = true;
			}
		}
		return true;
	}
	private boolean isValidSodukoQuadrant(int Qr, int Qc) {
		boolean[] cheack = new boolean[myGame.length +1];
		int row;
		int col;
		int root;
		for (int i = 0; i < cheack.length; i++) {
			cheack[i] = false;
		}
		root = (int) Math.sqrt(myGame.length);
		row = Qr * root;
		col = Qc * root;
		
		for (int i = row ; i < (row+root); i++) {
			for (int j = col; j < (col+root); j++) {
				if (cheack[myGame[i][j]]) {
					return false;
				}
				else {
					cheack[myGame[i][j]] = true;
				}
			}
		}
		return true;
	}
	private boolean cheakNum() {
		for (int i = 0; i < myGame.length; i++) {
			for (int j = 0; j < myGame.length; j++) {
				if (myGame[i][j]<0 && myGame[i][j]>(myGame.length)) {
					return false;
				} 
			}
		}
		return true;
	}
	public boolean checkSudoku() {
		int root = (int)Math.sqrt(myGame.length);
		if (!cheakNum()) {
			return false;
		}
		for (int i = 0; i < myGame.length; i++) {
			if (!isValidSodukoCol(i)) {
				return false;
			}
			if (!isValidSodukoRow(i)) {
				return false;
			}
		}
		for (int i = 0; i < root; i++) {
			for (int j = 0; j < root; j++) {
				if (!isValidSodukoQuadrant(i, j)) {
					return false;
				}
			}
		}
		return true;
	}
	private void printSudoku() {
		for (int i = 0; i < myGame.length; i++) {
			for (int j = 0; j < myGame.length; j++) {
				System.out.print(myGame[i][j]+ " ");
			}
			System.out.println();
			
		}
	}

}
