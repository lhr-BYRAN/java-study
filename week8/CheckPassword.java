package week8;

import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
		boolean passwordOk = false;
		boolean hasSpace = false;
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDight = false;
		// 1.��ʾ��ʾ��Ϣ
		System.out.println("������һ������(����8-16):");
		System.out.println("1.�����в����пո�");
		System.out.println("2.������������һ��Сд��ĸ��һ����д��ĸ");
		System.out.println("3.������������һ������");


		// 3.�������ĳ���
		while (!passwordOk) {
			
			Scanner scan = new Scanner(System.in);
			String password = scan.next();
			
			int len = password.length();
			
			if (len <8 || len > 16) {
				System.out.println("������Ч�����Ȳ�����Ҫ��!����������:");
			} else {
				// 4.���������Ч
				// 5.���ַ�������һȡ��ÿһ���ַ���������Ӧ���жϣ��������������
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

				// 6.���ݱ���ļ�����������ж�(����,��������)
				if (!hasSpace && hasUpper && hasLower && hasDight) {
					System.out.println("�������� " + password + " ����Ҫ��");
					passwordOk=true;
				} else {
					System.out.println("�����������" + password + "������Ҫ��ԭ������:");
					String info = "";
					if (hasSpace) {
						info = "�������пո�\n";
					}
					if (!hasUpper) {
						info += "������û�д�д��ĸ\n";
					}
					if (!hasLower) {
						info += "������û��Сд��ĸ\n";
					}
					if (!hasDight) {
						info += "������û������\n";
					}
					System.out.println(info);
					System.out.println("����������:");
				}
			}
		}

	}

}
