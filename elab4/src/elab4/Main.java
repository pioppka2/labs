package elab4;

public class Main 
{
	public static void main(String[] args) {
        EmailNotification notification = new EmailNotification("admin@example.com");
        notification.send("Test Title", "This is a test message.");
        
        SMSNotificationAdapter sms = new SMSNotificationAdapter(notification.getEmail());
        sms.send("Test Title", "This is a test message.");
        
        SlackNotificationAdapter slack = new SlackNotificationAdapter(notification.getEmail());
        slack.send("Test Title", "This is a test message.");
    }
}
