package factory_pattern;

public class LavaFactory implements EnvFactory{
    @Override
    public Product spawn() {
        System.out.println("Spawn Lava");
        return new ProductLava();
    }
}
