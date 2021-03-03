package strategyTest;

import org.junit.jupiter.api.Test;
import strategy_pattern.GrasslandStrategy;
import strategy_pattern.WaterStrategy;

public class StrategyTest {

    @Test
    public void testStrategy(){
        new GrasslandStrategy().move();
        new WaterStrategy().move();
    }
}
