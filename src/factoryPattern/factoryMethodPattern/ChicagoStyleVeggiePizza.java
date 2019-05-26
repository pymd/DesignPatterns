package factoryPattern.factoryMethodPattern;

public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("Fresh cut veggies");
        toppings.add("Grated cheese");
        toppings.add("Black pepper");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
