package dp.strutturali.decorator;

import java.util.Collections;

public class BasePizza implements Pizza {
    public List<String> ingredients() {
        return Collections.singletonList("pasta");
    }
}
