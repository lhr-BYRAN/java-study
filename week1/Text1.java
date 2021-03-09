package week1;

import java.util.Scanner;

public class Text1 {
	//由若干个方法组成
	//该方法是程序执行入口
	public static void main(String args[]) {
		//1.定义变量，变量名及对应的数据类型，命名采取驼峰命名规则
		String songTitle;
		float songPrice;
		int number;
		
		float totalRevence;
		float siteTecence;
		float manageRevence;
		float siteRate;
		float manageRate;
		
		//2.为变量赋值（硬编码赋值或者交互式输入）
		//从标准输入设备（键盘）创建一个输入对象，从键盘输入各种类型使用对象
		//所有输入前均应该有输入提示
		//输出采取的方法
		//float类型的常量赋值后面要加f后缀
		
		siteRate=0.03f;
		manageRate=0.12f;
		
		System.out.println("请输入歌曲名称：");
		//输入时可采取快捷键syso，然后按下alt+/
		Scanner scan=new Scanner(System.in);	
		songTitle=scan.nextLine();
		System.out.println("请输入单价：");
		songPrice=scan.nextFloat();
		System.out.println("请输入数量：");
		number=scan.nextInt();
		
		//3.运算处理
		totalRevence=songPrice*number;
		siteTecence=totalRevence*siteRate;
		manageRevence=totalRevence*manageRate;
		
		
		//4.输出结果采取的是控制台输出（后期可以是文件，数据库，网络等等）
		System.out.println("总利润:"+totalRevence);
		System.out.println("经济利润:"+siteTecence);
		System.out.println("站点利润:"+manageRevence);
		
		
		
		//课内练习 2(饼干，盒子，容器问题)
		/*int biscuitNumber;
		int boxNumber;
		int containerNumber;
		int leftoverBiscuitsNumber;
		int leftoverBoxNumber;
		
		System.out.println("请输入饼干数量");
		Scanner scan=new Scanner(System.in);
		biscuitNumber=scan.nextInt();
		
		boxNumber=biscuitNumber/24;
		leftoverBiscuitsNumber=biscuitNumber%24;
		containerNumber=boxNumber/75;
		leftoverBoxNumber=boxNumber%75;
		
		System.out.println("盒子数量:"+boxNumber);
		System.out.println("剩余饼干数量:"+leftoverBiscuitsNumber);
		System.out.println("容器的数量:"+containerNumber);
		System.out.println("剩余盒子的数量:"+leftoverBoxNumber);*/
		
	}

}
