package week10.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class calculate {
	public static void main(String[] args) {
		System.out.println("������һ���Ӽ��˳�����:");
		String regx = "\\d+.*\\d*[+\\-*/]\\d+.*\\d*";
		while (true) {
			Scanner scan = new Scanner(System.in);
			String express = scan.nextLine();
			Pattern p = Pattern.compile(regx);
			Matcher m = p.matcher(express);
			if (m.matches()) {
				// 2.�����������
				// String array[]=express.split("[+\\-*/]"); //������ʽ
				String array[] = express.split("\\+|\\-|\\*|/");

				// 3.���ַ���ת��Ϊ����
				double data1 = Double.parseDouble(array[0].trim());
				double data2 = Double.parseDouble(array[1].trim());

				// 4.�����ֽ�������
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

				// 5.ƴ��������
				String info = express + "=" + String.valueOf(result);

				// 6.���
				System.out.println(info);
				break;
			} else {
				System.out.println("���벻�Ϸ�!����������:");
			}
		}
	}
}
