package week1;

import java.util.Scanner;

public class homework1 {
	//1.
public static void main(String args[]) {
		int Number200cents;
		int Number100cents;
		int Number50cents;
		int Number20cents;
		int Number5cents;
		double dollarNumber;
		
		System.out.println("��������");
		Scanner scan=new Scanner(System.in);
		dollarNumber=scan.nextDouble();
		
		Number200cents=(int) (dollarNumber/2);
		Number100cents=(int) ((dollarNumber%2)/1);
		Number50cents=(int) ((dollarNumber%2%1)/0.5);
		Number20cents=(int) ((dollarNumber%2%1%0.5)/0.2);
		Number5cents=(int) ((dollarNumber%2%1%0.5%0.2)/0.05);
		
		System.out.println("2��ԪӲ������:"+Number200cents);
		System.out.println("1��ԪӲ������:"+Number100cents);
		System.out.println("50����Ӳ������:"+Number50cents);
		System.out.println("20����Ӳ������:"+Number20cents);
		System.out.println("5����Ӳ������:"+Number5cents);
	}

	
	/*
	//2.
	public static void main(String args[]) {
		int length;
		int width;
		int colour;
		int choiceFrame;
		int choicePicture;
		int crownsNumber;
		float costColour=0;
		float costFrame=0;
		float costPicture=0;
		float costcrown=0;
		float cost=0;
	
		
		System.out.println("������ͼƬ�ĳ���:");
		Scanner scan=new Scanner(System.in);
		length=scan.nextInt();
		System.out.println("������ͼƬ�Ŀ��:");
		width=scan.nextInt();
		System.out.println("��ɫ����1������ɫ����2:");
		colour=scan.nextInt();
		System.out.println("ѡ����ͨ�������1��ѡ��ʽ���ѡ����2:");
		choiceFrame=scan.nextInt();
		System.out.println("ѡ��ֽ��ֽ����1��ѡ��������2:");
		choicePicture=scan.nextInt();
		System.out.println("����ʹڵ�����:");
		crownsNumber=scan.nextInt();
		
		if(colour==1) {
			costColour=(float) (0.1*2*(length+width));
		}else {
			costColour=0;
		}
		
		if(choiceFrame==1) {
			costFrame=(float) (0.15*2*(length+width));
		}else if(choiceFrame==2) {
			costFrame=(float) (0.25*2*(length+width));
		}
		
		if(choicePicture==1) {
			costPicture=(float) (0.02*length*width);
		}else if(choicePicture==2) {
			costPicture=(float) (0.07*length*width);
		}
		
		costcrown=(float) (0.35*crownsNumber);
		
		cost=costColour+costFrame+costPicture+costcrown;
		
		System.out.println("֡��Ƭ�ļ۸�Ϊ:"+cost);
		
	}
	*/
}
