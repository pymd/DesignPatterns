package factoryPattern.factoryMethodPattern;

public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("Fresh cut vegetables");
        toppings.add("Oregano");
    }
}
