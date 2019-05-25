package factoryPattern.simpleFactory;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing base for Cheese Pizza ...");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza ...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting cheese pizza into 4 halves ...");
    }

    @Override
    public void box() {
        System.out.println("Putting the cheese pizza into a box ...");
    }
}
