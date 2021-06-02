package week10.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class operate {
	public static void main(String[] args) {

		// 1.输入合法运算表达式
		String rexgxMobile = "(\\w{3}|\\w{8})[(]\\d+[,].*[)]";
		System.out.println("请输入运算规则:");
		while (true) {
			Scanner scan = new Scanner(System.in);
			String express = scan.nextLine();
			Pattern p = Pattern.compile(rexgxMobile);
			Matcher m = p.matcher(express);
			if (m.matches()) {
				String info = express + "=" + String.valueOf(calculate(express));
				System.out.println(info);
				break;
			} else {
				System.out.println("输入不合法，请重新输入:");
			}
		}

	}

	public static double calculate(String exp) {

		String rexgxMobile = "(\\w{3}|\\w{8})[(]\\d+[,].*[)]";
		Pattern p = Pattern.compile(rexgxMobile);
		Matcher m = p.matcher(exp);
		if (m.matches()) {
			String express = exp;
			// 2.找出(位置
			int pos1 = express.indexOf("(");
			// 3.取出运算字符串，如add
			String operateCode = express.substring(0, pos1); // 子串包含开始位置,不包含结束位置的字符

			// 4.如果运算符是doubleMe，则只需要取一个数,只需要查找)的位置
			int pos2, pos3;
			double number = 0, number1 = 0, number2 = 0;
			if (operateCode.equals("doubleMe")) {
				pos3 = express.lastIndexOf(")");
				String operateNumber = express.substring(pos1 + 1, pos3);
				m = p.matcher(operateNumber);
				if (m.matches()) {
					number = calculate(operateNumber);
				} else {
					number = Double.parseDouble(operateNumber);
				}
			}

			// 5.否则需要获取两个数，查找,和)的位置
			else {
				pos2 = express.indexOf(",");
				pos3 = express.lastIndexOf(")");
				String operateNumber1 = express.substring(pos1 + 1, pos2);
				String operateNumber2 = express.substring(pos2 + 1, pos3);

				// 6.将数转换为数字
				number1 = Double.parseDouble(operateNumber1);
				m = p.matcher(operateNumber2);
				if (m.matches()) {
					number2 = calculate(operateNumber2);
				} else {
					number2 = Double.parseDouble(operateNumber2);
				}
			}

			// 7.根据运算符号做相应的运算
			double result = 0;
			switch (operateCode) {
			case "add":
				result = number1 + number2;
				break;
			case "sub":
				result = number1 - number2;
				break;
			case "max":
				result = number1 > number2 ? number1 : number2;
				break;
			case "min":
				result = number1 < number2 ? number1 : number2;
				break;
			case "doubleMe":
				result = number * 2;
				break;
			default:
				System.out.println("暂不支持");
			}
			return result;
		} else {
			return 0;
		}
	}
}
