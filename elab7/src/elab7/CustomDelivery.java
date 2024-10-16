package elab7;

public class CustomDelivery implements Delivery
{
	public void deliver(String address) {
		System.out.println("Custom-delivered to " + address);
	}
}
