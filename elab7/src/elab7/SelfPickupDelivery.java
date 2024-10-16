package elab7;

public class SelfPickupDelivery implements Delivery {
	public void deliver(String address) {
		System.out.println("Self-pickup-delivered to " + address);
	}
}
