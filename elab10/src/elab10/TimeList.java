package elab10;

import java.util.ArrayList;

public class TimeList 
{
	Mediator m;
	Boolean isActive;
	ArrayList<String> times;
	int chosenIndex;
	
	public TimeList(Mediator mediator) {
		chosenIndex = -1;
		m = mediator;
		isActive = true;
		times = new ArrayList<>();
		for(int i = 0; i < 5; i++) 
		{
			times.add("time " + (i + 1));
		}
	}
	
	public ArrayList<String> getTimes(){
		return times;
	}
	
	public void chooseTime(int index) {
		chosenIndex = Math.max(1, Math.min(5, index));
	}
	public int getChosenIndex() {
		return chosenIndex;
	}
	
	public void setActive() {
		isActive = true;
	}
	public void setInactive() {
		isActive = false;
	}
	
	public Boolean getActive() {
		return isActive;
	}
}
