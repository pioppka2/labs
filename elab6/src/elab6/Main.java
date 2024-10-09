package elab6;

public class Main {

	public static void main(String[] args) {
		Downloader downloader = new SimpleDownloader();
		downloader.downloadFromURL("test1");
		
		downloader = new ProxyDownloader(new SimpleDownloader());
		downloader.downloadFromURL("test1");
		downloader.downloadFromURL("test1");
	}
}
