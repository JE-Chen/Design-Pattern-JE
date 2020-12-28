package observer_pattern.obserable;

import observer_pattern.observer.Observer;

public interface Observable {

    public void register(Observer observer);

    public void remove(Observer observer);

    public void notifyAllWatcher(String message);

}
