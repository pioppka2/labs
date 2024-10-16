package elab7;

public class FoodDelivery{

	Delivery deliveryType;
	
	public FoodDelivery(Delivery deliveryType) {
		this.deliveryType = deliveryType;
	}
	
	public void setDeliveryType(Delivery deliveryType) {
		this.deliveryType = deliveryType;
	}
	
	public void deliverFoodTo(String address) 
	{
		deliveryType.deliver(address);
	}
}
