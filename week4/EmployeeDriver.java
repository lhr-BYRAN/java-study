package week4;

public class EmployeeDriver {
	public static void main(String[] args) {
		//1.��������.newʱ���Զ�������Ӧ��(���ݲ����ĸ���������)���췽��
		Employee emp1 =new Employee("John",1002,"����",2500);   //new�ǻ��Զ�������Ӧ�Ĺ��췽��
		Employee emp2 =new Employee("Tom",1001,"����",2500);
		
		
		//2.ͨ��������.����������public��Ա(�����򷽷�)  .�������
		float oldSalary=emp1.getBaseSalary();
		System.out.println("Ա��1�Ĺ���Ϊ:"+oldSalary);
		emp1.updataSalary();
		float newSalary=emp1.getBaseSalary();
		System.out.println("��н��Ա��1�Ĺ���Ϊ:"+newSalary);
	}

}