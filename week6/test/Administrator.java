package week6;

public class Administrator extends Employee{
	private double bonus;

	public Administrator() {
		super();
	}
	
	public Administrator(String name, int id, String department, double baseSalary,double bonus) {
		/*
		super.setId(id);
		super.setName(name);
		super.setDepartment(department);
		super.setBaseSalary(baseSalary);
		*/
		super(name,id,department,baseSalary);
		
		this.setBonus(bonus);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public String toSting() {
		String msg="";
		/*
		msg="id:"+super.getId()+",name:"+super.getName();
		msg+= ",department:"+super.getDepartment()+",baseSalary:"+super.getBaseSalary();
		*/
		msg=super.toStrig();
		
		msg+=",bonus="+this.bonus;
		return msg;
	}
	
	public void updateSalary() {
		super.setBaseSalary(super.getBaseSalary()+this.bonus);
	}
	

}
