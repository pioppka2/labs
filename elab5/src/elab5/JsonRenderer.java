package elab5;

public class JsonRenderer {
	private Page page;

	public JsonRenderer(Page page) {
		this.page = page;
	}
	
	public void showJsonPage() {
		System.out.println("'Json page'");
		page.showPage();
	}
}
