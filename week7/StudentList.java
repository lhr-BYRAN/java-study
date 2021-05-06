package week7;

public class StudentList {
	private Student[] list;
	private int count;
	
	public StudentList(int maxSize) {
		list= new Student[maxSize];
		count=0;
	}
	
	

	public int getCount() {
		return count;
	}



	public void setCount(int count) {
		this.count = count;
	}



	public boolean add(Student student) {
		if(student==null) {
			return false;
		}
		if(count>=list.length) {
			return false;
		}
		list[count]=student;
		count++;
		return true;
	}
	
	public int indexof(String id) {
		for(int i=0;i<list.length&&list[i]!=null;i++) {
			if(list[i].getId().equals(id))
				return i;
		}
		return -1;
	}
	
	public int size() {
		return this.count;
	}
	
	public Student get(int index) {
		return list[index];
	}
	
	public String toString() {
		String info="";
		for(int i=0;i<list.length&&list[i]!=null;i++) {
			info+=list[i].toString()+"\n";
		}
		return info;
	}
	
	public boolean remove(int index) {
		if(index<0||index>count) {
			return false;
		}
		for(int i=index;i<=count;i++) {
			if(i==count) {
				list[i-1]=null;
				count--;
				break;
			}
			list[i-1]=list[i];
		}
		return true;
	}
	
	

	
	
	
}
