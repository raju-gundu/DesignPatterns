package DecoratorAssignment;

public class Farmhouse implements Pizza {
    @Override
    public int getCost() {
        return 150;
    }

    @Override
    public String getDesc() {
        return "Farmhouse";
    }
}
