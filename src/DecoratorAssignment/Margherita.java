package DecoratorAssignment;

public class Margherita implements Pizza {
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDesc() {
        return "Margherita";
    }
}
