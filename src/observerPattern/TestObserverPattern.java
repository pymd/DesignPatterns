package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class TestObserverPattern {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        List<ConcreteObserver> concreteObservers = new ArrayList<>();
        for(int i=0; i<5; i++){
            concreteObservers.add(new ConcreteObserver(subject));
        }
        subject.setData("Hello");

        // Assuming the observers would want to un-register themselves
        for(int i=3; i<5; i++){
            concreteObservers.get(i).getSubject().unregister(concreteObservers.get(i));
        }
        subject.setData("World");
    }
}
