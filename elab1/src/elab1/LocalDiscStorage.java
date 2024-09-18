package elab1;

public class LocalDiscStorage implements Storage {

	private static LocalDiscStorage instance;
	
	private LocalDiscStorage() 
	{
		
	}
	
	public static Storage getInstance() 
	{
		if(instance == null) {
			instance = new LocalDiscStorage();
		}
		return instance;
	}
	
	public String getStorageName() {
		return "Local Disc";
	}
}
