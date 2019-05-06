package BasicOOP;

public class Monkey implements Living{
    private String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setWeight(double weight) {

    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void setHeight(double height) {

    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public void setSpeed(double speed) {

    }

    @Override
    public double getSpeed() {
        return 0;
    }

    @Override
    public void setSound(String sound) {

    }

    @Override
    public String getSound() {
        return null;
    }

    @Override
    public void setFavFood(String favFood) {

    }

    @Override
    public String getFavFood() {
        return null;
    }
}
