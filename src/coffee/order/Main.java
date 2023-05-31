package coffee.order;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add(new Order(1, "John"));
        coffeeOrderBoard.add(new Order(2, "Tom"));
        coffeeOrderBoard.add(new Order(3, "Jimmy"));
        coffeeOrderBoard.add(new Order(5, "Bob"));

        coffeeOrderBoard.draw();

        Order deliveredOrder = coffeeOrderBoard.deliver();
        System.out.println("Delivered order: " + deliveredOrder.getNumber() + " | " + deliveredOrder.getName());

        int orderNumberToDeliver = 27;
        Order specificOrder = coffeeOrderBoard.deliver(orderNumberToDeliver);
        if (specificOrder != null) {
            System.out.println("Delivered specific order: " + specificOrder.getNumber() + " | " + specificOrder.getName());
        } else {
            System.out.println("Order not found: " + orderNumberToDeliver);
        }

        coffeeOrderBoard.draw();

    }
}