package week2;

import java.util.Scanner;

public class text1 {
	public static void main(String[] args) {

		int randomNumber;
		randomNumber = 1 + (int) (Math.random() * 1000);        // ����һ��1-1000�������

		System.out.println("I have a number between 1-1000.");
		System.out.println("Can you guess my number?");
		System.out.println("Please type your first guess.");

		Scanner scan = new Scanner(System.in);

		int myGuess = scan.nextInt();

		if (myGuess == randomNumber) {                         //if else ��֧�ṹ
			System.out.println("Exelent!You guessed the number.");
		} else {
			System.out.println("Game Over!");
		}
	}

}
