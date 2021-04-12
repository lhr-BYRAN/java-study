package bank;

public class CheckingAccount extends BankAccount{
	private double surviceCheck;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String accountNum,double balance,double surviceCheck) {
		super(accountNum,balance);
		this.surviceCheck = surviceCheck;
	}

	public double getSurviceCheck() {
		return surviceCheck;
	}

	public void setSurviceCheck(double surviceCheck) {
		this.surviceCheck = surviceCheck;
	}
	
	public String toString() {
		String msg=super.toString();
		msg+=",surviceCheck: "+this.surviceCheck;
		return msg;
	}
	
	//收取信用卡服务费
	public void assessCheck() {
		super.setBalance(super.getBalance()-this.surviceCheck);
	}
}
