package DecoratorAssignment;

public class Pepperoni implements Pizza {

    @Override
    public int getCost() {
        return 180;
    }

    @Override
    public String getDesc() {
        return "Pepperoni";
    }
}
