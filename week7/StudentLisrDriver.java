package week7;

public class StudentLisrDriver {
	public static void main(String[] args) {
		StudentList list =new StudentList(10);
		
		if(list.add(new Student("101","Tom"))) {
			System.out.println("添加成功!");
		}else {
			System.out.println("添加失败!");
		}
		
		if(list.add(new Student("102","Jerry"))) {
			System.out.println("添加成功!");
		}else {
			System.out.println("添加失败!");
		}
		
		if(list.add(new Student("103","Sam"))) {
			System.out.println("添加成功!");
		}else {
			System.out.println("添加失败!");
		}
		
		System.out.println("查找学号为102的学生信息:");
		int index=list.indexof("102");
		if(index!=-1) {
			System.out.println(list.get(index).toString());
		}else {			
			System.out.println("没有找到!");
		}
		
		
		System.out.println("打印集合:");
		System.out.println(list.toString());
		
		
		System.out.println("删除位置为5的元素:");
		if(list.remove(5)) {
			System.out.println("删除成功");
			System.out.println("删除后集合为:");
			System.out.println(list.toString());
		}else {
			System.out.println("集合中只有"+list.getCount()+"个元素");
			System.out.println("删除失败"+"\n");
		}
		
		System.out.println("删除位置为2的元素:");
		if(list.remove(2)) {
			System.out.println("删除成功");
			System.out.println("删除后集合为:");
			System.out.println(list.toString());
		}else {
			System.out.println("集合中只有"+list.getCount()+"个元素");
			System.out.println("删除失败"+"\n");
		}
		
		System.out.println("删除位置为3的元素:");
		if(list.remove(3)) {
			System.out.println("删除成功");
			System.out.println("删除后集合为:");
			System.out.println(list.toString());
		}else {
			System.out.println("集合中只有"+list.getCount()+"个元素");
			System.out.println("删除失败"+"\n");
		}
		
	}
}
