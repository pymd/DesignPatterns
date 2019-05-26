package observerPattern;

public class Observer {
    String name;

    public Observer(String name) {
        this.name = name;
    }

    public void execute(){
        System.out.println("Observer " + name + " called ...");
    }
}
