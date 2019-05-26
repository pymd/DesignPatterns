package decoratorPattern;

public class TomatoSauce extends ToppingDecorator{
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Sauce");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 0.35;
    }
}
