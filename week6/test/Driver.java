package week6;

public class Driver {
	public static void main(String[] args) {
		
		Administrator emp1;
		emp1=new Administrator("Tom",1001,"Administrator",100000,50000);
		
		SalaPerson emp2;
		emp2=new SalaPerson("Jerry",1001,"SalaPerson",100000,50000);
		
		emp1.updateSalary();
		emp2.updateSalary();
		
		System.out.println(emp1.toSting());
		System.out.println(emp2.toStrig());
		
	}

}
