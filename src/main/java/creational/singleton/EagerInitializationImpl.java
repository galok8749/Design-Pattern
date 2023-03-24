package creational.singleton;

public class EagerInitializationImpl {
    private static EagerInitializationImpl instance = new EagerInitializationImpl();
    private EagerInitializationImpl() {}

    public static EagerInitializationImpl getInstance() {
        return instance;
    }
}
