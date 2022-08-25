package example.command.receiver;

public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("매수 - 종목명: " + name + " / 수량: " + this.quantity);
    }

    public void sell() {
        System.out.println("매도 - 종목명: " + name + " / 수량: " + this.quantity);
    }
}
