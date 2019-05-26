package decoratorPattern;

public class PizzaMaker {
    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients of my pizza: " + basicPizza.getDescription());
        System.out.println("Cost of my pizza: " + basicPizza.getCost());
    }
}
