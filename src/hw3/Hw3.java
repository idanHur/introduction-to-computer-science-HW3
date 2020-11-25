// 318247822 Idan Hur
package hw3;

import java.util.Scanner;

public class Hw3 {
	
	public static void checkSudoku() {
		Sudoku game = new Sudoku();
		boolean ok = game.checkSudoku();
		if (!ok) {
			System.out.println("Not a valid Sudoku");
		}
		else {
			System.out.println("A valid Sudoku");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		
		System.out.printf("Enter your choice of exe \n1 - Sudoku \n2 - Dog Pension \n-1 - to exit ");
		choice = scan.nextInt();
		switch (choice) {
		case 1:
			checkSudoku();
			break;
		case 2:
			DogHouseTest.testDogPension();
			break;
		case -1:
			System.out.println("goodbye");
			break;
		}

	}

}
