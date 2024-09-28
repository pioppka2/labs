package elab5;

public class Main {

	public static void main(String[] args) {
		Product prod1 = new Product("prod1", "prod1 desc", "prod1 image", 1);
		Product prod2 = new Product("prod2", "prod2 desc", "prod2 image", 2);

		HTMLRenderer html = new HTMLRenderer(new ProductPage(prod1));
		XmlRenderer xml = new XmlRenderer(new ProductPage(prod1));
		JsonRenderer json1 = new JsonRenderer(new ProductPage(prod2));
		JsonRenderer json2 = new JsonRenderer(new SimplePage("test", "test content"));
		
		html.showHTMLPage();
		xml.showXmlPage();
		json1.showJsonPage();
		json2.showJsonPage();
	}

}
