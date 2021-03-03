package factory_pattern;

public class GrassFactory implements EnvFactory{
    @Override
    public Product spawn() {
        System.out.println("Spawn Grass");
        return new ProductGrass();
    }
}
