package elab4;

import java.util.Scanner;

public class SMSNotificationAdapter implements Notification
{

	private SMSNotification smsAdaptee;
	private Scanner sc = new Scanner(System.in);
		
	public SMSNotificationAdapter(String email) {
			
		System.out.println("Enter your phone number:");
		String phone = sc.nextLine();
			
		smsAdaptee = new SMSNotification(email, phone);
	}
	    
	public void send(String title, String message) 
	{
		smsAdaptee.send(title, message);
	}
}

