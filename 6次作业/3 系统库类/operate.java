package week8;

import java.util.Scanner;

public class operate {
	public static void main(String[] args) {
		//1.����Ϸ�������ʽ
		Scanner scan=new Scanner(System.in);
		System.out.println("�������㣨add,sub,max,min,doubleMe��");
		String express=scan.nextLine();
		
		//2.�ҳ�(λ��
		int pos1=express.indexOf("(");
				
		//3.ȡ�������ַ�������add
		String operateCode = express.substring(0,pos1);  //�Ӵ�������ʼλ��,����������λ�õ��ַ�
		
		//4.����������doubleMe����ֻ��Ҫȡһ����,ֻ��Ҫ����)��λ��
		int pos2,pos3;
		double number=0,number1=0,number2=0;
		if(operateCode.equals("doubleMe")) {
			pos3=express.indexOf(")");
			String operateNumber=express.substring(pos1+1,pos3);
			number=Double.parseDouble(operateNumber);
		}
		
		//5.������Ҫ��ȡ������������,��)��λ��
		else {
			pos2=express.indexOf(",");
			pos3=express.indexOf(")");
			String operateNumber1=express.substring(pos1+1,pos2);
			String operateNumber2=express.substring(pos2+1,pos3);	
			
		//6.����ת��Ϊ����
			number1=Double.parseDouble(operateNumber1);
			number2=Double.parseDouble(operateNumber2);		
		}
		
		//7.���������������Ӧ������
		double result=0;
		switch(operateCode) {
		case "add":result=number1+number2;break;
		case "sub":result=number1-number2;break;
		case "max":result=number1>number2?number1:number2;break;
		case "min":result=number1<number2?number1:number2;break;
		case "doubleMe":result=number*2;break;
		default:System.out.println("�ݲ�֧��");
		}
		
		//8.ƴ�����ֽ��
		String info=express+"="+String.valueOf(result);
		
		//9.������
		System.out.println(info);
		
	}
}
