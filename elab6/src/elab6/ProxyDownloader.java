package elab6;

import java.util.ArrayList;

public class ProxyDownloader implements Downloader {
	private SimpleDownloader service;
	private ArrayList<String> cachedFiles;

	public ProxyDownloader(SimpleDownloader s) {
		cachedFiles = new ArrayList<>();
		service = s;
	}
	
	public void downloadFromURL(String url) {
		if(!cachedFiles.contains(url)) {
			service.downloadFromURL(url);
			cacheFile(url);
		}
		else {
			System.out.println(url + " has been already downloaded");
		}
	}
	
	private void cacheFile(String url) {
		cachedFiles.add(url);
		System.out.println("cached " + url);
	}
}
