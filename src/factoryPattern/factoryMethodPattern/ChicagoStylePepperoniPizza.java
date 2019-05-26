package factoryPattern.factoryMethodPattern;

public class ChicagoStylePepperoniPizza extends Pizza{
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Chilli Sauce";

        toppings.add("Large pieces of Fresh Pepperoni");
        toppings.add("Chilli Flakes");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
