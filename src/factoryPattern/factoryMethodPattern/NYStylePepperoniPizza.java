package factoryPattern.factoryMethodPattern;

public class NYStylePepperoniPizza extends Pizza{
    public NYStylePepperoniPizza(){
        name = "NY Style Pepperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Chilli Sauce";

        toppings.add("Fresh Pepperoni");
    }
}
