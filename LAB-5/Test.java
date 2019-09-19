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

		s.close();

		return new Student(new Name(String.join((num == 1) ? "," : ";", fname,
				mname, lname)), age);

	}

	public static void main(String args[]) throws IOException {

		for (int i = 0; i < 1; i++) {
			Student s = Test.readStudent();
			StudentList.addStudent(s);
		}

		for (Student s : StudentList.getStudentsWithAge(20)) {
			System.out.println(s);
		}

		for (Student s : StudentList.getStudentsWithLastName("Sharma")) {
			System.out.println(s);
		}

		for (Student s : StudentList.getStudentsInRange(16, 20)) {
			System.out.println(s);
		}

	}

}
