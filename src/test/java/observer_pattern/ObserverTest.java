package observer_pattern;

import observer_pattern.obserable.Channel;
import observer_pattern.observer.Fans;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    void TestObserver(){
        Channel myChannel = new Channel();

        Fans a = new Fans("a");
        Fans b = new Fans("b");
        Fans c = new Fans("c");

        a.subscribe(myChannel);
        b.subscribe(myChannel);
        c.subscribe(myChannel);

        myChannel.changeState();
    }

}