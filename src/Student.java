
public class Student {
	public String getStLastName() {
		return stLastName;
	}
	public void setStLastName(String stLastName) {
		this.stLastName = stLastName;
	}
	public String getStFirstName() {
		return stFirstName;
	}
	public void setStFirstName(String stFirstName) {
		this.stFirstName = stFirstName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public int getBus() {
		return bus;
	}
	public void setBus(int bus) {
		this.bus = bus;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String gettLastName() {
		return tLastName;
	}
	public void settLastName(String tLastName) {
		this.tLastName = tLastName;
	}
	public String gettFirstName() {
		return tFirstName;
	}
	public void settFirstName(String tFirstName) {
		this.tFirstName = tFirstName;
	}
	
	public void print() {
		System.out.println("Last Name is - " + stLastName);
		System.out.println("First Name is - " + stFirstName);
		System.out.println("Grade is - " + grade);
		System.out.println("Classroom is - " + classroom);
		System.out.println("Bus is - " + bus);
		System.out.println("GPA is - " + gpa);
		System.out.println("Teach Last Name is - " + tLastName);
		System.out.println("Teach First Name is - " + tFirstName);
		System.out.println("-----------------------------------------");
	}
	
	public Student(String stLastName, String stFirstName, int grade,
			int classroom, int bus, double gpa, String tLastName,
			String tFirstName) {
		super();
		this.stLastName = stLastName;
		this.stFirstName = stFirstName;
		this.grade = grade;
		this.classroom = classroom;
		this.bus = bus;
		this.gpa = gpa;
		this.tLastName = tLastName;
		this.tFirstName = tFirstName;
	}
	
	String stLastName;
	String stFirstName;
	int grade;
	int classroom;
	int bus;
	double gpa;
	String tLastName;
	String tFirstName;
}

