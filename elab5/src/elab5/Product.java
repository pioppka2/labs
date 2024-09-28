package elab5;

public class Product {

	private String productName;
	private String productDescription;
	private String productImagePath;
	private int productId;
	
	public Product(String productName, String productDescription, 
			String productImagePath, int productId) {
		this.productName = productName;
		this.productDescription = productDescription;
		this.productImagePath = productImagePath;
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public String getProductImagePath() {
		return productImagePath;
	}
	public int getProductId() {
		return productId;
	}
}
