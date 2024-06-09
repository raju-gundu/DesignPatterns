package DecoratorAssignment;

public class Olive implements Pizza {
    public Pizza pizza;
    public Olive(){

    }
    public Olive(Pizza Pizza){
        this.pizza = Pizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc()+ " + Olive";
    }
}
