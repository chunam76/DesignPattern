package example.command.client;

import example.command.command.BuyStock;
import example.command.command.SellStock;
import example.command.command.Order;
import example.command.invoker.Broker;
import example.command.receiver.Stock;

public class CommandPatternDemo {

    public static void main(String[] args) {
        Order buyOrder = new BuyStock(new Stock("삼성전자", 10));
        Order sellOrder = new SellStock(new Stock("네이버", 5));

        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);

        broker.placeOrder();
    }
}
