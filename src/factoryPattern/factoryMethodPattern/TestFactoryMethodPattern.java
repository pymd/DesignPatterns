package factoryPattern.factoryMethodPattern;

public class TestFactoryMethodPattern {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        store.orderPizza("cheese");

        System.out.println();
        PizzaStore store2 = new ChicagoPizzaStore();
        store2.orderPizza("veggie");
    }
}
