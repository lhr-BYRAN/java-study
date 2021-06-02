package bank;

public class Customer {
	private String nns;
	private String name;
	private CheckingAccount ca;
	private SavingsAccount sa;
	
	public Customer() {
		super();
	}

	public Customer(String nns, String name, CheckingAccount ca, SavingsAccount sa) {
		super();
		this.nns = nns;
		this.name = name;
		this.ca = ca;
		this.sa = sa;
	}

	public String getNns() {
		return nns;
	}

	public void setNns(String nns) {
		this.nns = nns;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CheckingAccount getCheckingAccount() {
		return ca;
	}

	public void setCheckingAccount(CheckingAccount ca) {
		this.ca = ca;
	}

	public SavingsAccount getSavingsAccount() {
		return sa;
	}

	public void setSavingsAccount(SavingsAccount sa) {
		this.sa = sa;
	}
	
	public String toSring() {
		String msg="";
		msg="ssn: "+this.nns+"\n";
		msg+="name: "+this.name+"\n";
		/*
		msg+="checkingAccount:"+"\n"+ca.toString()+"\n";
		msg+="savingsAccount: "+"\n"+sa.toString()+"\n";
		*/
		return msg;
	}
	

}
