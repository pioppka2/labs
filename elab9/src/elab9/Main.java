package elab9;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		ArrayList<Employee> employees1 = new ArrayList<>();
		employees1.add(new Employee("designer", 500));
		employees1.add(new Employee("cook", 5000));
		
		ArrayList<Employee> employees2 = new ArrayList<>();
		employees2.add(new Employee("loader", 10000));
		employees2.add(new Employee("courier", 7500));
		
		ArrayList<Department> departments = new ArrayList<>();
		Department department1 = new Department(employees1);
		Department department2 = new Department(employees2);
		departments.add(department1);
		departments.add(department2);
		
		Company company = new Company(departments);
		
		ConcreteVisitor cv = new ConcreteVisitor();
		
		company.accept(cv);
		System.out.println();
		department1.accept(cv);
		System.out.println();
		department2.accept(cv);
		System.out.println();
	}
}
