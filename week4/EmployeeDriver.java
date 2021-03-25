package week4;

public class EmployeeDriver {
	public static void main(String[] args) {
		//1.创建对象.new时会自动调用相应的(根据参数的个数与类型)构造方法
		Employee emp1 =new Employee("John",1002,"销售",2500);   //new是会自动调用相应的构造方法
		Employee emp2 =new Employee("Tom",1001,"财务",2500);
		
		
		//2.通过对象名.方法来访问public成员(变量或方法)  .运算符号
		float oldSalary=emp1.getBaseSalary();
		System.out.println("员工1的工资为:"+oldSalary);
		emp1.updataSalary();
		float newSalary=emp1.getBaseSalary();
		System.out.println("加薪后员工1的工资为:"+newSalary);
	}

}