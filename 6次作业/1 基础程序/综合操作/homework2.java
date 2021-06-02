package week3;

import java.util.Scanner;

public class homework2 {
	
	public static int firstNum;
	public static int secondNum;
	
	public static void main(String[] args) {
		boolean flag1=false;
		String choose=menu();
		while(!choose.equals("e")) {
			switch (choose) {
			case "a":
				planA();
				flag1=true;
				break;
			case "b":
				if(flag1!=true) {
					System.out.println("please input the number first!");
					break;
				}
				planB();
				break;
			case "c":
				if(flag1!=true) {
					System.out.println("please input the number first!");
					break;
				}
				planC();
				break;
			case "d":
				if(flag1!=true) {
					System.out.println("please input the number first!");
					break;
				}
				planD();
				break;
			default:
				System.out.println("input chocie is invalid,please input again!");
			}
			choose=menu();
		}
		
		System.out.println("Exit,Welcome to use again£¡");
	}
	
	public static String menu() {
		String choice="a";
		System.out.println("==========================please choose your choice:=========================");
		System.out.println("a. input the firstNum and secondNum.");
		System.out.println("b. Output all the odd numbers between firstNum and secondNum.");
		System.out.println("c. Output the sum of all the even numbers between firstNum and secondNum.");
		System.out.println("d. Output the sum of the squares of all the odd numbers between firstNum and secondNum.");
		System.out.println("e. exit.");
		Scanner scan=new Scanner(System.in);
		choice=scan.nextLine();
		return choice;		
	}
	
	public static void planA() {
		boolean flag=false;
		while(!flag) {
			Scanner scan=new Scanner(System.in);
			System.out.println("please input firstNum:");
			firstNum=scan.nextInt();
			System.out.println("please input secondNum:");
			secondNum=scan.nextInt();
			if(firstNum<secondNum) {
				flag=true;
			}else {
				System.out.println("firstNum must be less than secondNum!");
				System.out.println("please input again!");
			}
		}
		
	}
	
	public static void planB() {
		System.out.println("odd numbers:");
		for(int i=firstNum;i<=secondNum;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
	}
	
	public static void planC() {
		int sum=0;
		System.out.println("the sum:");
		for(int i=firstNum;i<=secondNum;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	
	public static void planD() {
		int sum=0;
		System.out.println("the sum:");
		for(int i=firstNum;i<=secondNum;i++) {
			if(i%2!=0) {
				sum=sum+(int)Math.pow(i, 2);
			}
		}
		System.out.println(sum);
	}
	
	
}
