package week8;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		boolean passwordOk = false;
		boolean hasSpace = false;
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDight = false;
		// 1.显示提示信息
		System.out.println("请输入一个密码(长度8-16):");
		System.out.println("1.密码中不能有空格");
		System.out.println("2.密码中至少有一个小写字母和一个大写字母");
		System.out.println("3.密码中至少有一个数字");


		// 3.检查密码的长度
		while (!passwordOk) {
			
			Scanner scan = new Scanner(System.in);
			String password = scan.next();
			
			int len = password.length();
			
			if (len <8 || len > 16) {
				System.out.println("密码无效，长度不符合要求!请重新输入:");
			} else {
				// 4.如果长度有效
				// 5.从字符串中逐一取出每一个字符，进行相应的判断，将检查结果存起来
				for (int i = 0; i < len; i++) {
					char c = password.charAt(i);
					if (c == ' ') {
						hasSpace = true;
					}
					if (c >= 'A' && c <= 'Z') {
						hasUpper = true;
					}
					if (c >= 'a' && c <= 'z') {
						hasLower = true;
					}
					if (c >= '0' && c <= '9') {
						hasDight = true;
					}
				}

				// 6.根据保存的检查结果，做出判断(结论,错误描述)
				if (!hasSpace && hasUpper && hasLower && hasDight) {
					System.out.println("您的密码 " + password + " 符合要求");
					passwordOk=true;
				} else {
					System.out.println("您输入的密码" + password + "不符合要求，原因如下:");
					String info = "";
					if (hasSpace) {
						info = "密码中有空格\n";
					}
					if (!hasUpper) {
						info += "密码中没有大写字母\n";
					}
					if (!hasLower) {
						info += "密码中没有小写字母\n";
					}
					if (!hasDight) {
						info += "密码中没有数字\n";
					}
					System.out.println(info);
					System.out.println("请重新输入:");
				}
			}
		}

	}

}
