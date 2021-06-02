package week2;

import java.util.Scanner;

public class homework2 {                          //求 3-7位数的水仙花
	public static void main(String[] args) {
		int n;
		System.out.println("请输入水仙花数的位数 n(3-7):");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		System.out.println(n+"位数的水仙花数有：");
		for(int number=(int) Math.pow(10, n-1);number<Math.pow(10, n);number++) {
			int wei;                              //定义一个wei，记录每个位数的数值
			int sum=0;                            //定义一个sum，用于判断结果是否为水仙花数
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
