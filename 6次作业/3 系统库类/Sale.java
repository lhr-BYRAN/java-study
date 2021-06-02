package week9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import week9.vo.Product;

public class Sale {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("������������Ϣ���Դ�Ϊ��Ʒ���ƣ���Ʒ���ۣ���������֮�䡰��������������á�0000����β");
		
		String aLine=scan.nextLine();
		String info="";
		int num1=0;
		int saleNumber=0;
		int saleCount=0;
		double saleMoney=0;
		while(!aLine.equals("0000")) {
		String arr[]=aLine.split(",|��");
		String name=arr[0];
		int number=Integer.parseInt(arr[1]);
		double price=Double.parseDouble(arr[2]);
		double totalMoney=price*number;
		String sno = generateSno(String.valueOf(num1));
		num1++;
		saleNumber++;
		saleCount=saleCount+Integer.parseInt(arr[1]);
		saleMoney=saleMoney+totalMoney;
		
		Product product =new Product(sno,name,price,number,totalMoney);
		info+=product.toString()+"\n";
		aLine=scan.nextLine();
		}
		
		System.out.println("   �� ˮ ��        \t��Ʒ����\t����\t��Ʒ����\t�ܶ�");
		System.out.println(info);
		System.out.println("�ܼƣ�"+"���۱���:"+saleNumber+"  ��������:"+saleCount+"  ���۽��:"+saleMoney);

	}

	private static String generateSno(String beforeNo) {
		String sno="";
		//1.��ȡ��ˮ�ŵ�ǰ׺
		SimpleDateFormat df =new SimpleDateFormat("yyyyMMdd");
		String prefix =df.format(new Date());
		
		//2.˳���,beforeNo+1
		String newNo=String.valueOf(Integer.parseInt(beforeNo)+1);
		
		//3.�����ɸ�0
		String zero="";
		int zeroCount=4-newNo.length();
		for(int i=0;i<zeroCount;i++) {
			zero+="0";
		}
		
		
		sno=prefix+zero+newNo;
		return sno;
	}
}
