package factory_pattern;

public class WaterFactory implements EnvFactory{
    @Override
    public Product spawn() {
        System.out.println("Spawn Water");
        return new ProductWater();
    }
}
