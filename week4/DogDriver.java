package week4;

import java.util.Scanner;

public class DogDriver {
	public static void main(String[] args) {
		Dog dog=new Dog("dog","black",4);
		System.out.println("����������:"+dog.getName());
		System.out.println("������ɫ��:"+dog.getColor());
		System.out.println("����������:"+dog.getAge());
		
		System.out.println("����ȫ����Ϣ��:");
		System.out.println(dog.toString());
	}

}
