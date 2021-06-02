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
				System.out.println("��������Чѡ��!");					
			}
			choose=meun();
		}
		System.out.println("��ӭ�ٴ�ʹ��!");
	}
	
	
	public static int meun() {
		int choice=0;
		System.out.println("��ӭʹ��ѡ��ϵͳ--------------");
		System.out.println("1.�����γ�");
		System.out.println("2.ѡ��");
		System.out.println("3.��ѡ");
		System.out.println("4.��ӡ");
		System.out.println("5.�˳�");
		System.out.println("-------------------------");
		Scanner scan =new Scanner(System.in);
		choice=scan.nextInt();
		return choice;
	}
	
	public static void creat() {
		if(enrolment!=null) {
			System.out.println("�γ��Ѵ���!");
			return;
		}
		int maxSize;
		String subjectId;
		String subjectName; 
		int semester; 
		int year;
		Scanner scan=new Scanner(System.in);
		System.out.println("������γ̺�:");
		subjectId=scan.next();
		System.out.println("������γ���:");
		subjectName=scan.next();
		System.out.println("������ѧ��:");
		semester=scan.nextInt();
		System.out.println("������ѧ��:");
		year=scan.nextInt();
		System.out.println("������γ̵����ѧ����:");
		maxSize=scan.nextInt();
		enrolment=new Enrolment(maxSize,subjectId,subjectName,semester,year);
		System.out.println("��ʼ���ɹ� !");
	}

	public static void add() {
		if(enrolment==null) {
			System.out.println("���ȴ����γ�!");
			return;
		}
		String id;
		String name;
		Scanner scan=new Scanner(System.in);
		System.out.println("������ѧ��ѧ��:");
		id=scan.next();
		System.out.println("������ѧ������:");
		name=scan.next();
		
		if(enrolment.add(new Student(id,name))) {
			System.out.println("ѡ�γɹ�!");
		}else {
			System.out.println("ѡ��ʧ��!");
		}
		
		
	}
	
	public static void remove() {
		if(enrolment==null) {
			System.out.println("���ȴ����γ�!");
			return;
		}
		String id;
		String name;
		Scanner scan=new Scanner(System.in);
		System.out.println("������ѧ��ѧ��:");
		id=scan.next();
		int index;
		if(enrolment.remove(enrolment.indexof(id))){
			System.out.println("�˿γɹ�!");
		}else {
			System.out.println("�޷���ѯ����ѧ��!��ȷ��ѧ���Ƿ���ȷ");
		}		
	}
	
	public static void print() {
		if(enrolment==null) {
			System.out.println("���ȴ����γ�!");
			return;
		}
		System.out.println(enrolment.toString());
		
		
	}
	
	
}
