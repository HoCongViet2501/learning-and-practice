package designPattern.Singleton;

public class LazyInitialization {

    private static final LazyInitialization INSTANCE = new LazyInitialization();

    private LazyInitialization() {
    }

    private static LazyInitialization getInstance() {
        return INSTANCE;
    }
}
