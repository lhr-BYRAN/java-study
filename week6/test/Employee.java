package week6;

public class Employee {
	private String name;
	private int id;
	private String department;
	private double baseSalary;
	
	public Employee() {
		super();
	}

	public Employee(String name, int id, String department, double baseSalary) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void updateSalary() {
		this.baseSalary=this.baseSalary*1.075;
	}
	
	public String toStrig() {
		String msg="";
		msg="id="+this.id+",name="+this.name;
		msg+= ",department="+this.department+",baseSalary="+this.baseSalary;
		return msg;
	}
	

}
