package elab8;

public class Main {

	public static void main(String[] args) {
		UserUpdater uUpd = new UserUpdater(new User("name1", "email1"));
		uUpd.update(new User("name2", "email2"));
		
		System.out.println();
		
		ProductUpdater pUpd = new ProductUpdater(new Product("pname1", "pdesc1"));
		pUpd.update(new Product("pname2", ""));
		
		System.out.println();
		
		OrderUpdater oUpd = new OrderUpdater(new Order(1, 200));
		oUpd.update(new Order(1, 300));
	}
}
