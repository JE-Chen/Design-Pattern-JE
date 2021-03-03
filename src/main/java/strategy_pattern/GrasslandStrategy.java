package strategy_pattern;

public class GrasslandStrategy implements Strategy_Interface{

    @Override
    public void move() {
        System.out.println("Walk on Grassland");
    }
}
