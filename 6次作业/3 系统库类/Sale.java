package week9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import week9.vo.Product;

public class Sale {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("请输入销售信息，以此为商品名称，商品单价，销售量，之间“，”隔开，最后用“0000”结尾");
		
		String aLine=scan.nextLine();
		String info="";
		int num1=0;
		int saleNumber=0;
		int saleCount=0;
		double saleMoney=0;
		while(!aLine.equals("0000")) {
		String arr[]=aLine.split(",|，");
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
		
		System.out.println("   流 水 号        \t商品名称\t单价\t商品数量\t总额");
		System.out.println(info);
		System.out.println("总计："+"销售笔数:"+saleNumber+"  销售数量:"+saleCount+"  销售金额:"+saleMoney);

	}

	private static String generateSno(String beforeNo) {
		String sno="";
		//1.获取流水号的前缀
		SimpleDateFormat df =new SimpleDateFormat("yyyyMMdd");
		String prefix =df.format(new Date());
		
		//2.顺序号,beforeNo+1
		String newNo=String.valueOf(Integer.parseInt(beforeNo)+1);
		
		//3.补若干个0
		String zero="";
		int zeroCount=4-newNo.length();
		for(int i=0;i<zeroCount;i++) {
			zero+="0";
		}
		
		
		sno=prefix+zero+newNo;
		return sno;
	}
}
