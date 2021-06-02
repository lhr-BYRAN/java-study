package week10.dao;

import java.util.ArrayList;
import java.util.Scanner;
import week10.vo.Result;
import week10.vo.Student;

public class StudentDao {
	public  ArrayList<Student> creatListStu() {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		String date = "";
		System.out.println("请输入学生基本信息：（每个学生一行，输入格式为“学号，姓名，性别，省份”，如“001， 张三，男，湖北”，当输入“end”时结束输入）");
		date = scan.nextLine();
		while (!date.equals("end")) {
			String arr[] = date.split(",|，");
			String id = arr[0];
			String name = arr[1];
			String gender = arr[2];
			String province = arr[3];
			Student student = new Student(id, name, gender, province);
			list.add(student);
			date = scan.nextLine();
		}
		return list;
	}

	public  int CountByGender(ArrayList<Student> listStudent, String gender) {
		int count = 0;
		for (Student student : listStudent) {
			String studentGender = student.getGender();
			if (studentGender.equals(gender)) {
				count++;
			}
		}
		return count;
	}

	public  ArrayList<Result> creatListResult(ArrayList<Student> list) {
		ArrayList<Result> listResult = new ArrayList<Result>();
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			String name = stu.getName();
			String province = stu.getProvince();
			int index = isProvince(listResult, province);
			if (index != -1) {
				listResult.get(index).setCount(listResult.get(index).getCount() + 1);
				listResult.get(index).setDetails(listResult.get(index).getDetails() + "," + name);
			} else {
				Result result = new Result(province, 1, name);
				listResult.add(result);
			}
		}
		return listResult;
	}

	public  int isProvince(ArrayList<Result> listResult, String province) {
		int index = -1;
		for (int i = 0; i < listResult.size(); i++) {
			if (province.equals(listResult.get(i).getProvince())) {
				index = i;
			}
		}

		return index;
	}

	public  void dispaly(ArrayList<Result> listResult, ArrayList<Student> listStudent) {
		int totalCount = listStudent.size();
		int maleCount = CountByGender(listStudent, "男");
		int femaleCount = CountByGender(listStudent, "女");

		System.out.println("总人数:" + totalCount);
		System.out.println("其中男:" + maleCount + "人，" + maleCount * 100.0f / totalCount + "%，女:" + femaleCount + "人，"
				+ femaleCount * 100.0f / totalCount+"%");
		System.out.println("学生来自以下省份:");
		for (Result result : listResult) {
			System.out.println(result.toString());
		}
	}

	

}
