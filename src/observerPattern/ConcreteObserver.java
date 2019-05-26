package observerPattern;

public class ConcreteObserver implements Observer{
    private String data;
    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public Subject getSubject(){
        return subject;
    }

    @Override
    public void update(String data) {
        this.data = data;
        display();
    }

    public void display(){
        System.out.println("ConcreteObserver data updated to: " + data);
    }
}
