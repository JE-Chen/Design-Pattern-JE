package strategy_pattern;

public class WaterStrategy implements Strategy_Interface{
    @Override
    public void move() {
        System.out.println("Walk on ProductWater");
    }
}
