package week2;

public class text5 {
	public static void main(String[] args) {
	/*	1.��3λ����ˮ�ɻ���
	 * for (int number = 100; number < 1000; number++) {
			int bai, shi, ge;
			bai = number / 100;
			shi = number % 100 / 10;
			ge = number % 10;
			if (Math.pow(bai, 3) + Math.pow(shi, 3) + Math.pow(ge, 3) == number) {
				System.out.println(number);
			}
		}
	*/
		
	/*	2.��13-23+33-43+53+...+973-983=993-1003��ֵ
	 * int sum=0;
		int sign=1;
		for(int i=13;i<1003;i=i+10) {
			sum=sum+i*sign;
			sign=-1*sign;
		}
		System.out.println(sum);
	*/
		
	/*	3.��1��+2��+3��+...+20����ֵ
	 * int sum=0;
		for(int i=1;i<=20;i++) {
			int result=1;
			for(int j=1;j<=i;j++) {
				result=result*j;
			}
			sum=sum+result;
		}
		System.out.println(sum);
	*/
		
	// 4.����*��ɵ�ͼ��	
		System.out.println("ͼ��1��");
		for(int i=1;i<=5;i++) {
			//�������ɸ�(i)��*��������
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("ͼ��2��");
		for(int i=1;i<=5;i++) {
			//��������(i-5)�ո񣬲�����
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			//��������(i)��*��������
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("ͼ��3");
		for(int i=1;i<=5;i++) {
			//��������(5-i)���ո񣬲�����
			for(int j=1;j<=5-i;j++) {
				System.out.print(" ");
			}
			//��������(i)��*��*֮��Ӹ��ո񣬲�����
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	

}
