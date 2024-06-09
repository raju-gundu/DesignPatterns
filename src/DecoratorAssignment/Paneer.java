package DecoratorAssignment;

public class Paneer implements Pizza {
    public Pizza pizza;
    public Paneer(){

    }
    public Paneer(Pizza Pizza){
        this.pizza = Pizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost()+60;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc()+" + Paneer";
    }
}
