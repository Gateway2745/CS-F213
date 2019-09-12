package lab4;

public abstract class Worker {
	private String name;
	private double salary_rate;
	
	public Worker(String name, double salary_rate) {
		this.name = name;
		this.salary_rate = salary_rate;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public double getSalary_rate() {
		return salary_rate;
	}

	public void setSalary_rate(double salary_rate) {
		this.salary_rate = salary_rate;
	}

	public abstract double computePay();
		
	public static void main(String[] args) {
		Worker w1 = new FullTimeWorker("w1", 100, 45 );
		Worker w2 = new HourlyWorker("w2", 50, 100 );
		System.out.println("w1's pay is " + w1.computePay());
		System.out.println("w2's pay is " + w2.computePay());
	}

}

class FullTimeWorker extends Worker {
	int hours_Worked;
	
	public FullTimeWorker(String name, double salary_rate, int hours_Worked) {
		super(name, salary_rate);
		this.hours_Worked = hours_Worked;
	}
	
	public double computePay() {
		return hours_Worked>240?240 * getSalary_rate():hours_Worked*getSalary_rate();
	}
}

class HourlyWorker extends Worker {
	int hours_Worked;
	
	public HourlyWorker(String name, double salary_rate, int hours_Worked) {
		super(name, salary_rate);
		this.hours_Worked = hours_Worked;
	}
	
	public double computePay() {
		return hours_Worked>60?60*getSalary_rate():hours_Worked*getSalary_rate();
	}
}
