package week2;

import java.util.Scanner;

public class homework2 {                          //�� 3-7λ����ˮ�ɻ�
	public static void main(String[] args) {
		int n;
		System.out.println("������ˮ�ɻ�����λ�� n(3-7):");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		System.out.println(n+"λ����ˮ�ɻ����У�");
		for(int number=(int) Math.pow(10, n-1);number<Math.pow(10, n);number++) {
			int wei;                              //����һ��wei����¼ÿ��λ������ֵ
			int sum=0;                            //����һ��sum�������жϽ���Ƿ�Ϊˮ�ɻ���
			int data=number;
			while(data!=0) {
				wei=data%10;
				sum=(int) (sum+Math.pow(wei, n));
				data=data/10;				
			}
			if(number==sum) {
				System.out.print(number+" ");
			}
		}
	}
	
}
