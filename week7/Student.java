package week7;

public  class Student {
	private String id;
	private String name;
	
	public Student() {
		super();
	}

	public Student(String id,String name) {
		super();
		this.name = name;
		this.id = id;
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


	@Override
	public String toString() {
		return "Studnet [id=" + id + ", name=" + name + "]";
	}
	
	
}