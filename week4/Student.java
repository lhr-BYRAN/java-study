package week4;

public class Student {
	
		private String name;
		private String phoneNumber;
		private int id;
		


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		
				
		public Student() {
			super();
		}

		public Student(String name,String phoneNumber,int id) {
			this.name=name;
			this.phoneNumber=phoneNumber;
			this.id=id;
		}
		
		public void dispalyStudent() {
			System.out.println("学生名称:"+this.name);
			System.out.println("学生电话号码:"+this.phoneNumber);
			System.out.println("学生学号:"+this.id);
		}
		
		
}
