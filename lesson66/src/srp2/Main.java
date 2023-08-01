package srp2;

import srp2.model.Order;
import srp2.model.OrderSaver;
import srp2.model.OrderView;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter order:");
        OrderSaver saver = new OrderSaver();
        OrderView view = new OrderView();
        Order order = view.inputFromConsole();
        saver.saveToJson(order);
    }
}
