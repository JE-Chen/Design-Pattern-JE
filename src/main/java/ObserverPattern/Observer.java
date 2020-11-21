package ObserverPattern;

public class Observer implements ObserverInterface {
    @Override
    public void update(String messaage) {
        System.out.println(messaage);
    }
}
