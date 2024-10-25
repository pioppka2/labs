package elab8;

public abstract class Updater<T extends Entity> 
{
	protected T currEntity;
	protected T newEntity;
	
	public void update(T newEntity) {
	    setUpdateEntity(newEntity);
	    
	    boolean isValid = validate();
	    
	    makeSaveQuery();
	    
	    if(isValid) {
	    	onValidationSuccess();
	    }
	    else {
	    	onValidationFailed();
	    }
	}
	  
	protected void makeSaveQuery() 
	{
		System.out.println("have made and sent save query to api...");
	}
	  
	protected void setUpdateEntity(T entity) {
		newEntity = entity;
	}
	protected void setCurrEntity(T entity) {
		currEntity = entity;
	}
	
	protected abstract void onValidationFailed();
	protected abstract void onValidationSuccess();
	
	protected abstract boolean validate();
}
