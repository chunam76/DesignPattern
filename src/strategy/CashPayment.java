package strategy;

public class CashPayment implements Payment {
	public void pay(int amount) {
		System.out.println("현금 결제 : " + amount);
	}
}
