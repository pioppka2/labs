package elab8;

public class User implements Entity
{
	private String email;
	private String name;
	
	public User(String name, String email) 
	{
		this.email = email;
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
}
