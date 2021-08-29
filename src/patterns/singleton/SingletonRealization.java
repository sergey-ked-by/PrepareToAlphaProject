package patterns.singleton;

public class SingletonRealization {
    private static SingletonRealization instance;

    private SingletonRealization() {}

    public static SingletonRealization getInstance() {
        if (instance == null) {
            instance = new SingletonRealization();
        }
        return instance;
    }
}
