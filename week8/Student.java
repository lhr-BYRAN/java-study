package week8;

public class Student {
	String id;
	String name;
	String gender;
	String brith;
	
	public Student() {
		super();
	}

	public Student(String id, String name, String gender, String brith) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.brith = brith;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBrith() {
		return brith;
	}

	public void setBrith(String brith) {
		this.brith = brith;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", brith=" + brith + "]";
	}
	
	
	
}
