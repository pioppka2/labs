package elab10;

public class CheckBox 
{
	Mediator m;
	Boolean isActive;
	Boolean isChecked;
	
	public CheckBox(Mediator mediator) {
		m = mediator;
		isActive = true;
		isChecked = false;
	}
	
	public void check() {
		m.notifyObj(this, "check");
		isChecked = true;
	}
	public void uncheck() {
		m.notifyObj(this, "uncheck");
		isChecked = false;
	}
	public Boolean getChecked() {
		return isChecked;
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
