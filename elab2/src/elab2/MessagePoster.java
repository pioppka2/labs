package elab2;

public class MessagePoster 
{
	private SocialMediaAcc acc;
	
	public MessagePoster(){

	}
	
	public void connectToSocialMediaAcc(String socialMedia, String loginOrEmail, String password) {
		
		if(socialMedia != null && !socialMedia.isEmpty()) 
		{
			SocialMediaCreator smc;
			
			switch (socialMedia)
			{
				case "facebook":
					smc = new FacebookCreator();
					break;
				case "linkedin":
					smc = new LinkedinCreator();
					break;
				default:
					smc = null;
					break;
			}
			
			acc = (smc != null) ? smc.createSocialMediaAcc(loginOrEmail, password) : null;
		}
		else {
			//error
		}
	}
	
	public void postMessage(String message) {
		if(acc != null) {
			acc.postMessage(message);
		}
		else {
			System.out.println("No connected account");
		}
	}
}
