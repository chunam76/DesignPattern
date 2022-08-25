package strategy;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10000);
		Item item2 = new Item("5678",40000);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by credit card
		cart.pay("Jongdae Han", "1234567890123456", "786", "12/15");
	}

}
