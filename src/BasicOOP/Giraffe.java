package BasicOOP;

public class Giraffe extends Creature{
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setWeight(int weight) {

    }

    @Override
    public int getWeight() {
        return 0;
    }

    @Override
    public void setSound(String name) {

    }

    @Override
    public String getSound() {
        return null;
    }
}
