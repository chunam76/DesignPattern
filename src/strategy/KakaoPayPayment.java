package strategy;

public class KakaoPayPayment implements Payment {

	String id;
	String pw;

	public KakaoPayPayment(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public void pay(int amount) {
		System.out.println("카카오 결제 : " + amount);
	}
}
