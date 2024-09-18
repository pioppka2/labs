package elab2;

public class LinkedinCreator implements SocialMediaCreator
{
	public LinkedinCreator() {
		
	}
	
	public SocialMediaAcc createSocialMediaAcc(String email, String password) 
	{
		if(email != null && !email.isEmpty() && password != null && !password.isEmpty()) {
			return new LinkedinAcc(email, password);
		}
		return null;
	}
}
