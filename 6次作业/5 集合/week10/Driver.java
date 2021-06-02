package week10;

import java.util.ArrayList;

import week10.dao.StudentDao;
import week10.vo.Result;
import week10.vo.Student;

public class Driver {
	public static void main(String[] args) {
		StudentDao d=new StudentDao();
		ArrayList<Student> listStu=d.creatListStu();
		ArrayList<Result> listResult=d.creatListResult(listStu);
		d.dispaly(listResult, listStu);
	}
}
