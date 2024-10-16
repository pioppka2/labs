package elab7;

public class Main {

	public static void main(String[] args) {
		
		FoodDelivery service = new FoodDelivery(new OwnDelivery());
		service.deliverFoodTo("here");
		
		service.setDeliveryType(new CustomDelivery());
		service.deliverFoodTo("there");
		
		service.setDeliveryType(new SelfPickupDelivery());
		service.deliverFoodTo("somewhere in the middle");
	}
}
