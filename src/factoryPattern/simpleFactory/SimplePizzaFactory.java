package factoryPattern.simpleFactory;

class SimplePizzaFactory {
    Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }else if(type.equals("veggie")){
            pizza = new VeggiePizza();
        }else{
            System.out.println("Only cheese, veggie and pepperoni pizzas are available ...");
        }
        return pizza;
    }
}
