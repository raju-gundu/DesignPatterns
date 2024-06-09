package Observer;

public class AnalyticsSender implements OrderCancelledSubscriber,OrderPlacedSubscriber{
    public AnalyticsSender(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscribers(this);
    }
    @Override
    public void announcedOrderCancelled() {

    }

    @Override
    public void announcedOrderPlaced() {
        System.out.println("Updating Analytics");

    }
}
