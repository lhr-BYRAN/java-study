package week4;

import java.util.Scanner;

public class DogDriver {
	public static void main(String[] args) {
		Dog dog=new Dog("dog","black",4);
		System.out.println("狗的名字是:"+dog.getName());
		System.out.println("狗的颜色是:"+dog.getColor());
		System.out.println("狗的年龄是:"+dog.getAge());
		
		System.out.println("狗的全部信息是:");
		System.out.println(dog.toString());
	}

}
