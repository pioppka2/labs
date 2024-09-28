package elab5;

public class XmlRenderer {
	private Page page;

	public XmlRenderer(Page page) {
		this.page = page;
	}
	
	public void showXmlPage() {
		System.out.println("'XML page'");
		page.showPage();
	}
}
