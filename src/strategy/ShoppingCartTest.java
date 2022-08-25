package strategy;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10000);
		Item item2 = new Item("5678",40000);
		
		cart.addItem(item1);
		cart.addItem(item2);

		cart.setPayment(new CreditCardPayment("Jongdae Han", "1234567890123456", "786", "12/15"));
		cart.pay(20000);

		cart.setPayment(new KakaoPayPayment("joim", "1q2w3e4r5t"));
		cart.pay(20000);

		cart.setPayment(new CashPayment());
		cart.pay(10000);
	}

}
