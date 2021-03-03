package strategy_pattern;

import org.junit.jupiter.api.Test;

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
