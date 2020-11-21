package ObserverPattern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Observer_TestTest {

    @Test
    void TestObserver(){
        Observer_Test observer_test = new Observer_Test();
        observer_test.register(observer_test.je);
        observer_test.register(observer_test.another);
        observer_test.notifyState(observer_test.je);
        observer_test.notifyState(observer_test.another);
    }

}