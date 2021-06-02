package week10.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxDriver {
	/*
	 * 正则表达式
	 * 
	 * 1.手机号码（移动号码） "1[3578]\d{9}"
	 * 
	 * 2.固定号码（座机） 区号-7位到8位的数字 区号为3到4位数字，首位必须是0 "(0\d{2,3}-?)?[1-9]\d{6,7}"
	 * 
	 * 
	 * 3.邮箱地址 3部分 账号@域名 "\w+@\w+(.\w+)+"  \\w+@\\w+(.\\w+)+
	 */
	public static void main(String[] args) {
		// String rexgxMobile="(0\\d{2,3}-?)?[1-9]\\d{6,7}"; //固定号码
		// String rexgxMobile="1[3578]\\d{9}"; //手机号码
		String rexgxMobile = "(\\w{3}|\\w{8})[(]\\d+[,].*[)]";// 邮箱地址
		System.out.println("请输入邮箱号:");
		while (true) {
			Scanner scan = new Scanner(System.in);
			String phone = scan.nextLine();
			/*
			 * if(Pattern.compile(rexgxMobile).matcher(phone).matches()) {
			 * System.out.println("输入合法"); }else { System.out.println("不合法"); }
			 */
			Pattern p = Pattern.compile(rexgxMobile);
			Matcher m = p.matcher(phone);
			if (m.matches()) {
				System.out.println("输入合法!");
				break;
			} else {
				System.out.println("不合法,请重新输入:");
			}
		}
	}
	

}
