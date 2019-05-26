package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{
    private String data;
    private List<Observer> observers;

    public ConcreteSubject() {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer){
        this.observers.add(observer);
    }

    public void unregister(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer observer: observers){
            observer.update(data);
        }
    }

    private void dataUpdated(){
        notifyObservers();
    }

    public void setData(String data){
        this.data = data;
        dataUpdated();
    }
}
