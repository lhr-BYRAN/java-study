package week6;

public class SalaPerson extends Employee{
	private double yearlySales;

	public SalaPerson() {
		super();
	}
	
	public SalaPerson(String name, int id, String department, double baseSalary,double yearlySales) {
		super(name,id,department,baseSalary);
		this.yearlySales=yearlySales;
	}

	public double getYearlySales() {
		return yearlySales;
	}

	public void setYearlySales(double yearlySales) {
		this.yearlySales = yearlySales;
	}
	
	public String toStrig() {
		String msg="";
		msg=super.toStrig();
		msg+=",yearlySales="+this.yearlySales;
		return msg;
	}
	
	public void updateSalary() {
		super.setBaseSalary(super.getBaseSalary()+this.yearlySales*0.1);
	}
}
