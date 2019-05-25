package factoryPattern.simpleFactory;

class PizzaStore {
    private SimplePizzaFactory pizzaFactory;

    PizzaStore(SimplePizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    Pizza orderPizza(String type){
        Pizza pizza = pizzaFactory.createPizza(type);
        System.out.println();
        if(pizza != null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        System.out.println();

        return pizza;
    }
}
