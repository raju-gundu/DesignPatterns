package DecoratorAssignment;

public class Tomato implements Pizza {
    public Pizza Pizza;
    public Tomato(){

    }
    public Tomato(Pizza Pizza){
        this.Pizza = Pizza;
    }
    @Override
    public int getCost() {
        return Pizza.getCost()+30;
    }

    @Override
    public String getDesc() {
        return Pizza.getDesc()+ " + Tomato";
    }
}
