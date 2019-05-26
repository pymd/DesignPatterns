package factoryPattern.factoryMethodPattern;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        }else if(type.equals("veggie")){
            pizza = new NYStyleVeggiePizza();
        }else{
            System.out.println("Only cheese, veggie and pepperoni pizzas are available ...");
        }
        return pizza;
    }
}
