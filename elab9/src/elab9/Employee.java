package elab9;

public class Employee {
	private String jobTitle;
	private double salary;
	
	public Employee(String jobTitle, double salary) {
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	public String getJobTitle() {
		return jobTitle;
	}
}
