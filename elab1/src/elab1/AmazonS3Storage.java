package elab1;

public class AmazonS3Storage implements Storage {
	
	private static AmazonS3Storage instance;
	
	private AmazonS3Storage() 
	{
		
	}
	
	public static Storage getInstance() 
	{
		if(instance == null) {
			instance = new AmazonS3Storage();
		}
		return instance;
	}
	
	public String getStorageName() {
		return "Amazon S3";
	}
}
