package creational.singleton;

public class ThreadSafeSingletonImpl {
    private static ThreadSafeSingletonImpl instance;
    ThreadSafeSingletonImpl(){}
    public static ThreadSafeSingletonImpl getInstanceUsingDoubleLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingletonImpl.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingletonImpl();
                }
            }
        }
        return instance;
    }
//    public static synchronized ThreadSafeSingletonImpl getInstance() {
//        if (instance == null) {
//            instance = new ThreadSafeSingletonImpl();
//        }
//        return instance;
//    }
}
