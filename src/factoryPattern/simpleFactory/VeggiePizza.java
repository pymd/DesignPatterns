package factoryPattern.simpleFactory;

public class VeggiePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing base for Veggie Pizza ...");
    }

    @Override
    public void bake() {
        System.out.println("Baking veggie pizza ...");
    }

    @Override
    public void cut() {
        System.out.println("Cutting veggie pizza into 4 halves ...");
    }

    @Override
    public void box() {
        System.out.println("Putting the veggie pizza into a box ...");
    }
}
