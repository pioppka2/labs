package elab5;

public class ProductPage implements Page {

	private Product product;
	
	public ProductPage(Product product){
		this.product = product;
	}
	
	public void showPage() {
		System.out.println(product.getProductId());
		System.out.println(product.getProductName());
		System.out.println(product.getProductImagePath());
		System.out.println(product.getProductDescription() + "\n");
	}
}
