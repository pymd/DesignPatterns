package BasicOOP;

public class Animal {
    private String name;
    private double height;
    private int weight;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0)
            this.height = height;
        else
            System.out.println("Height should be > 0");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0)
            this.weight = weight;
        else
            System.out.println("Weight should be > 0");
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}
