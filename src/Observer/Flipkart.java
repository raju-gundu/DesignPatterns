package Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance;
    private List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();

    public static Flipkart getInstance(){
        if (instance==null){
            instance = new Flipkart();
        }
        return instance;
    }

    void registerSubscribers(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    void unregisterSubscribers(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void orderPlaced(){
        for (OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers){
            orderPlacedSubscriber.announcedOrderPlaced();
        }
    }
}
