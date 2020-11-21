package ObserverPattern;

public interface RegisterObserver {

    public void registerObserver(ObserverInterface observerInterface);

    public void removeObserver(ObserverInterface observerInterface);

    public void notifyObject(String messaage);
}
