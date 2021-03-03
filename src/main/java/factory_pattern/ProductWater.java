package factory_pattern;

public class ProductWater implements Product{
    @Override
    public void getType() {
        System.out.println("Env is ProductGrass");
    }
}
