package week2;

import java.util.Scanner;

public class text2 {
	public static void main(String[] args) {

		int randomNumber;
		int myGuess = 0;
		randomNumber = 1 + (int) (Math.random() * 1000);            // ����һ��1-1000�������

		System.out.println("I have a number between 1-1000.");
		System.out.println("Can you guess my number?");
		System.out.println("Please type your first guess.");

		Scanner scan = new Scanner(System.in);

		while (myGuess != randomNumber) {                           // whileѭ��

			myGuess = scan.nextInt();

			if (myGuess == randomNumber) {
				System.out.println("Exelent!You guessed the number.");
				break;
			} else if (myGuess < randomNumber) {
				System.out.println("Too low.Try again.");
			} else {
				System.out.println("Too high.Try again.");
			}
		}

		System.out.println("Game Over!");
	}

}
