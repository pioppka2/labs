package elab10;
import java.util.Scanner;

public class Dialog implements Mediator {
	
	TextField date;
	TimeList timeList;
	CheckBox anotherRecipient;
	TextField anotherRecipientName;
	TextField anotherRecipientNumber;
	CheckBox selfPickup;
	
	Boolean[] activeObjects = {false, false, false, false, false};
	
	public Dialog() {
		date = new TextField(this);
		timeList = new TimeList(this);
		anotherRecipient = new CheckBox(this);
		anotherRecipientName = new TextField(this);
		anotherRecipientNumber = new TextField(this);
		selfPickup = new CheckBox(this);
		
		anotherRecipientName.setInactive();
		anotherRecipientNumber.setInactive();
		timeList.setInactive();
	}
	
	public void start() {
		Boolean isEnd = false;
		int chosenOption = -1;
		Scanner scanner = new Scanner(System.in);
				
		while(!isEnd) {
			if(date.getActive()) {
				System.out.println("1. Date - " + date.getText());
			}
			if(timeList.getActive()) {
				System.out.println("2. Chosen time - " + timeList.getChosenIndex());
				for(int i = 0; i < timeList.getTimes().size(); i++) {
					System.out.println("\t" + timeList.getTimes().get(i));
				}
			}
			if(anotherRecipient.getActive()) {
				System.out.println("3. Another recipient - " + anotherRecipient.getChecked());
			}
			if(anotherRecipientName.getActive()) {
				System.out.println("4. Another recipient name - " + anotherRecipientName.getText());
			}
			if(anotherRecipientNumber.getActive()) {
				System.out.println("5. Another recipient number - " + anotherRecipientNumber.getText());
			}
			if(selfPickup.getActive()) {
				System.out.println("6. Self pickup - " + selfPickup.getChecked());
			}
			System.out.println("7. Place order");
			
			chosenOption = scanner.nextInt();
			
			switch(chosenOption) {
				case 1:
					date.setText(scanner.nextLine());
					break;
				case 2:
					timeList.chooseTime(scanner.nextInt());
					break;
				case 3:
					if(anotherRecipient.getChecked()) {
						anotherRecipient.uncheck();
					}
					else {
						anotherRecipient.check();
					}
					break;
				case 4:
					anotherRecipientName.setText("test");
					break;
				case 5:
					anotherRecipientNumber.setText("testNumber");
					break;
				case 6:
					if(selfPickup.getChecked()) {
						selfPickup.uncheck();
					}
					else {
						selfPickup.check();
					}
					break;
				case 7:
					isEnd = true;
					break;
				default:
					System.out.print("Invalid operation");
					break;
			}
		}
	}
	
	public void notifyObj(Object sender, String event) {
		
		if(sender == selfPickup) {
			if(event.equals("check")) {
				
				activeObjects[0] = date.getActive();
				activeObjects[1] = timeList.getActive();
				activeObjects[2] = anotherRecipient.getActive();
				activeObjects[3] = anotherRecipientName.getActive();
				activeObjects[4] = anotherRecipientNumber.getActive();
				
				date.setInactive();
				timeList.setInactive();
				anotherRecipient.setInactive();
				anotherRecipientName.setInactive();
				anotherRecipientNumber.setInactive();
			}
			else if(event.equals("uncheck")) {
				
				if(activeObjects[0])
				{
					date.setActive();
				}
				if(activeObjects[1])
				{
					timeList.setActive();
				}
				if(activeObjects[2])
				{
					anotherRecipient.setActive();
					anotherRecipientName.setActive();
					anotherRecipientNumber.setActive();
				}
			}
		}
		else if(sender == anotherRecipient) {
			if(!selfPickup.getChecked()) {
				if(event.equals("check")) {
					anotherRecipientName.setActive();
					anotherRecipientNumber.setActive();
				}
				else if(event.equals("uncheck")) {
					anotherRecipientName.setInactive();
					anotherRecipientNumber.setInactive();
				}
			}
		}
		else if(sender == date) {
			if(!date.text.isEmpty()) {
				timeList.setActive();
			}
		}
	}
}
