package elab2;

public class FacebookAcc implements SocialMediaAcc {
	
	private String login;
	private String password;
	
	public FacebookAcc(String login, String password) 
	{
		this.login = login;
		this.password = password;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void postMessage(String message) {
		System.out.println(login + ": " + message);
	}
}
