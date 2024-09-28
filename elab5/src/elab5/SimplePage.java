package elab5;

public class SimplePage implements Page {
	private String title;
	private String content;
	
	public SimplePage(String title, String content){
		this.title = title;
		this.content = content;
	}
	
	public void showPage() {
		System.out.println(title);
		System.out.println(content + "\n");
	}
}
