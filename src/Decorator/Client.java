package Decorator;

public class Client {
    public static void main(String[] args) {
//        IceCreamConeConstituents iceCreamConeConstituents = new VanillaScoop(new StrawberryScoop(new ChocolateCone()));
        IceCreamConeConstituents iceCreamConeConstituents = new OrangeCone();
        System.out.println(iceCreamConeConstituents.getDesc());
        System.out.println(iceCreamConeConstituents.getCost());
    }
}
