package lab4;

public class Employee {
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "NAME : " + name + ", SALARY : " + salary;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("emp1", 100);
		Employee e2 = new Employee("emp2", 200);
		Employee m1 = new Manager("manager1", 2000, "HOD");
		Employee m2 = new Manager("manager2", 1000, "TA");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(m1);
		System.out.println(m2);
	}
}

class Manager extends Employee {
	private String department;

	public Manager(String name, double salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String toString() {
		return "NAME : " + this.getName() + ", DEPARTMENT : " + this.getDepartment() + ", SALARY : " + this.getSalary();
	}
}