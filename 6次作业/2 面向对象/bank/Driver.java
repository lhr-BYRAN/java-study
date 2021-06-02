package bank;

import java.util.Scanner;

public class Driver {

	public static Customer customer = new Customer();

	public static void main(String[] args) {
		int choose = meun();
		while (choose != 8) {
			switch (choose) {
			case 1:
				creat();
				break;
			case 2:
				save();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				comsume();
				break;
			case 5:
				repay();
				break;
			case 6:
				settle();
				break;
			case 7:
				balance();
				break;
			default:
				System.out.println("��������Чѡ��");

			}
			choose = meun();
		}
		System.out.println("�˳��ɹ�����ӭ�ٴ�ʹ��!");

	}

	public static int meun() {
		int choice = 0;
		System.out.println("��ӭʹ������ϵͳ--------------");
		System.out.println("1.���� create");
		System.out.println("2.��� save");
		System.out.println("3.ȡ�� withdraw");
		System.out.println("4.���� comsume");
		System.out.println("5.���� repay");
		System.out.println("6.���н��� settle");
		System.out.println("7.��ѯ��� balance");
		System.out.println("8.�˳� exit");
		System.out.println("��ѡ��(1-8):");
		System.out.println("--------------------------");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static int subMeun() {
		int choice = 0;
		System.out.println("��ѡ�񿪿�����-------------");
		System.out.println("1.���ÿ� checkingAccount");
		System.out.println("2.�洢�� savingAccount");
		System.out.println("3.���� exit");
		System.out.println("��ѡ��(1-3):");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static void creat() {
		int choose = subMeun();
		while (choose != 3) {
			switch (choose) {
			case 1:
				checkingAccount();
				break;
			case 2:
				savingAccount();
				break;
			default:
				System.out.println("��������Чѡ��!");
			}
			choose = subMeun();
		}
	}

	public static void checkingAccount() {

		if (customer.getCheckingAccount() != null) {
			System.out.println("���Ѵ������ÿ�!");
			return;
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("���������֤��:");
		String ssn = scan.next();
		System.out.println("����������:");
		String name = scan.next();
		System.out.println("���������ÿ��Ŀ���:");
		String accountNum = scan.next();
		System.out.println("���������ÿ���������:");
		double surviceCheck = scan.nextDouble();

		CheckingAccount ca = new CheckingAccount(accountNum, 0, surviceCheck);
		customer = new Customer(ssn, name, ca, customer.getSavingsAccount());
		System.out.println("���ÿ������ɹ�!");

	}

	public static void savingAccount() {

		if (customer.getSavingsAccount() != null) {
			System.out.println("���Ѵ����洢��!");
			return;
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("���������֤��:");
		String ssn = scan.next();
		System.out.println("����������:");
		String name = scan.next();
		System.out.println("������洢���Ŀ���:");
		String accountNum = scan.next();
		System.out.println("������洢������Ϣ:");
		double interestRate = scan.nextDouble();

		SavingsAccount sa = new SavingsAccount(accountNum, 0, interestRate);
		customer = new Customer(ssn, name, customer.getCheckingAccount(), sa);
		System.out.println("�洢�������ɹ�!");

	}

	public static void save() {
		if (customer.getSavingsAccount() == null) {
			System.out.println("���ȿ����������洢��!");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("���������Ľ��:");
		double money = scan.nextDouble();
		customer.getSavingsAccount().setBalance(customer.getSavingsAccount().getBalance() + money);
		System.out.println("���ɹ�!");
	}

	public static void withdraw() {
		if (customer.getSavingsAccount() == null) {
			System.out.println("���ȿ����������洢��!");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("������ȡ���Ľ��:");
		double money = scan.nextDouble();
		if (money <= customer.getSavingsAccount().getBalance()) {
			customer.getSavingsAccount().setBalance(customer.getSavingsAccount().getBalance() - money);
			System.out.println("ȡ��ɹ�!");
		} else {
			System.out.println("�����洢�����!");
		}
	}

	public static void comsume() {
		if (customer.getCheckingAccount() == null) {
			System.out.println("���ȿ������������ÿ�!");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("���������ѵĽ��:");
		double money = scan.nextDouble();
		if ((customer.getCheckingAccount().getBalance() - money) < -50000) {
			System.out.println("��������͸֧,�뻹��!");
		} else {
			customer.getCheckingAccount().setBalance(customer.getCheckingAccount().getBalance() - money);
			System.out.println("���ѳɹ�!");
		}
	}

	public static void repay() {
		if (customer.getCheckingAccount() == null) {
			System.out.println("���ȿ������������ÿ�!");
			return;
		}
		double money = 50000 + customer.getCheckingAccount().getBalance();
		if (money <= customer.getSavingsAccount().getBalance()) {
			customer.getSavingsAccount().setBalance(customer.getSavingsAccount().getBalance() - money);
			customer.getCheckingAccount().setBalance(0);
			System.out.println("����ɹ�!");
		} else {
			System.out.println("�洢�����㻹�����ÿ�,����!");
		}

	}

	public static void settle() {
		if (customer == null) {
			System.out.println("���ȿ������������ÿ���洢��!");
			return;
		}
		customer.getCheckingAccount().setBalance(
				customer.getCheckingAccount().getBalance() - customer.getCheckingAccount().getSurviceCheck());

		customer.getSavingsAccount().setBalance(
				customer.getSavingsAccount().getBalance() * (1 + customer.getSavingsAccount().getInterestRate()));
		System.out.println("����ɹ�!");

	}

	public static void balance() {
		if (customer == null) {
			System.out.println("���ȿ������������ÿ���洢��!");
			return;
		}
		System.out.print(customer.toSring());
		
		if (customer.getSavingsAccount() == null) {
			System.out.println("��û�д洢��!");
		} else {
			System.out.println(customer.getSavingsAccount().toString());
			System.out.println("���Ĵ��濨���Ϊ:"+customer.getSavingsAccount().getBalance());
		}

		if (customer.getCheckingAccount() == null) {
			System.out.println("��û�����ÿ�!");
		} else {
			System.out.println(customer.getCheckingAccount().toString());
			System.out.println("�������ÿ��������ö��Ϊ50000," + "��ʣ���ö��Ϊ" + (customer.getCheckingAccount().getBalance() + 50000));
		}
	}

}
