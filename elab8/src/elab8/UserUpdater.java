package elab8;

public class UserUpdater extends Updater<User> 
{
	public UserUpdater(User u) {
		super.setCurrEntity(u);
	}
	
	protected void onValidationFailed() {
		System.out.println("*api code* -  operation failed");
	}
	protected void onValidationSuccess() {
		System.out.println("*api code* -  operation succeeded");
	}
	
	protected boolean validate() {
		if(!super.currEntity.getEmail().equals(super.newEntity.getEmail())) {
			System.out.println("User email change is prohibited");
			return false;
		}
		return true;
	}
}
