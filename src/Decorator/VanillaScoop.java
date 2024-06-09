package Decorator;

public class VanillaScoop implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;
    public VanillaScoop(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents=iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost()+15;
    }

    @Override
    public String getDesc() {
        return iceCreamConeConstituents.getDesc()+"+VanillaScoop";
    }
}
