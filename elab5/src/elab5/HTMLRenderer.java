package elab5;

public class HTMLRenderer {
	private Page page;

	public HTMLRenderer(Page page) {
		this.page = page;
	}
	
	public void showHTMLPage() {
		System.out.println("'HTML page'");
		page.showPage();
	}
}
