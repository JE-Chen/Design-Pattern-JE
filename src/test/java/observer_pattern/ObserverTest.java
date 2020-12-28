package observer_pattern;

import observer_pattern.obserable.Channel;
import observer_pattern.observer.Fans;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    void TestObserver(){
        Channel myChannel = new Channel();

        Fans person1 = new Fans("person1");
        Fans person2 = new Fans("person2");
        Fans person3 = new Fans("person3");

        person1.subscribe(myChannel);
        person2.subscribe(myChannel);
        person3.subscribe(myChannel);

        myChannel.changeState("Hello");
    }

}