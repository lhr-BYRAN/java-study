package week3;

import java.util.Scanner;

//没有使用全局变量，将score作为参数传给方法
public class homework1 {
	public static void main(String[] args) {
		double score[] = null;
		score = new double[5];

		boolean flag = false; // 用来判断是否输入了score

		int choose = menu();
		while (choose != 6) {
			switch (choose) {
			case 1:
				enterResult(score);
				flag = true;
				break;
			case 2:
				if (flag == false) {
					System.out.println("please input score frist!");
					break;
				}
				System.out.println("Class average is :" + getAverage(score));
				break;
			case 3:
				if (flag == false) {
					System.out.println("please input score frist!");
					break;
				}
				System.out.println("The highest grade is :" + getHighestGrade(score));
				break;
			case 4:
				if (flag == false) {
					System.out.println("please input score frist!");
					break;
				}
				System.out.println("The lowset grade is : " + getLowestGrade(score));
				break;
			case 5:
				if (flag == false) {
					System.out.println("please input score frist!");
					break;
				}
				putOut(score);
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
		System.out.println("5.putout all score");
		System.out.println("6.Exit");

		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	// 输入成绩
	public static void enterResult(double score[]) {
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

	// 计算平均成绩
	public static double getAverage(double score[]) {

		double average = 0;
		double sum = 0;

		for (int i = 0; i < score.length; i++) {
			sum = sum + score[i];
		}

		average = sum / score.length;
		return average;

	}

	// 计算最高分
	public static double getHighestGrade(double score[]) {
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

	// 计算最低分
	public static double getLowestGrade(double score[]) {
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

	// 按从大到小输出成绩
	public static void putOut(double score[]) {
		double num;
		for (int i = 0; i < score.length; i++) {
			for (int j = 1; j < score.length; j++) {
				if (score[j - 1] < score[j]) {
					num = score[j - 1];
					score[j - 1] = score[j];
					score[j] = num;
				}
			}
		}
		System.out.println("Students' grades :");
		for (double d : score) {
			System.out.print(d + " ");
		}

		System.out.println();

	}

	private static int grade(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
