package week8;

import java.util.Scanner;

public class StringSplit {
	public static void main(String[] args) {
		/*
		 * //String ��split���� Scanner scan =new Scanner(System.in);
		 * System.out.println("������ѧ��������Ϣ,��ʽ����:ѧ�ţ��������Ա𣬳�������"); String data =scan.next();
		 * String array[]=data.split("��|,"); String id=array[0]; String name=array[1];
		 * String gender=array[2]; String brith=array[3];
		 * 
		 * Student stu=new Student(id,name,gender,brith);
		 * System.out.println(stu.toString());
		 */

		// �ַ�������
		// 1.����Ϸ�������ʽ
		Scanner scan = new Scanner(System.in);
		String express = scan.nextLine();
		// 2.�����������
		//String array[]=express.split("[+\\-*/]");          //������ʽ
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
	}
}
