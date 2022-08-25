package strategy;

public class CreditCardPayment implements Payment {

	String name, ccNum, cvv, expiryDate;

	public CreditCardPayment(String name, String ccNum, String cvv, String expiryDate) {
		this.name = name;
		this.ccNum = ccNum;
		this.cvv = cvv;
		this.expiryDate = expiryDate;
	}

	public void pay(int amount) {
		System.out.println("카드 결제 : " + amount);
	}
}
