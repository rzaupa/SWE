package mvc;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    protected void notifyObservers() {
        observers.forEach(Observer::update);
    }

    public abstract <T> T getState();

}
