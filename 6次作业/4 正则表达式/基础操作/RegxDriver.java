package week10.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxDriver {
	/*
	 * ������ʽ
	 * 
	 * 1.�ֻ����루�ƶ����룩 "1[3578]\d{9}"
	 * 
	 * 2.�̶����루������ ����-7λ��8λ������ ����Ϊ3��4λ���֣���λ������0 "(0\d{2,3}-?)?[1-9]\d{6,7}"
	 * 
	 * 
	 * 3.�����ַ 3���� �˺�@���� "\w+@\w+(.\w+)+"  \\w+@\\w+(.\\w+)+
	 */
	public static void main(String[] args) {
		// String rexgxMobile="(0\\d{2,3}-?)?[1-9]\\d{6,7}"; //�̶�����
		// String rexgxMobile="1[3578]\\d{9}"; //�ֻ�����
		String rexgxMobile = "(\\w{3}|\\w{8})[(]\\d+[,].*[)]";// �����ַ
		System.out.println("�����������:");
		while (true) {
			Scanner scan = new Scanner(System.in);
			String phone = scan.nextLine();
			/*
			 * if(Pattern.compile(rexgxMobile).matcher(phone).matches()) {
			 * System.out.println("����Ϸ�"); }else { System.out.println("���Ϸ�"); }
			 */
			Pattern p = Pattern.compile(rexgxMobile);
			Matcher m = p.matcher(phone);
			if (m.matches()) {
				System.out.println("����Ϸ�!");
				break;
			} else {
				System.out.println("���Ϸ�,����������:");
			}
		}
	}
	

}
