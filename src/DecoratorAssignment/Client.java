package DecoratorAssignment;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new Cheese(new Paneer(new Tomato(new BBQChicken())));
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDesc());
    }
}
