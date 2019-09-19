package lab5;

class StudentList {
	public static Student[] list = new Student[10]; 
	public static int count = 0; 

	public static void addStudent(Student std) {
		if (count >= 10)
			return; 
		list[count] = std;
		count++;
	}

	public static Student[] getStudentsWithAge(int age) {
		
		Student[] match = new Student[10];
		match[0]=null;
		int i = 0;
		for(Student s : list) {
			if(s.getAge() == age) {
				match[i++] = s; 
			}
		}
		if(match[0] == null) return null;
		else return match;
	}

	public static Student[] getStudentsWithLastName(String lastName) {
		Student[] match = new Student[10];
		int i = 0;
		for(Student s : list) {
			if(s.getName().getLname() == lastName) {
				match[i++] = s; 
			}
		}
		if(match[0] == null) return null;
		else return match;
	}

	public static Student[] getStudentsInRange(int minAge, int maxAge) {
		
		Student[] match = new Student[10];
		int i = 0;
		for(Student s : list) {
			if(s.getAge() >= minAge && s.getAge() <= maxAge) {
				match[i++] = s; 
			}
		}
		if(match[0] == null) return null;
		else return match;
	}
}
