package factory_pattern;

public class ProductLava implements Product{
    @Override
    public void getType() {
        System.out.println("Env is ProductGrass");
    }
}
