package week8;

import java.util.Scanner;

public class StringSplit {
	public static void main(String[] args) {
		/*
		 * //String 的split操作 Scanner scan =new Scanner(System.in);
		 * System.out.println("请输入学生基本信息,格式如下:学号，姓名，性别，出生日期"); String data =scan.next();
		 * String array[]=data.split("，|,"); String id=array[0]; String name=array[1];
		 * String gender=array[2]; String brith=array[3];
		 * 
		 * Student stu=new Student(id,name,gender,brith);
		 * System.out.println(stu.toString());
		 */

		// 字符串运算
		// 1.输入合法运算表达式
		Scanner scan = new Scanner(System.in);
		String express = scan.nextLine();
		// 2.分离出操作数
		//String array[]=express.split("[+\\-*/]");          //正则表达式
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
	}
}
