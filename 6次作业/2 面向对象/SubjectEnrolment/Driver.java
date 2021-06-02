package SubjectEnrolment;

import java.util.Scanner;

public class Driver {
	public static Enrolment enrolment;
	public static void main(String[] args) {
		int choose=meun();
		while(choose!=5) {
			switch(choose) {
			case 1:
				creat();break;
			case 2:
				add();break;
			case 3:
				remove();break;
			case 4:
				print();break;
			default:
				System.out.println("请输入有效选项!");					
			}
			choose=meun();
		}
		System.out.println("欢迎再次使用!");
	}
	
	
	public static int meun() {
		int choice=0;
		System.out.println("欢迎使用选课系统--------------");
		System.out.println("1.创建课程");
		System.out.println("2.选课");
		System.out.println("3.退选");
		System.out.println("4.打印");
		System.out.println("5.退出");
		System.out.println("-------------------------");
		Scanner scan =new Scanner(System.in);
		choice=scan.nextInt();
		return choice;
	}
	
	public static void creat() {
		if(enrolment!=null) {
			System.out.println("课程已创建!");
			return;
		}
		int maxSize;
		String subjectId;
		String subjectName; 
		int semester; 
		int year;
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入课程号:");
		subjectId=scan.next();
		System.out.println("请输入课程名:");
		subjectName=scan.next();
		System.out.println("请输入学期:");
		semester=scan.nextInt();
		System.out.println("请输入学年:");
		year=scan.nextInt();
		System.out.println("请输入课程的最大学生数:");
		maxSize=scan.nextInt();
		enrolment=new Enrolment(maxSize,subjectId,subjectName,semester,year);
		System.out.println("初始化成功 !");
	}

	public static void add() {
		if(enrolment==null) {
			System.out.println("请先创建课程!");
			return;
		}
		String id;
		String name;
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入学生学号:");
		id=scan.next();
		System.out.println("请输入学生姓名:");
		name=scan.next();
		
		if(enrolment.add(new Student(id,name))) {
			System.out.println("选课成功!");
		}else {
			System.out.println("选课失败!");
		}
		
		
	}
	
	public static void remove() {
		if(enrolment==null) {
			System.out.println("请先创建课程!");
			return;
		}
		String id;
		String name;
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入学生学号:");
		id=scan.next();
		int index;
		if(enrolment.remove(enrolment.indexof(id))){
			System.out.println("退课成功!");
		}else {
			System.out.println("无法查询到该学生!请确认学号是否正确");
		}		
	}
	
	public static void print() {
		if(enrolment==null) {
			System.out.println("请先创建课程!");
			return;
		}
		System.out.println(enrolment.toString());
		
		
	}
	
	
}
