package Decorator;

public class OrangeCone implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;
    public OrangeCone(){

    }
    public OrangeCone(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents=iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        if (iceCreamConeConstituents!=null){
            return iceCreamConeConstituents.getCost()+25;
        }
        return 25;
    }

    @Override
    public String getDesc() {
        if (iceCreamConeConstituents!=null){
            return iceCreamConeConstituents.getDesc()+"+OrangeCone";
        }
        return "OrangeCone";
    }
}
