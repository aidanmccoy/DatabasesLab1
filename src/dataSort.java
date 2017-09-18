import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class dataSort {

	public static boolean CheckFormat(String command) {
		if ((!(command.charAt(1) == ':')) || command.length() < 4 || !(command.charAt(2) == ' ')) {
			return false;
		} else {
			return true;
		}
	}

	public static void SearchStudent(ArrayList<Student> students, String lastName) {
		for (Student student : students) {
			if (student.getStLastName().equals(lastName)) {
				System.out.println(student.getStLastName() + ", " + student.getStFirstName() + ", " + student.getGrade()
						+ ", " + student.getClassroom() + ", " + student.gettLastName() + ", "
						+ student.gettFirstName());
			}
		}
	}

	public static void SearchStudentBus(ArrayList<Student> students, String key) {
		for (Student student : students) {
			if (student.getStLastName().equals(key)) {
				System.out.println(student.getStLastName() + ", " + student.getStFirstName() + ", " + student.getBus());
			}
		}
	}

	public static void SearchTeacher(ArrayList<Student> students, String key) {
		for (Student student : students) {
			if (student.gettLastName().equals(key)) {
				System.out.println(student.getStLastName() + ", " + student.getStFirstName());
			}
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Scanner fs = new Scanner(new File("students.txt"));

		ArrayList<Student> students = new ArrayList();

		String fullCommand, key, stLastName, stFirstName, tLastName, tFirstName;
		int grade, classroom, bus;
		double gpa;
		char action;

		while (fs.hasNextLine()) {

			Scanner fs2 = new Scanner(fs.nextLine()).useDelimiter(",");
			stLastName = fs2.next();
			stFirstName = fs2.next();
			grade = fs2.nextInt();
			classroom = fs2.nextInt();
			bus = fs2.nextInt();
			gpa = fs2.nextDouble();
			tLastName = fs2.next();
			tFirstName = fs2.next();

			Student tempStudent = new Student(stLastName, stFirstName, grade, classroom, bus, gpa, tLastName,
					tFirstName);
			tempStudent.print();

			students.add(tempStudent);
		}

		while (true) {
			System.out.println("Enter next search");
			fullCommand = sc.nextLine();
			action = fullCommand.charAt(0);
			if (fullCommand.length() > 0) {
				switch (action) {
				case 'S':
					if (CheckFormat(fullCommand)) {
						if (fullCommand.charAt(fullCommand.length() - 1) == 'B') {
							key = fullCommand.substring(3, fullCommand.length() - 2);
							SearchStudentBus(students, key);
						}
						key = fullCommand.substring(3);
						SearchStudent(students, key);
					}
					break;
				case 'T':
					if (CheckFormat(fullCommand)) {
						key = fullCommand.substring(3);
						SearchTeacher(students, key);
					}
					break;
				case 'B':
					break;
				case 'G':
					break;
				case 'A':
					break;
				case 'I':
					break;
				case 'Q':
					break;
				default:
					System.out.println("Invalid Command...");
					break;
				}
			}
		}
	}

	
}
