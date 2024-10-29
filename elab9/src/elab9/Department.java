package elab9;

import java.util.ArrayList;

public class Department implements Entity{
	private ArrayList<Employee> employeeList;
	
	public Department(ArrayList<Employee> employeeList) 
	{
		this.employeeList = employeeList;
	}
	
	public ArrayList<Employee> getEmployeeList(){
		return employeeList;
	}
	
	public void accept(Visitor v) 
	{
		v.visit(this);
	}
}
