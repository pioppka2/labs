package elab2;

public class Main {

	public static void main(String[] args) 
	{
		MessagePoster mp = new MessagePoster();
		
		mp.connectToSocialMediaAcc("facebook", "facebookUser", "123");
		mp.postMessage("hi, everyone");
		
		mp.connectToSocialMediaAcc("linkedin", "linkedinEmail@gmail.com", "321");
		mp.postMessage("goodbye, everyone");
	}

}
