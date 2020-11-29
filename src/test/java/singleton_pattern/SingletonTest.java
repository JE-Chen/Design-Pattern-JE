package singleton_pattern;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    public void singletonTest(){
        assertEquals(Singleton.getInstance(),"Singleton");
    }

}