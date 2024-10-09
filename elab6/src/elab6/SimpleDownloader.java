package elab6;

public class SimpleDownloader implements Downloader 
{
	public void downloadFromURL(String url) {
		System.out.println("downloaded from " + url);
	}
}
