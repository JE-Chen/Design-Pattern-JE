package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern implements RegisterObserver {

    private List<ObserverInterface> observerInterfaceList = new ArrayList<ObserverInterface>();
    private String name;

    public ObserverPattern(String name){
        this.name = name;
    }

    @Override
    public void registerObserver(ObserverInterface observerInterface) {
        this.observerInterfaceList.add(observerInterface);
    }

    @Override
    public void removeObserver(ObserverInterface observerInterface) {
        this.observerInterfaceList.remove(observerInterface);
    }

    @Override
    public void notifyObject(String messaage) {
        for (ObserverInterface observerInterface : observerInterfaceList)
            observerInterface.update(messaage);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
