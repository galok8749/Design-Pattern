package creational.singleton;

public class StaticBlockSingletonImpl {
    private static StaticBlockSingletonImpl instance;
    private StaticBlockSingletonImpl(){}

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingletonImpl();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockSingletonImpl StaticBlockSingletonImpl() {
        return instance;
    }
}
