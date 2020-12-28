package observer_pattern.observer;

import observer_pattern.obserable.Observable;

public interface Observer {

    public void subscribe(Observable observable);

    public void unsubscribe();

    public void update(String message);

}
