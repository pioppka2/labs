package elab8;

public class ProductUpdater extends Updater<Product> 
{
	public ProductUpdater(Product p) {
		super.setCurrEntity(p);
	}
	
	protected void onValidationFailed() {
		System.out.println("*api code* -  operation failed");
		sendFailMessageToAdmin();
	}
	protected void onValidationSuccess() {
		System.out.println("*api code* -  operation succeeded");
	}
	
	private void sendFailMessageToAdmin() {
		System.out.println("'" + super.newEntity.getName() + " validation failed' sent to admin");
	}
	
	protected boolean validate() 
	{
		return !super.newEntity.getName().isEmpty() && !super.newEntity.getDesc().isEmpty();
	}
}
