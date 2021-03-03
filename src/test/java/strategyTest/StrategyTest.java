package strategyTest;

import org.junit.jupiter.api.Test;
import strategy_pattern.StrategyContext;
import strategy_pattern.GrasslandStrategy;
import strategy_pattern.WaterStrategy;

public class StrategyTest {

    @Test
    public void testStrategy(){
        StrategyContext strategyContext;
        strategyContext = new StrategyContext(new GrasslandStrategy());
        strategyContext.move();
        strategyContext = new StrategyContext(new WaterStrategy());
        strategyContext.move();
    }
}
