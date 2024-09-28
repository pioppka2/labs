package elab4;

import java.util.Scanner;

public class SlackNotificationAdapter implements Notification 
{	
	SlackNotification slackAdaptee;
	Scanner sc = new Scanner(System.in);
	
	public SlackNotificationAdapter(String email) {
		
		System.out.println("Enter your Slack api key:");
		String apiKey = sc.nextLine();
		
		slackAdaptee = new SlackNotification(email, apiKey);
	}
    
	public void send(String title, String message) 
	{
		System.out.println("Enter chat id:");
		int chatId = sc.nextInt();
		
		slackAdaptee.sendToChat(chatId, title, message);
	}
}
