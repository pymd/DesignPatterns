package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class TestObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();

        List<Observer> observers = new ArrayList<>();
        for(int i=0; i<5; i++){
            observers.add(new Observer("Observer" + i));
        }

        for(int i=0; i<3; i++){
            subject.registerObserver(observers.get(i));
        }
        subject.event();

        for(int i=3; i<5; i++){
            subject.registerObserver(observers.get(i));
        }

        subject.event();
    }
}
