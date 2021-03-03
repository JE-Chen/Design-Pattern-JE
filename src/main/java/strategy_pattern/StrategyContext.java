package strategy_pattern;


public class StrategyContext {
    Strategy_Interface strategy;

    public StrategyContext(Strategy_Interface strategy) {
        this.strategy = strategy;
    }

    public void move() {
        this.strategy.move();
    }

}
