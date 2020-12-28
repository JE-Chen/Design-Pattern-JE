package observer_pattern.observer;

import observer_pattern.obserable.Observable;

public class Fans implements Observer {

    private Observable channel;
    private String name;

    public Fans(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Observable observable) {
        this.channel = observable;
        channel.register(this);
    }

    @Override
    public void unsubscribe() {
        channel.remove(this);
    }

    @Override
    public void update(String message) {
        System.out.println(name + " get " + message);
    }
}
