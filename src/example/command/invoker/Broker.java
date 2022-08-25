package example.command.invoker;

import example.command.command.Order;

import java.util.*;

public class Broker {
    Queue<Order> orders = new LinkedList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrder() {
        while (!orders.isEmpty()) {
            orders.poll().execute();
        }
    }
}
