package creational.singleton;

public class LazyInitializedSingletonImpl {
    private static LazyInitializedSingletonImpl instance;
    private LazyInitializedSingletonImpl(){}
    public static LazyInitializedSingletonImpl getInstance() {
        if (instance == null)
            instance = new LazyInitializedSingletonImpl();
        return instance;
    }
}
