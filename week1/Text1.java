package week1;

import java.util.Scanner;

public class Text1 {
	//�����ɸ��������
	//�÷����ǳ���ִ�����
	public static void main(String args[]) {
		//1.�������������������Ӧ���������ͣ�������ȡ�շ���������
		String songTitle;
		float songPrice;
		int number;
		
		float totalRevence;
		float siteTecence;
		float manageRevence;
		float siteRate;
		float manageRate;
		
		//2.Ϊ������ֵ��Ӳ���븳ֵ���߽���ʽ���룩
		//�ӱ�׼�����豸�����̣�����һ��������󣬴Ӽ��������������ʹ�ö���
		//��������ǰ��Ӧ����������ʾ
		//�����ȡ�ķ���
		//float���͵ĳ�����ֵ����Ҫ��f��׺
		
		siteRate=0.03f;
		manageRate=0.12f;
		
		System.out.println("������������ƣ�");
		//����ʱ�ɲ�ȡ��ݼ�syso��Ȼ����alt+/
		Scanner scan=new Scanner(System.in);	
		songTitle=scan.nextLine();
		System.out.println("�����뵥�ۣ�");
		songPrice=scan.nextFloat();
		System.out.println("������������");
		number=scan.nextInt();
		
		//3.���㴦��
		totalRevence=songPrice*number;
		siteTecence=totalRevence*siteRate;
		manageRevence=totalRevence*manageRate;
		
		
		//4.��������ȡ���ǿ���̨��������ڿ������ļ������ݿ⣬����ȵȣ�
		System.out.println("������:"+totalRevence);
		System.out.println("��������:"+siteTecence);
		System.out.println("վ������:"+manageRevence);
		
		
		
		//������ϰ 2(���ɣ����ӣ���������)
		/*int biscuitNumber;
		int boxNumber;
		int containerNumber;
		int leftoverBiscuitsNumber;
		int leftoverBoxNumber;
		
		System.out.println("�������������");
		Scanner scan=new Scanner(System.in);
		biscuitNumber=scan.nextInt();
		
		boxNumber=biscuitNumber/24;
		leftoverBiscuitsNumber=biscuitNumber%24;
		containerNumber=boxNumber/75;
		leftoverBoxNumber=boxNumber%75;
		
		System.out.println("��������:"+boxNumber);
		System.out.println("ʣ���������:"+leftoverBiscuitsNumber);
		System.out.println("����������:"+containerNumber);
		System.out.println("ʣ����ӵ�����:"+leftoverBoxNumber);*/
		
	}

}
