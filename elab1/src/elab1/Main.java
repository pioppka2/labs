package elab1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Storage> storages = new ArrayList<Storage>();
		storages.add(LocalDiscStorage.getInstance());
		storages.add(AmazonS3Storage.getInstance());
		
		FileSystemController fsc1 = new FileSystemController();
		FileSystemController fsc2 = new FileSystemController();
		
		fsc1.setCurrStorage(storages.get(0));
		fsc2.setCurrStorage(storages.get(1));
		
		System.out.println("fsc1 storage - " + fsc1.getCurrStorage().getStorageName());
		System.out.println("fsc2 storage - " + fsc2.getCurrStorage().getStorageName());

	}

}
