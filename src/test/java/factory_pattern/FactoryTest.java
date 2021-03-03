package factory_pattern;

import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    public void testFactory(){
        EnvFactory envFactory;
        envFactory = new GrassFactory();
        envFactory.spawn();
        envFactory = new LavaFactory();
        envFactory.spawn();
        envFactory = new WaterFactory();
        envFactory.spawn();
    }
}
