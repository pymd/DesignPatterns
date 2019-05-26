package observerPattern;

public interface Subject {
    public void registerObserver(Observer observer);
    public void unregister(Observer observer);
    public void notifyObservers();
}
