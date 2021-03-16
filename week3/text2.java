package week3;

import java.util.Scanner;

//使用全局变量，方法里面没有参数
public class text2 {

	public static double score[];

	public static void main(String[] args) {
		int choose = menu();
		while (choose != 5) {
			switch (choose) {
			case 1:
				enterResult();
				break;
			case 2:
				if (score == null) {
					System.out.println("please input score frist!");
					break;
				}
				System.out.println("Class average is :" + getAverage());
				break;
			case 3:
				if (score == null) {
					System.out.println("please input score frist!");
					break;
				}
				System.out.println("The highest grade is :" + getHighestGrade());
				break;
			case 4:
				if (score == null) {
					System.out.println("please input score frist!");
					break;
				}
				System.out.println("The lowset grade is : " + getLowestGrade());
				break;
			default:
				System.out.println("input choice is invalid,please input again!");
			}
			choose = menu();
		}
		System.out.println("Exit. Welcom to use again!");
	}

	// 菜单的显示，返回用户选择（1-5）
	public static int menu() {
		int choice = 0;
		System.out.println("1.Enter Score");
		System.out.println("2.Average");
		System.out.println("3.Highest Grade");
		System.out.println("4.Lowest Grade");
		System.out.println("5.Exit");
		
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}
	
	//输入成绩
	public static void enterResult() {
		score = new double[5];
		Scanner scan = new Scanner(System.in);
		int i = 0;
		while (i < score.length) {
			System.out.println("please input " + (i + 1) + " student score:");
			score[i] = scan.nextDouble();
			if (score[i] >= 0 && score[i] <= 100) {
				i++;
			} else {
				System.out.println("input score is invalid! Please input again!");
			}

		}

	}
	
	//计算平均成绩
	public static double getAverage() {

		double average = 0;
		double sum = 0;

		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}

		average = sum / score.length;
		return average;

	}
	
	//计算最高分
	public static double getHighestGrade() {
		double HighestGrade = 0;
		double max = score[0];

		for (int i = 1; i < score.length; i++) {
			if (score[i] >= max) {
				max = score[i];
			}
		}

		HighestGrade = max;
		return HighestGrade;

	}
	
	//计算最低分
	public static double getLowestGrade() {
		double LowestGrade = 0;
		double min = score[0];

		for (int i = 1; i < score.length; i++) {
			if (score[i] <= min) {
				min = score[i];
			}
		}

		LowestGrade = min;
		return LowestGrade;

	}

}
