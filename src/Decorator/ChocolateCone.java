package Decorator;

public class ChocolateCone implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;
    public ChocolateCone(){

    }
    public ChocolateCone(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents=iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        if (iceCreamConeConstituents!=null){
            return iceCreamConeConstituents.getCost()+30;
        }
        return 30;
    }

    @Override
    public String getDesc() {
        if (iceCreamConeConstituents!=null){
            return iceCreamConeConstituents.getDesc()+"+ChocolateCone";
        }
        return "ChocolateCone";
    }
}
