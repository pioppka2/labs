package elab2;

public class FacebookCreator implements SocialMediaCreator
{
	public FacebookCreator() {
		
	}
	
	public SocialMediaAcc createSocialMediaAcc(String login, String password) 
	{
		if(login != null && !login.isEmpty() && password != null && !password.isEmpty()) {
			return new FacebookAcc(login, password);
		}
		return null;
	}
}
