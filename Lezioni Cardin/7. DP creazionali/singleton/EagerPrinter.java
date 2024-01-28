package singleton;

public class EagerPrinter {
    private static EagerPrinter instance = new EagerPrinter(); //thread-safe ma non serializzabile (per la variabile statica)

    private EagerPrinter() {
    }

    public static EagerPrinter getInstance() {
        return instance;
    }
}
