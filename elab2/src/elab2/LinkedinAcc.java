package elab2;

public class LinkedinAcc implements SocialMediaAcc {
	
	private String email;
	private String password;
	
	public LinkedinAcc(String email, String password) 
	{
		this.email = email;
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void postMessage(String message) {
		System.out.println(email + ": " + message);
	}
}
