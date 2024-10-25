package elab8;

public class Product implements Entity {
	private String name;
	private String desc;
	
	public Product(String name, String desc) {
		this.name = name;
		this.desc = desc;
	}
	
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
}
