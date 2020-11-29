package singleton_pattern;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    public void SingletonTest(){
        assertEquals(Singleton.getInstance(),"Singleton");
    }

}