package factoryPattern.simpleFactory;

public class TestSimpleFactory {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(simplePizzaFactory);
        store.orderPizza("cheese");
        store.orderPizza("pepperoni");
        store.orderPizza("bacon");
    }
}
