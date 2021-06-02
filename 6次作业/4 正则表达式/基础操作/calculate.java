package week10.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class calculate {
	public static void main(String[] args) {
		System.out.println("请输入一个加减乘除运算:");
		String regx = "\\d+.*\\d*[+\\-*/]\\d+.*\\d*";
		while (true) {
			Scanner scan = new Scanner(System.in);
			String express = scan.nextLine();
			Pattern p = Pattern.compile(regx);
			Matcher m = p.matcher(express);
			if (m.matches()) {
				// 2.分离出操作数
				// String array[]=express.split("[+\\-*/]"); //正则表达式
				String array[] = express.split("\\+|\\-|\\*|/");

				// 3.将字符串转化为数字
				double data1 = Double.parseDouble(array[0].trim());
				double data2 = Double.parseDouble(array[1].trim());

				// 4.对数字进行运算
				double result = 0;
				if (express.indexOf("+") != -1) {
					result = data1 + data2;
				}
				if (express.indexOf("-") != -1) {
					result = data1 - data2;
				}
				if (express.indexOf("*") != -1) {
					result = data1 * data2;
				}

				if (express.indexOf("/") != -1) {
					result = data1 / data2;
				}

				// 5.拼接输出结果
				String info = express + "=" + String.valueOf(result);

				// 6.输出
				System.out.println(info);
				break;
			} else {
				System.out.println("输入不合法!请重新输入:");
			}
		}
	}
}
