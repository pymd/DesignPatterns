package factoryPattern.factoryMethodPattern;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        }else if(type.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }else{
            System.out.println("Only cheese, veggie and pepperoni pizzas are available ...");
        }
        return pizza;
    }
}
