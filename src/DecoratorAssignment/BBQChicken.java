package DecoratorAssignment;

public class BBQChicken implements Pizza {
    @Override
    public int getCost() {
        return 200;
    }

    @Override
    public String getDesc() {
        return "BBQChicken";
    }
}
