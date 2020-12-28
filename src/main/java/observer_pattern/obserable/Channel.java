package observer_pattern.obserable;

import observer_pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Observable{

    private List<Observer> observers = new ArrayList<>();

    public void changeState(String message){
        notifyAllWatcher(message);
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllWatcher(String message) {
        for(Observer registerObserver : observers)
            registerObserver.update(message);
    }
}
