package week2;

import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		String choose;
		do {                                                         //do whileѭ���ṹ
			int randomNumber;
			randomNumber = 1 + (int) (Math.random() * 1000);         // ����һ��1-1000������� (math.random()����һ��0��1�������)

			System.out.println("I have a number between 1-1000.");
			System.out.println("Can you guess my number?");
			System.out.println("Please type your first guess.");

			Scanner scan = new Scanner(System.in);

			int myGuess;
			int times;

			for (times = 1; times <= 5; times++) {
				myGuess = scan.nextInt();

				if (myGuess == randomNumber) {
					System.out.println("Exelent!You guessed the number.");
					break;
				} else if (myGuess < randomNumber) {
					System.out.print("Too low.Try again. ");
				} else {
					System.out.print("Too high.Try again. ");
				}
				System.out.println("left " + (5 - times) + " times");
			}
			
			System.out.println("Would you like to paly agian?(y/n)");
			
			Scanner scan1 = new Scanner(System.in);
			choose = scan1.nextLine();
		} while (choose.equals("y"));                             //����String������Ƕ����޷�ʹ����������бȽϣ�ʹ��equals���бȽ�

		System.out.println("Game Over!");
	}

}
