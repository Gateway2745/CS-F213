package lab5;

class Student {
	private Name name; 
	private int age;

	public Student(Name name, int age) {
		this.name = name;
		this.age = age;
	}

	public Name getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString(){
		return name.getFname() + " " + name.getMname() + " " + name.getLname() + '\n' + "Age: " + Integer.toString(age);
	}
	
}
