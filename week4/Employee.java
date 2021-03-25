package week4;

public class Employee {
	//һ.��Ա(instance) ����(variable) ����:Ȩ������(public��private)������ ������
	/*
	 * Ϊ��ʵ�ַ�װ��,ͨ�������еĳ�Ա��������Ϊprivate
	 * ��������Ҫ����(read/write)����,��ͨ��������ص�public������ʵ��
	 * ������һ�㶨��ΪgetXXXX��setXXXX,һ������Ϊpublic
	 */
	
	private String name;
	private int id;
	private String department;
	private float baseSalary;
	
	
	//��.��Ա����(intance method)�Ķ���,
	/*
	 * Ȩ������(public:�κ�λ�þ��ɷ���    private:ֻ���ڱ����б�����)��
	 * �������ͣ�û�з��أ���ʹ��void
	 * ����
	 * ����(�β����ͣ��β���)
	 */
	/*
	 * ��һ������ķ�����������������һ�£��÷�����Ϊ���췽��(constructor)
	 * 1.������������һ��
	 * 2.û���κη�������
	 * 3.�Զ�(�½�һ������)������,һ�����ڳ�Ա������ʼ��
	 * 4.�����ж��:����(override,����һ�����ǲ�����һ��)
	 */
	
	public Employee() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public  void setName(String name) {
		this.name=name;
	}
	
	public float getBaseSalary() {
		return this.baseSalary;
	}
	
	
	//���β������Ա��������ͻʱ��ʹ��this�����ʳ�Ա����
	public Employee(String name, int id,String department,float baseSalary) {
		this.name=name;
		this.id=id;
		this.department=department;
		this.baseSalary=baseSalary;
		
	}
	
	public void updataSalary() {
		this.baseSalary= this.baseSalary * 1.035f;
		
	}
	
}
