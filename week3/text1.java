package week3;

import java.util.Scanner;

public class text1 {
	public static void main(String[] args) {
		int choose=menu();
		while(choose!=5) {
			switch(choose) {
			case 1:createAccount();break;
			case 2:deposit();break;
			case 3:withdraw();break;
			case 4:withdraw();break;
			default:System.out.println("input chocie is invalid,please input again!");			
			}
			choose=menu();
		}
		System.out.println("Exit,Welcome to use again��");
	}
	
	
	
	//�˵�����ʾ�������û�ѡ��1-5��
	public static int menu() {
		int choice=0;
		System.out.println("======WTU Bank=====");
		System.out.println("1.Create Account");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Balance");
		System.out.println("5.Exit");
		Scanner scan=new Scanner(System.in);
		choice=scan.nextInt();
		return choice;
	}
	
	//����
	public static void createAccount() {
		System.out.println("You choose to create account.");
		
	}
	
	//���
	public static void deposit(){
		System.out.println("You choose to deposit.");
	}
	
	//ȡ��
	public static void withdraw() {
		System.out.println("You choose to withdraw.");
	}
	
	//��ѯ
	public static void balance() {
		System.out.println("You choose to balance");
	}

}
