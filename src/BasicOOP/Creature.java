package BasicOOP;

abstract public class Creature {
    protected String name;
    protected String sound;
    protected int weight;

    public abstract void setName(String name);
    public abstract String getName();

    public abstract void setWeight(int weight);
    public abstract int getWeight();

    public abstract void setSound(String sound);
    public abstract String getSound();
}
