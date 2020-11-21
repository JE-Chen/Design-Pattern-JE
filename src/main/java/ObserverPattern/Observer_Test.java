package ObserverPattern;

public class Observer_Test {

    private Observer observer = new Observer();

    public ObserverPattern je = new ObserverPattern("je");

    public ObserverPattern another = new ObserverPattern("another");

    public void register(ObserverPattern observerPattern){
        observerPattern.registerObserver(observer);
    }

    public void notifyState(ObserverPattern observerPattern){
        observerPattern.notifyObject(observerPattern.toString()+":aa");
    }

}
