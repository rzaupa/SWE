package singleton;

public class LazyPrinter {
    private static LazyPrinter instance = null;

    private LazyPrinter() {
    }

    public static LazyPrinter getInstance() {
        // Lazy initialization but non thread-safe e non serializzabile (per la variabile statica)
        if (instance == null) {
            instance = new LazyPrinter();
        }
        return instance;
    }
}
