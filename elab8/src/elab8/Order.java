package elab8;

public class Order implements Entity {
	private int id;
	private double price;
	
	public Order(int id, double price) {
		this.id = id;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public double getPrice() {
		return price;
	}
	
}
