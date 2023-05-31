package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orders;

    public CoffeeOrderBoard() {
        orders = new ArrayList<>();
    }

    public void add(Order order) {
        int nextNumber = orders.size() + 1;
        order = new Order(nextNumber, order.getName());
        orders.add(order);
    }

    public Order deliver() {
        if (orders.isEmpty()) {
            return null;
        }

        Order orderToDeliver = orders.get(0);
        orders.remove(0);
        return orderToDeliver;
    }

    public Order deliver(int number) {
        Order orderToDeliver = null;

        for (Order order : orders) {
            if (order.getNumber() == number) {
                orderToDeliver = order;
                break;
            }
        }

        if (orderToDeliver != null) {
            orders.remove(orderToDeliver);
        }

        return orderToDeliver;
    }

    public void draw() {
        System.out.println("================");
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order.getNumber() + " | " + order.getName());
        }
    }

}
