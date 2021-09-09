package src.main.java.gof.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        orderList.forEach(order -> {
            order.execute();
        });
        orderList.clear();
    }

}
