package elab1;

import java.util.ArrayList;

public class FileSystemController 
{
	private Storage currStorage;
	
	public FileSystemController() 
	{
		
	}
	
	public void setCurrStorage(Storage s) {
		currStorage = s;
	}
	public Storage getCurrStorage() {
		return currStorage;
	}
	
	public void createFile(String fileName) {
		if(currStorage != null) {
			//some logic
		}
		else {
			// error
		}
	}
	public void deleteFile(String fileName) {
		if(currStorage != null) {
			//some logic
		}
		else {
			// error
		}
	}
}
