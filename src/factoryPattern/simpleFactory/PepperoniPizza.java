package factoryPattern.simpleFactory;

public class PepperoniPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing base for Pepperoni Pizza ...");
    }

    @Override
    public void bake() {
        System.out.println("Baking pepperoni pizza ...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pepperoni pizza into 4 halves ...");
    }

    @Override
    public void box() {
        System.out.println("Putting the pepperoni pizza into a box ...");
    }
}
