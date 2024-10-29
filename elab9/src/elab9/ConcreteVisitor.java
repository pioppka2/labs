package elab9;

import java.util.ArrayList;

public class ConcreteVisitor implements Visitor
{
	public void visit(Company c) {
		ArrayList<Department> dList = c.getDepartmentList();
		for(int i = 0; i < dList.size(); i++) {
			visit(dList.get(i));
		}
	}
	public void visit(Department d) 
	{
		ArrayList<Employee> eList = d.getEmployeeList();
		for(int i = 0; i < eList.size(); i++) {
			System.out.println(eList.get(i).getJobTitle() + ": " + eList.get(i).getSalary());
		}
	}
}
