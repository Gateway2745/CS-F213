package lab5;

import java.io.IOException;
import java.util.Scanner;

class Test {
	public static Student readStudent() throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first name of student");
		String fname = s.nextLine();
		System.out.println("Enter middle name of student");
		String mname = s.nextLine();
		System.out.println("Enter last name of student");
		String lname = s.nextLine();
		System.out.println("Enter name format(1 for ',' and 2 for ';') ");
		int num = s.nextInt();
		System.out.println("Enter age of student");
		int age = s.nextInt();

		

		return new Student(new Name(String.join((num == 1) ? "," : ";", fname,
				mname, lname)), age);

	}

	public static void main(String args[]) throws IOException {

		for (int i = 0; i < 3; i++) {
			Student s = Test.readStudent();
			StudentList.addStudent(s);
		}

		Student[] age_match = StudentList.getStudentsWithAge(20);
//		System.out.println(age_match);
		Student[] name_match = StudentList.getStudentsWithLastName("Sharma");
		Student[] marks_match = StudentList.getStudentsInRange(16, 20);
		
		if(age_match!=null) {
			for(Student s: age_match) {
				if(s!=null) System.out.println(s);
			}
		}
		if(name_match!=null) {
			for(Student s: name_match) {
				if(s!=null) System.out.println(s);
			}
		}
		if(marks_match!=null) {
			for(Student s: marks_match) {
				if(s!=null) System.out.println(s);
			}
		}
	}

}
