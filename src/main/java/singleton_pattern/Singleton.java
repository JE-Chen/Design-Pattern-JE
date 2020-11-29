package singleton_pattern;

public class Singleton {

    private static Singleton Instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if(Instance==null){
            Instance = new Singleton();
        }
        return Instance;
    }

    @Override
    public String toString() {
        return "Singleton";
    }
}
