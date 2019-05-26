package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }

    public void unregisterObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void event(){
        System.out.println("Event emitted ...");
        for(Observer o: observers){
            o.execute();
        }
        System.out.println("All registered observers called ...");
    }
}
