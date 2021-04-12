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
				System.out.println("请输入有效选项");

			}
			choose = meun();
		}
		System.out.println("退出成功，欢迎再次使用!");

	}

	public static int meun() {
		int choice = 0;
		System.out.println("欢迎使用银行系统--------------");
		System.out.println("1.开户 create");
		System.out.println("2.存款 save");
		System.out.println("3.取款 withdraw");
		System.out.println("4.消费 comsume");
		System.out.println("5.还款 repay");
		System.out.println("6.银行结算 settle");
		System.out.println("7.查询余额 balance");
		System.out.println("8.退出 exit");
		System.out.println("请选择(1-8):");
		System.out.println("--------------------------");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		return choice;
	}

	public static int subMeun() {
		int choice = 0;
		System.out.println("请选择开卡类型-------------");
		System.out.println("1.信用卡 checkingAccount");
		System.out.println("2.存储卡 savingAccount");
		System.out.println("3.返回 exit");
		System.out.println("请选择(1-3):");
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
				System.out.println("请输入有效选项!");
			}
			choose = subMeun();
		}
	}

	public static void checkingAccount() {

		if (customer.getCheckingAccount() != null) {
			System.out.println("您已创建信用卡!");
			return;
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入身份证号:");
		String ssn = scan.next();
		System.out.println("请输入姓名:");
		String name = scan.next();
		System.out.println("请输入信用卡的卡号:");
		String accountNum = scan.next();
		System.out.println("请输入信用卡的年服务费:");
		double surviceCheck = scan.nextDouble();

		CheckingAccount ca = new CheckingAccount(accountNum, 0, surviceCheck);
		customer = new Customer(ssn, name, ca, customer.getSavingsAccount());
		System.out.println("信用卡建立成功!");

	}

	public static void savingAccount() {

		if (customer.getSavingsAccount() != null) {
			System.out.println("您已创建存储卡!");
			return;
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("请输入身份证号:");
		String ssn = scan.next();
		System.out.println("请输入姓名:");
		String name = scan.next();
		System.out.println("请输入存储卡的卡号:");
		String accountNum = scan.next();
		System.out.println("请输入存储卡的利息:");
		double interestRate = scan.nextDouble();

		SavingsAccount sa = new SavingsAccount(accountNum, 0, interestRate);
		customer = new Customer(ssn, name, customer.getCheckingAccount(), sa);
		System.out.println("存储卡建立成功!");

	}

	public static void save() {
		if (customer.getSavingsAccount() == null) {
			System.out.println("请先开户，创建存储卡!");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入存入的金额:");
		double money = scan.nextDouble();
		customer.getSavingsAccount().setBalance(customer.getSavingsAccount().getBalance() + money);
		System.out.println("存款成功!");
	}

	public static void withdraw() {
		if (customer.getSavingsAccount() == null) {
			System.out.println("请先开户，创建存储卡!");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入取出的金额:");
		double money = scan.nextDouble();
		if (money <= customer.getSavingsAccount().getBalance()) {
			customer.getSavingsAccount().setBalance(customer.getSavingsAccount().getBalance() - money);
			System.out.println("取款成功!");
		} else {
			System.out.println("金额超出存储卡余额!");
		}
	}

	public static void comsume() {
		if (customer.getCheckingAccount() == null) {
			System.out.println("请先开户，创建信用卡!");
			return;
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入消费的金额:");
		double money = scan.nextDouble();
		if ((customer.getCheckingAccount().getBalance() - money) < -50000) {
			System.out.println("信用消费透支,请还款!");
		} else {
			customer.getCheckingAccount().setBalance(customer.getCheckingAccount().getBalance() - money);
			System.out.println("消费成功!");
		}
	}

	public static void repay() {
		if (customer.getCheckingAccount() == null) {
			System.out.println("请先开户，创建信用卡!");
			return;
		}
		double money = 50000 + customer.getCheckingAccount().getBalance();
		if (money <= customer.getSavingsAccount().getBalance()) {
			customer.getSavingsAccount().setBalance(customer.getSavingsAccount().getBalance() - money);
			customer.getCheckingAccount().setBalance(0);
			System.out.println("还款成功!");
		} else {
			System.out.println("存储卡金额不足还款信用卡,请存款!");
		}

	}

	public static void settle() {
		if (customer == null) {
			System.out.println("请先开户，创建信用卡或存储卡!");
			return;
		}
		customer.getCheckingAccount().setBalance(
				customer.getCheckingAccount().getBalance() - customer.getCheckingAccount().getSurviceCheck());

		customer.getSavingsAccount().setBalance(
				customer.getSavingsAccount().getBalance() * (1 + customer.getSavingsAccount().getInterestRate()));
		System.out.println("结算成功!");

	}

	public static void balance() {
		if (customer == null) {
			System.out.println("请先开户，创建信用卡或存储卡!");
			return;
		}
		System.out.print(customer.toSring());
		
		if (customer.getSavingsAccount() == null) {
			System.out.println("您没有存储卡!");
		} else {
			System.out.println(customer.getSavingsAccount().toString());
			System.out.println("您的储存卡余额为:"+customer.getSavingsAccount().getBalance());
		}

		if (customer.getCheckingAccount() == null) {
			System.out.println("您没有信用卡!");
		} else {
			System.out.println(customer.getCheckingAccount().toString());
			System.out.println("您的信用卡可用信用额度为50000," + "还剩可用额度为" + (customer.getCheckingAccount().getBalance() + 50000));
		}
	}

}
