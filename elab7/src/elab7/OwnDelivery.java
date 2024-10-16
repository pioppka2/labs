package elab7;

public class OwnDelivery implements Delivery {
	public void deliver(String address) {
		System.out.println("Own-delivered to " + address);
	}
}
