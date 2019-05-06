package BasicOOP;

public class WorkWithAnimals {
    public static void print(String s){
        System.out.println(s);
    }

    public static void speakAnimal(Animal animal){
        print("Animal says " + animal.getSound());
    }

    public static void main(String[] args){
        Dog fido = new Dog();

        fido.setName("Fido");
        print(fido.getName());

        fido.digHole();
        fido.setWeight(-10);

        // Polymorphism
        Animal doggy = new Dog();
        Animal kitty = new Cat();

        print("Doggy says: " + doggy.getSound());
        print("Kitty says: " + kitty.getSound());

        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        print("Doggy says: " + animals[0].getSound());
        print("Kitty says: " + animals[1].getSound());

        speakAnimal(animals[1]);

        // Calling a method ONLY in sub-class requires casting
        ((Dog) doggy).digHole();


        // Working With Abstract Classes
        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");
        print("Giraffe's name is: " + giraffe.getName());

        // Working With Interface Classes
        Monkey monkey = new Monkey();
        monkey.setName("Marcel");
        print("Monkey's name is: " + monkey.getName());
    }
}
