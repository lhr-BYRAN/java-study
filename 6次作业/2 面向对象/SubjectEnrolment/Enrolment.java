package SubjectEnrolment;

public class Enrolment {
	private Subject subject;
	private Student[] list;
	private int count;
	
	public Enrolment(int maxSize,String subjectId, String subjectName, int semester, int year) {
		count=0;
		this.list=new Student[maxSize];
		this.subject=new Subject(subjectId,subjectName,semester,year);
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
				return i+1;
		}
		return -1;
	}
	
	public int size() {
		return this.count;
	}
	
	
	public Student get(int index) {
		return list[index];
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
	
	public String toString() {
		String info="";
		info+=subject.toString()+"\n";
		info+="Ñ§ºÅ"+"            "+"ĞÕÃû"+"\n";
		for(int i=0;i<list.length&&list[i]!=null;i++) {
			info+=list[i].toString()+"\n";
		}
		return info;
	}


			
}
