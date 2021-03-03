package factory_pattern;

public class ProductGrass implements Product{
    @Override
    public void getType() {
        System.out.println("Env is ProductGrass");
    }
}
