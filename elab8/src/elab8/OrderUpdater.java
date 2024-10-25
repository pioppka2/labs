package elab8;

public class OrderUpdater extends Updater<Order> 
{
	public OrderUpdater(Order o) {
		super.setCurrEntity(o);
	}
	
	protected void onValidationFailed() {
		System.out.println("*api code* -  operation failed");
		showJson();
	}
	protected void onValidationSuccess() {
		System.out.println("*api code* -  operation succeeded");
		showJson();
	}
	
	private void showJson() {
		System.out.println("*json view*");
	}
	
	protected boolean validate() 
	{
		return super.newEntity.getId() >= 0 && super.newEntity.getPrice() > 0;
	}
}
