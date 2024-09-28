package elab4;

public class SlackNotification 
{
	private String login;
	private String apiKey;
	
	SlackNotification(String login, String apiKey){
		this.apiKey = apiKey;
		this.login = login;
	}
	
	public void sendToChat(int chatId, String title, String message) 
	{
		 System.out.println("Sent to Slack chat " + chatId + " with title '" + title + "' that says '" + message + "'.");
	}
}
