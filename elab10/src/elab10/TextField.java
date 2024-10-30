package elab10;

import java.util.ArrayList;

public class TextField 
{
	Mediator m;
	Boolean isActive;
	String text;
	
	public TextField(Mediator mediator) {
		m = mediator;
		isActive = true;
		text = "";
	}
	
	public void setText(String text)
	{
		m.notifyObj(this, "textChanged");
		this.text = text;
	}
	public String getText(){
		return text;
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
