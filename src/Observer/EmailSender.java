package Observer;

public class EmailSender implements OrderPlacedSubscriber,OrderCancelledSubscriber{
    public EmailSender(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscribers(this);
    }
    @Override
    public void announcedOrderCancelled() {

    }

    @Override
    public void announcedOrderPlaced() {
        sendEmail();
    }

    public void sendEmail(){
        System.out.println("Sending Email");
    }
}
