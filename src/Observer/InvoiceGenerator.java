package Observer;

public class InvoiceGenerator implements OrderPlacedSubscriber,OrderCancelledSubscriber{
    public InvoiceGenerator(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscribers(this);
    }
    @Override
    public void announcedOrderCancelled() {

    }

    @Override
    public void announcedOrderPlaced() {
        generateInvoice();
    }

    public void generateInvoice(){
        System.out.println("Generating Invoice");
    }
}
