package SubjectEnrolment;

public class Subject {
	private String subjectId;
	private String subjectName;
	private int semester;
	private int year;
	
	public Subject() {
		super();
	}

	public Subject(String subjectId, String subjectName, int semester, int year) {
		super();
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.semester = semester;
		this.year = year;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "[课程号:" + subjectId + ",课程名:" + subjectName + ",学期:" + semester + ",学年:"
				+ year + "]";
	}
	
	
}
