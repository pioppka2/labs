package elab9;

import java.util.ArrayList;

public class Company implements Entity{
	private ArrayList<Department> departmentList;
	
	public Company(ArrayList<Department> departmentList) 
	{
		this.departmentList = departmentList;
	}
	
	public ArrayList<Department> getDepartmentList(){
		return departmentList;
	}
	
	public void accept(Visitor v) 
	{
		v.visit(this);
	}
}
