package example.command.receiver;

public class Stock {
    private String name;
    private int quantity;

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.println("�ż� - �����: " + name + " / ����: " + this.quantity);
    }

    public void sell() {
        System.out.println("�ŵ� - �����: " + name + " / ����: " + this.quantity);
    }
}
