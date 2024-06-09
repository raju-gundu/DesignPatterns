package DecoratorAssignment;

public class Cheese implements Pizza {
    public Pizza pizza;
    public Cheese(){

    }
    public Cheese(Pizza Pizza){
        this.pizza = Pizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost()+80;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc()+" + Chesee";
    }
}
