package bank;

public class SavingsAccount extends BankAccount{
	private double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(String accountNum,double balance,double interestRate)  {
		super(accountNum,balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public String toString() {
		String msg="accountNum: "+super.getAccountNum();
		msg+=",balance: "+super.getBalance();
		msg+=",interestRate: "+this.interestRate;
		return msg;
	}
	
	public void payInterest() {
		super.setBalance(super.getBalance()*(1+this.interestRate));
	}
}
