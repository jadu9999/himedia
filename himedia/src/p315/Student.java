package p315;

public class Student extends Pelple {
	public int studentNo;
	
	public Student() {
		System.out.println("Student()");
	}
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

}
