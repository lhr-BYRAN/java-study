package week4;

public class Employee {
	//一.成员(instance) 变量(variable) 定义:权限修饰(public，private)，类型 ，名字
	/*
	 * 为了实现封装性,通常将所有的成员变量修饰为private
	 * 如果外界需要访问(read/write)他们,则通过定义相关的public方法来实现
	 * 方法名一般定义为getXXXX和setXXXX,一般修饰为public
	 */
	
	private String name;
	private int id;
	private String department;
	private float baseSalary;
	
	
	//二.成员方法(intance method)的定义,
	/*
	 * 权限修饰(public:任何位置均可访问    private:只能在本类中被访问)，
	 * 返回类型，没有返回，则使用void
	 * 名字
	 * 参数(形参类型，形参名)
	 */
	/*
	 * 有一个特殊的方法，方法名和类名一致，该方法称为构造方法(constructor)
	 * 1.方法名和类名一样
	 * 2.没有任何返回修饰
	 * 3.自动(新建一个对象)被调用,一般用于成员变量初始化
	 * 4.可以有多个:重载(override,名字一样但是参数不一样)
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
	
	
	//当形参名与成员变量名冲突时，使用this来访问成员变量
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
