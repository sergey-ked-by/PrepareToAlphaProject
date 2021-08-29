package patterns.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonRealization singleton = SingletonRealization.getInstance();
        SingletonWithENUM instance = SingletonWithENUM.INSTANCE;
    }
}
