package elab4;

public class SMSNotification {

	private String phone;
	private String sender;
	
	SMSNotification(String phone, String sender)
	{
		this.sender = sender;
		this.phone = phone;
	}
	
	public void send(String title, String message) 
	{
		 System.out.println("Sent via SMS from " + sender + " with title '" + title + "' that says '" + message + "'.");
	}
}

